package url;

import java.net.MalformedURLException;
import java.net.URL;

public class URLInformation {

	public static void main(String[] args) {
		try {
			URL url = new URL("http://www.tutego.com:80/java/faq.html?key=val#lang");
			
			System.out.println(url.getProtocol());
			System.out.println(url.getHost());
			System.out.println(url.getPort());
			System.out.println(url.getFile());
			System.out.println(url.getPath());
			System.out.println(url.getQuery());
			System.out.println(url.getRef());
		} catch (MalformedURLException e) {
			e.printStackTrace();
		} 
	}

}
