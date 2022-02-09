package ipAdressen;

import java.io.IOException;
import java.net.InetAddress;
import java.net.UnknownHostException;

public class MyDNS {

	public static void main(String[] args) throws IOException {
		InetAddress inet = InetAddress.getByName("www.randomname.de");
		System.out.println(inet.getCanonicalHostName());
		System.out.println(inet.getHostAddress());
		System.out.println(inet.getHostName());
		System.out.println(inet.toString());
		
		inet = InetAddress.getByName("193.99.144.71");
		System.out.println(inet.getHostName());
		
		//Lebenszeichen
		System.out.println(inet.isReachable(2000));
		System.out.println(InetAddress.getByName("193.99.144.71").isReachable(2000));
		
		// Lokalhost
		System.out.println(InetAddress.getLocalHost());
	}
}
