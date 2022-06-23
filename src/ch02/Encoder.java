package ch02;

public class Encoder {

	// A - Base64, B - Normal
	private EncodingStrategy encodingStrategy;

	// setter (런타임 시점에 돌아가는 객체를 주입한다)
	public void setEncodingStrategy(EncodingStrategy encodingStrategy) {
		this.encodingStrategy = encodingStrategy;
	}
	
	// 객체의 동작 메소드
	public String getMessage(String message) {
		return encodingStrategy.encode(message);
	}
}
