package useJSON;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.nio.charset.Charset;

import org.json.JSONArray;
import org.json.JSONObject;

public class JSONReader {
	private URL url;
	
	public JSONReader(String url) throws MalformedURLException {
		this.url = new URL(url);
	}
	
	public JSONObject readJSONFromUrl() throws IOException {
		InputStream input = this.url.openStream();
		try {
			BufferedReader reader = new BufferedReader(new InputStreamReader(input, Charset.forName("UTF-8")));
			StringBuilder str = new StringBuilder();
			int charTemp;
			do {
				charTemp = reader.read();
				str.append((char) charTemp);
			} while (charTemp != -1);
			JSONObject json = new JSONObject(str.toString());
			return json;
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		} finally {
			input.close();
		}
	}
	
	public JSONArray readJSONArrayFromURL() throws IOException {
		InputStream input = this.url.openStream();
		try {
			BufferedReader reader = new BufferedReader(new InputStreamReader(input, Charset.forName("UTF-8")));
			StringBuilder str = new StringBuilder();
			int charTemp;
			do {
				charTemp = reader.read();
				str.append((char) charTemp);
			} while (charTemp != -1);
			JSONArray json = new JSONArray(str.toString());
			return json;
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		} finally {
			input.close();
		}
	}
}
