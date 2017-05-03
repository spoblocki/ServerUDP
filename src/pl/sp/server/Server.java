package pl.sp.server;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;

import pl.sp.server.GUI;

public class Server {

	final int LOCAL_PORT = 55555;
	byte[] buffer = new byte[1500];
	
	public String text;

	String listen() {
		DatagramSocket ds = null;
		try {
			ds = new DatagramSocket(LOCAL_PORT);
		} catch (SocketException e) {
			e.printStackTrace();
		}

		DatagramPacket dp = new DatagramPacket(buffer, buffer.length);
		try {
			ds.receive(dp);
			text = new String(buffer, 0, buffer.length);

		} catch (IOException e) {
			e.printStackTrace();
		}
		ds.close();
		return text;

	}

	public String getText() {
		return text;
	}
	
	

}
