package tcp3;

import java.io.BufferedReader;
import java.io.PrintWriter;
import java.net.Socket;



public class ClientMainProgram extends Thread {
	
	BufferedReader br;
	PrintWriter pw;
	Socket socket;
	
	public ClientMainProgram(BufferedReader br, PrintWriter pw, Socket socket) {
		// TODO Auto-generated constructor stub
		this.br = br;
		this.pw = pw;
		this.socket = socket;
	}
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		super.run();
	}
}
