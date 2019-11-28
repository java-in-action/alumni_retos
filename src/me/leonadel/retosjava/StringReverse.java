package me.leonadel.retosjava;

import java.util.Scanner;

public class StringReverse {

	public static void main(String[] args) {
		String rev = "";
		System.out.print("Input:");
		Scanner input = new Scanner(System.in);
		TextManipulator text = new TextManipulator(input.nextLine());
		
		System.out.println(text.getText());
		System.out.println(text.reverseString());
		System.out.println(text.recursiveReverseString(rev, 0));
		
		System.out.println("Palíndroma a evaluar:");
		text.setText(input.nextLine());
		if(text.palindromeTest()) System.out.println("Palíndroma");
		else System.out.println("No es Palíndroma");
		
		input.close();
	}
}