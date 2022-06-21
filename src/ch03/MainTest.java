package ch03;

public class MainTest {

	public static void main(String[] args) {
		
		Button btn = new Button("마이버튼");
		btn.setiButtonListener(event -> {
			System.out.println("main에서 동작 넘겨 받은 메시지 : " + event);
		});
		
		btn.click("클릭 1");
		btn.click("클릭 2");
		btn.click("클릭 3");
	}

}