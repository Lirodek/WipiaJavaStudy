package tcp3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter; 
import java.net.ServerSocket;
import java.net.Socket;

public class EchoServer {
	
	private ServerSocket serverSocket;
	
	public EchoServer(){
		try {
			serverSocket = new ServerSocket(9500);
			System.out.println("Server Start");
			while(true) {
				/*
				 * 		소켓 
				 */
				Socket socket = serverSocket.accept();
				MainProgram program = new MainProgram(socket);
				program.start();
			}
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {	new EchoServer();	}
}
