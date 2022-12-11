package tcp3;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;
import java.nio.charset.StandardCharsets;

public class EchoClient {
	


	
	public EchoClient() {		}
	
	public void network() {
		try (	Socket socket = new Socket("59.15.79.194", 9400);
				BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream(),StandardCharsets.UTF_8));
				PrintWriter pw = new PrintWriter(new OutputStreamWriter(socket.getOutputStream(),StandardCharsets.UTF_8));
				BufferedInputStream bir = new BufferedInputStream(socket.getInputStream()); ){
			ClientMainProgram client = new ClientMainProgram(br, pw, socket);
			client.start();

		} catch (Exception e) {
			// TODO: handle exception
		}
	}
}
