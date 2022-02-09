package url;

import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLEncoder;
import java.util.Scanner;

public class POSTRequest {
	public static void main(String[] args) throws IOException {
		String body = "param1=" + URLEncoder.encode("value1", "UTF-8");
		body += "&";
		body += "param2=" + URLEncoder.encode("value2", "UTF-8");
		
		URL url = new URL("https://ptsv2.com/t/Comcave/post");
		HttpURLConnection connection = (HttpURLConnection) url.openConnection();
		connection.setRequestMethod("POST");
		connection.setDoInput(true);
		connection.setDoOutput(true);
		connection.setUseCaches(false);
		connection.setRequestProperty("Content-Type", "application/x-www-form-urlencoded");
		connection.setRequestProperty("Content-Length", String.valueOf(body.length()));
		
		Writer writer = new OutputStreamWriter(connection.getOutputStream());
		writer.write(body);
		writer.flush();
		
		Scanner scanner = new Scanner(connection.getInputStream());
		while(scanner.hasNextLine()) {
			System.out.println(scanner.nextLine());
		}
	}
}
