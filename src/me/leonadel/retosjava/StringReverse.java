package me.leonadel.retosjava;

import java.util.Scanner;

public class StringReverse {

	public static void main(String[] args) {
		String rev = "";
		System.out.print("Input:");
		Scanner input = new Scanner(System.in);
		TextManipulator text = new TextManipulator(input.nextLine());
		input.close();
		System.out.println(text.getText());
		System.out.println(text.reverseString());
		System.out.println(text.recursiveReverseString(rev, 0));
	}
}