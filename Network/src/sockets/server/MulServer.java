package sockets.server;

import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.io.Writer;
import java.math.BigInteger;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class MulServer {
	private int port;
	
	public MulServer(int port) {
		this.port = port;
		try(ServerSocket server = new ServerSocket(this.port)){
			while(true) {
				try(Socket client = server.accept()){
					this.handleConnection(client);
				} catch (IOException e) {
					System.err.println("Fehler beim Clienthandling");
				}
			}
		} catch (IOException e) {
			System.err.println("Fehler im ServerSocket");
			e.printStackTrace();
		}
	}
	
	private void handleConnection(Socket client) {
		try(Scanner in = new Scanner(client.getInputStream(), "UTF-8"); 
			Writer osw = new OutputStreamWriter(client.getOutputStream(), "UTF-8");
			PrintWriter out = new PrintWriter(osw, true)){
			
			String factor1 = in.nextLine();
			String factor2 = in.nextLine();
			out.println(new BigInteger(factor1).multiply(new BigInteger(factor2)));
		} catch (IOException e) {
			System.err.println("Fehler in handleConnection");
			e.printStackTrace();
		}
	}
}
