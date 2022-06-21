package ch04;

public class Button {

	private String name;
	private IButtonListener iButtonListener;
	
	public void setiButtonListener(IButtonListener iButtonListener) {
		this.iButtonListener = iButtonListener;
	}
	
	public Button(String name) {
		this.name = name;
	}
	
	public void click(String message) {
		iButtonListener.clickEvent(message);
	}
}
