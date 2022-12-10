package server;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.sql.ClientInfoStatus;
import java.util.List;
import java.util.Vector;
 
//채팅서버 프로그램
//=> 클라이언트에서 보내온 메세지를 전달받아 접속될 모든 클라이언트에게 전달하는 기능
// => 클라이언트와 연결된 소켓은 새로운 스레드를 이용하여 독립적으로 동작되도록 구현
public class ServerApp {
    
    //현재 접속된 모든 클라이언트의 소켓정보를 저장하기 위한 Collection 필드
    private List<SocketThread> clientList;
    
    public ServerApp() {
        ServerSocket chatServer = null;
        
        try {
            
            chatServer = new ServerSocket(6000);
            System.out.println("[message] chatting server is runinng...");
            
            clientList = new Vector<SocketThread>();
            
            while(true) {
                try {
                    Socket clientSocket = chatServer.accept();//접속되는 곳
                    
                    System.out.println("[connect log] "+ clientSocket.getInetAddress().getHostAddress() + " 의 컴퓨터에서 접속하였습니다.");
                    
                    //소켓정보를 저장한 스레드 인스턴스를 만들어 준다.
                    SocketThread st = new SocketThread(clientSocket);
                    
                    //콜렉션 필드에 스레드 인스턴스 추가
                    clientList.add(st);
                    
                    //Thread 인스턴스로 새로운 스레드를 생성하여 동작
                    //=> run() 메소드의 명령실행
                    st.start();
                    
                } catch (IOException e) {
                    System.out.println("[error log] 클라이언트의 접속 관련 문제가 발생하였습니다.");
                }
                
            }
            
        } catch (IOException e) {
            System.out.println("[error] 서버가 정상적으로 실행되지 않습니다.");
        }
    }
    
    public static void main(String[] args) {
        new ServerApp();
        
    }
    
    //현재 접속된 모든 클라이언트에게 메세지를 전달하는 메소드
    public void sendMessage(String message) {
        for(SocketThread st : clientList) {
            //클라이언트와 연결된 소켓의 출력스트림으로 메세지를 ★연결되어 있는 모든 클라이언트에게★ 전달
        	
            st.out.println(message);
        }
    }
    
  //클라이언트와 연결된 소켓을 이용하여 입출력 기능을 제공하기 위한 클래스
  //=> 독립적인 입력과 출력 기능을 제공하기 위해 스레드를 생성하여 동작하도록 함

  public class SocketThread extends Thread{
      //클라이언트와 연결된 소켓정보를 저장하기 위한 필드
      private Socket socket;//값을 계속 유지하기 위해 정적필드에 위치
      //클라이언트가 보내온 메세지를 전달받기위한 입력스트림을 저장하기 위한 필드
      private BufferedReader in;
      //클라이언트에게 메세지를 전달하기 위한 출력스트림을 저장하기 위한 필드
      private PrintWriter out;
      
      //클라이언트와 연결된 소켓정보를 받아온다. -> 벡터에 담기 위해서
      public SocketThread(Socket socket) {
          this.socket = socket;//매개변수로 받아온 소켓을 내것으로 하겠다!
      }
      
      //새로운 스레드가 실행하기 위한 명령을 작성 \
      //=> 메세지를 보내거나 받으면 됨
      //==> 메세지를 전달받아 모든 클라이언트에게 전달하는 기능을 제공
      @Override
      public void run() {
          //대화명을 저장하기 위한 변수를 선언
          String aliasName = ""; 
          
          try {
              //소켓의 입력스트림을 제공받아 문자열을 전달할 수 있는 입력스트림으로 확장
              in = new BufferedReader(new InputStreamReader(socket.getInputStream())); 
              
              //소켓의 출력스트림을 제공받아 문자열을 전달 할 수 있는 출력스트림으로 확장
              //=> printWriter(outputStream ot, boolean autoflush) : boolean매개변수에 true를 전달 할 경우 자동으로flush가된다.
              out = new PrintWriter(socket.getOutputStream(), true);//true값을 주면 자동으로 flush가 된다.
              
              //클라이언트에서 입력되어 전달된 대화명을 반환받아 저장
              //=>스레드 일시중지(클라이언트가 대화명을 먼저 보내야함)
              aliasName = in.readLine();
              
              //현재 접속된 ★모든★ 클라이언트에게 입장 메세지를 전달
              sendMessage("[" + aliasName + "] 님이 입장하셨습니다!!!");
              
              //클라이언트에서 보내온 메세지를 현재 접속된 모든 클라이언트에게 전달하면 됨
              //=> 클라이언트의 접속이 끊길때까지 반복처리하면 된다.
              //=> 클라이언트가 접속을 종료할 경우 IOException이 발생
              while(true) {
                  sendMessage("[" + aliasName + "] : " + in.readLine());
              }
              
          } catch (IOException e) {
              //클라이언트가 접속을 종료한 경우 실행될 명령
              //=> 클라이언트가 접속을 종료할 경우 IOException이 발생
              //현재 접속된 모든 클라이언트에게 퇴장메세지를 전달
              sendMessage("[" + aliasName + "] 님이 나가셨습니다!!!");
              clientList.remove(this);//나를 지워라!!
              System.out.println("[connect log] "+ socket.getInetAddress().getHostAddress() + " 의 컴퓨터에서 접속을 종료하였습니다.");
          }
          
      }
  }
}