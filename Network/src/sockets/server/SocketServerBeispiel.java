package sockets.server;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class SocketServerBeispiel {

	public static void main(String[] args) {
		try(ServerSocket server = new ServerSocket(12345)){
			System.out.println("Gestartet");
			System.out.println(server.getInetAddress());
			System.out.println(server.getLocalSocketAddress());
			server.setSoTimeout(60 * 1000); // Timeout nach 1 Minute
			Socket client = server.accept();
			System.out.println("Client accepted");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
