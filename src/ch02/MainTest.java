package ch02;

import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.util.Base64;
import java.util.Base64.Decoder;

public class MainTest {

	public static void main(String[] args) {

		String text = "http://localhost:9090/user?username=abc";
		
		Base64Strategy base64Strategy = new Base64Strategy();
		NormalStrategy normalStrategy = new NormalStrategy();
		AppendStrategy appendStrategy = new AppendStrategy();
		HttpStrategy httpStrategy = new HttpStrategy();
		
		Encoder encoder = new Encoder();
		encoder.setEncodingStrategy(httpStrategy);
		
		String encodingString = encoder.getMessage(text);
		//System.out.println(encodingString);
		
		// decoding 해보기
		try {
			String result = URLDecoder.decode(encodingString, "UTF-8");
			//System.out.println("result : " + result);
		} catch (UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		byte[] a = text.getBytes();
		
		java.util.Base64.Encoder encode = Base64.getEncoder();
		Decoder decode = Base64.getDecoder();
		
		// Base64 인코딩
		byte[] encodeByte = encode.encode(a);
		
		// Base64 디코딩
		byte[] decodeByte = decode.decode(encodeByte);
		
		System.out.println("인코딩 전 : " + text);
		System.out.println("Base64로 인코딩 : " + new String(encodeByte));
		System.out.println("디코딩 후 : " + new String(decodeByte));
	}

}
