package useJSON;

import java.io.IOException;
import java.net.MalformedURLException;

import org.json.JSONArray;
import org.json.JSONObject;

public class ReadJSONUrl {

	public static void main(String[] args) {
		String urlArray = "https://randomname.de/?format=json&count=10";
		String url = "http://ip.jsontest.com/";
		try {
			JSONReader reader = new JSONReader(url);
			JSONObject myJSON = reader.readJSONFromUrl();
			System.out.println(myJSON.toString());
			JSONReader readerArray = new JSONReader(urlArray);
			JSONArray myJSONArray = readerArray.readJSONArrayFromURL();
			System.out.println(myJSONArray.toString());
			
			JSONParser jsoP = new JSONParser(myJSON);
			jsoP.parseJSONObject();
			
			JSONParser jsoP2 = new JSONParser(myJSONArray);
		} catch (MalformedURLException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
