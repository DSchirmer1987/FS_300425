package ipAdressen;

import java.net.InetAddress;
import java.net.NetworkInterface;
import java.net.SocketException;
import java.util.Collections;

public class NetworkInterfaceLocalIP {
	static int n = 0;
	public static void main(String[] args) throws SocketException {
//		int n = 0;
		Collections.list(NetworkInterface.getNetworkInterfaces()).forEach(ni -> {
			System.out.println("NetworkInterface " + n++ + ": " + ni.getDisplayName());
			for(InetAddress iadress : Collections.list(ni.getInetAddresses())) {
				System.out.println("CanonicalHostName: " + iadress.getCanonicalHostName());
				System.out.println("IP:                " + iadress.getHostAddress());
				System.out.println("Loopback?          " + iadress.isLoopbackAddress());
				System.out.println("SiteLocal?         " + iadress.isSiteLocalAddress());
			}
		});
	}
}
