package me.leonadel.retosjava;

import java.util.regex.Pattern;

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
		//si text está vacío, retornar
		if(this.text.isEmpty()) return "";
		//si el índice es igual o mayor, retornar
		else if(i>=this.text.length()) return rev;
		//de lo contrario retornar la cadena
		else {
			i++;
			rev += this.text.charAt(text.length()-i);
			return recursiveReverseString(rev,i); 
		}
		
	}
	
	public boolean palindromeTest() {
		String rev = reverseString().replaceAll("\\s", "");
		String dst = text.replaceAll("\\s", "");
		System.out.println(dst);
		if(rev.toLowerCase().equals(dst.toLowerCase())) return true;
		else return false;
	}
	
	private String stripWhitespace(String str) {
		String stripped = "";
		for(int i=0; i<str.length(); i++) {
			if(!Character.isWhitespace(str.charAt(i)))
				stripped+=str.charAt(i);
		}
		return stripped;
	}

	public void setText(String text) {
		this.text = text;
	}
	
}
