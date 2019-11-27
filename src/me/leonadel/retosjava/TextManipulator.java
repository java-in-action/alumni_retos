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

	public String recursiveReverseString(String rev, int i) {
		//si text est� vac�o, retornar
		if(this.text.isEmpty()) return "";
		//si el �ndice es igual o mayor, retornar
		else if(i>=this.text.length()) return rev;
		//de lo contrario retornar la cadena
		else {
			i++;
			rev += this.text.charAt(text.length()-i);
			return recursiveReverseString(rev,i); 
		}
		
	}

	public void setText(String text) {
		this.text = text;
	}

}