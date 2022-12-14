package tcp2;

import java.net.ServerSocket;
import java.net.Socket;

public class Server {
	public static void main(String arg[]){
        //접속한 Client와 통신하기 위한 Socket
           
        //채팅방에 접속해 있는 Client 관리 객체                
        User user = new User();        
        //Client 접속을 받기 위한 ServerSocket            
                      
        
        int count = 0;                            
        Thread thread[]= new Thread[10];     
        Socket socket = null;
        try(	ServerSocket server_socket = new ServerSocket(8087);	) {
            //Server의 메인쓰레드는 게속해서 사용자의 접속을 받음
            while(true)
            {
                socket = server_socket.accept();

                thread[count] = new Thread(new Receiver(user,socket));
                thread[count].start();
                count++;
            }
        }catch(Exception e) {};
    }
}
