package me.leonadel.retosjava;

public class TextManipulator {
	
	private String text;
	
	public TextManipulator(String text) {
		this.text = text;
	}
	
	public String getText() {
		return text;
	}
	
	public String reverseString() {
		String rev = "";
		for(int i=text.length()-1; i>=0; i--) {
			rev += this.text.charAt(i);
		}
		return rev;
	}

	public void setText(String text) {
		this.text = text;
	}

}
