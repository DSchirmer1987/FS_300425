package useJSON;

import org.json.JSONArray;
import org.json.JSONObject;

public class JSONParser {
	private JSONObject jso;
	private JSONArray jsa;
	
	public JSONParser(JSONObject jso) {
		this.jso = jso;
	}
	
	public JSONParser(JSONArray jsa) {
		this.jsa = jsa;
		for(int i = 0; i < this.jsa.length(); i++) {
			JSONObject obj =  this.jsa.getJSONObject(i);
			System.out.println(obj.toString());
			System.out.println(obj.getJSONObject("location").toString());
			System.out.println(obj.getJSONObject("location").getJSONObject("street").toString());
		}
	}
	
	public void parseJSONObject() {
		String ip = this.jso.getString("ip");
		System.out.println(ip);
	}
}
