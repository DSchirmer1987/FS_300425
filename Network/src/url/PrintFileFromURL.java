package url;

import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

public class PrintFileFromURL {

	public static void main(String[] args) {
		try {
			URL url = new URL("http://www.tutego.com/javabuch/aufgaben/bond.txt");
			InputStream is = url.openStream();
			Scanner scanner = new Scanner(is, StandardCharsets.UTF_8.name());
			System.out.println( scanner.useDelimiter("\\Z").next() );
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
