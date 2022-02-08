package url;

import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;

public class URLEncoding {

	public static void main(String[] args) throws UnsupportedEncodingException {
		String utf = StandardCharsets.UTF_8.name();
		System.out.println(URLEncoder.encode("L e e r z eichen", utf));
		System.out.println(URLEncoder.encode("20%Prozent%", utf));
		System.out.println(URLEncoder.encode("a=b=c", utf));
		
		System.out.println(URLDecoder.decode("hat%2Bein%2BPlus", utf));
	}

}
