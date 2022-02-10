package sockets;

import java.io.IOException;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;

public class SocketTest {
	public static void main(String[] args) {
		System.err.println("Dies ist ein fehler!");
		try(Socket socket = new Socket("192.168.226.132", 12345)){
//			Socket socket2 = new Socket(socket.getInetAddress(), socket.getPort());
			
			System.out.println(InetAddress.getLocalHost());
			System.out.println(socket.getLocalAddress());
			System.out.println(socket.getLocalPort());
			System.out.println(socket.getRemoteSocketAddress());
			System.out.println(socket.getPort());
			System.out.println("Verbindung hergestellt");
		} catch (UnknownHostException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
