package com.ReadFromConsole;

import java.util.Scanner;

public class ReadFromConsole {

	public static void main(String[] args) {
		Scanner inScanner = new Scanner(System.in);
		
		System.out.print("Please enter any word:");
		
		String inputText = inScanner.next();
		System.out.println("You entered the word: " + inputText);
		
		System.out.print("Please enter an integer:");
		
		int i = inScanner.nextInt();
		System.out.println("You entered the integer: " + i);
		
	}

}
