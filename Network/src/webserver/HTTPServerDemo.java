package webserver;

import java.awt.Desktop;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.net.HttpURLConnection;
import java.net.InetSocketAddress;
import java.net.URI;
import java.nio.charset.StandardCharsets;
import java.util.logging.Logger;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import com.sun.net.httpserver.*;

public class HTTPServerDemo {

	public static void main(String[] args) throws IOException {
		HttpServer server = HttpServer.create(new InetSocketAddress(8080), 0);
		server.createContext("/", new ChartHandler());
		server.start();
		Desktop.getDesktop().browse(URI.create("http://localhost:" + server.getAddress().getPort()));
	}
}

class ChartHandler implements HttpHandler{

	@Override
	public void handle(HttpExchange exchange) throws IOException {
		exchange.getResponseHeaders().add("Content-type", "text/html");
		exchange.sendResponseHeaders(HttpURLConnection.HTTP_OK, 0);
		
		try(OutputStream os = exchange.getResponseBody();
			Writer writer = new OutputStreamWriter(os, StandardCharsets.UTF_8)){
			
			Logger.getGlobal().info(exchange.getRequestURI().toString());
			
			writer.write("<svg><polyline fill=\"none\" stroke=\"black\" points =\"");
			writer.write(IntStream.range(0, 800).mapToObj(i -> i + "," + (int)(Math.random()*100)).collect(Collectors.joining(" ")));
			writer.write("\"/></svg>");
		}
	}
}
