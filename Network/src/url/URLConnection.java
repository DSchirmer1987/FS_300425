package url;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.time.Instant;

public class URLConnection {

	public static void main(String[] args) throws IOException {
		URL url = new URL("http://www.tutego.com/index.html");
		java.net.URLConnection con = url.openConnection();
		System.out.println("Date            :" + Instant.ofEpochMilli(con.getDate()));
		System.out.println("Last Modified   :" + Instant.ofEpochMilli(con.getLastModified()));
		System.out.println("Content length  :" + con.getContentLength());
		System.out.println("Content type    :" + con.getContentType());
	}

}
