package tcp3;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class EchoDataServer implements Runnable{
	
	public static void main(String[] args) throws Exception {
		DatagramSocket socket = new DatagramSocket(4445);
		System.out.println("Server Start");
		byte[] buf = new byte[1024];
		DatagramPacket packet = new DatagramPacket(buf, buf.length);
		socket.receive(packet);
		String received  = new String(packet.getData(), 0, packet.getLength());
		System.out.println("Server has message  :: " + received);
		InetAddress address = packet.getAddress();
		int port = packet.getPort();
		packet = new DatagramPacket(buf, buf.length, address, port);
		socket.send(packet);
		
		System.out.println("Server End");
		socket.close();
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		try {
			
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
}
