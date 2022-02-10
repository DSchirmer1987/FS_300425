package sockets;

import sockets.client.MulClient;
import sockets.server.MulServer;

public class ServerClientTest {

	public static void main(String[] args) throws InterruptedException {
		MulServer mul = new MulServer(3425);
		Thread server = new Thread(new Runnable() { 
			@Override
			public void run() {
				mul.starte();
			}
		});
		server.start();
		MulClient mc = new MulClient(3425, "5", "10");
		mc = new MulClient(3425, "1245", "10532");
	}

}
