package tcp3;

import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.Socket;
import java.nio.charset.StandardCharsets;

public class MainProgram extends Thread{

	private BufferedReader br;
	private PrintWriter pw;
	private BufferedOutputStream bos;
	private Socket socket;
	private BufferedWriter fw;
	
	public MainProgram(Socket socket) throws IOException {
		this.br = new BufferedReader(new InputStreamReader(socket.getInputStream(), StandardCharsets.UTF_8));
		this.pw = new PrintWriter(new OutputStreamWriter(socket.getOutputStream(), StandardCharsets.UTF_8));
		this.bos = new BufferedOutputStream(socket.getOutputStream());
	}
	
	@Override
	public void run() {
		try {
			String line = null;
			String ip = "";
			while(true) {
				line = br.readLine();
				pw.print(line);
				pw.flush();
			}
			
			
			
		} catch (Exception e) {
			// TODO: handle exception
		}
	}

}
