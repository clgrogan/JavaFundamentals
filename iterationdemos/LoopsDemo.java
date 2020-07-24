package com.iterationdemos;

import java.lang.reflect.Array;

public class LoopsDemo {

	public static void main(String[] args) {
//		We demo the four 4 iterative statements here
//		1. 'while'loop
//		2. 'do-while' loop
//		3. 'for' with condition loop
//		4. 'for each' loop
		// We'll use the same i counter throughout.
		int i = 0;
//		1. 'while'loop
		System.out.println("\n--- 1. While Loop ---\n while (i < 5) \n Initial i: " + i + "\tIncrement: i++");
		while (i < 5) {
			System.out.println("\ti: " + i);
			i++;
		}
		System.out.println("Post loop i value: " + i);
//		2. 'do-while'loop
		System.out.println("\n--- 2. Do-While Loop ---\n do {} while (i < 5) \n Initial i: " + i + "\tIncrement: i++");
		do {
			System.out.println("\ti: " + i);
			i++;
		} while (i < 5);
		System.out.println("Post loop i value: " + i);
//		3. 'for'loop
		System.out.println("\n--- 3. For Loop ---\n for (i = 0; i < 5; i++)");
		for (i = 0; i < 5; i++) {
			System.out.println("\ti: " + i);
		}
		System.out.println("Post loop i value: " + i);
		System.out.println("\n--- 3. For Loop ---\n for ( int a = 0, j = 10;  i < j ; a++, j-- )");
		for (int a = 0, j = 10; i < j; a++, j--) {
			System.out.println("\ta: " + a + ", \tj: " + j);
		}
//		4. 'foreach'loop
		System.out.println("\n--- 4. Foreach Loop ---\n for (int number : numbers)");
		int[] numbers = { 1, 2, 3, 4 };
		int total = 0;
		System.out.println("int[] numbers = {1,2,3,4};\nint total = 0;");
		for (int number : numbers) {
			total += number;
			System.out.println("\tnumber: " + number);
		}
		System.out.println("Total: " + total);
//		Jump Statements
		System.out.println("\n--- 'Continue' Jump Statement ===" + "\n\t in For Loop: for (i = 0; i < 5; i++)");
		for (i = 0; i < 5; i++) {
			System.out.println("\\tt(i%2 == 0) evaluates to " + (i % 2 == 0)
					+ ". if 'true' the 'continue' expression executes ending this iteration.");
			if (i % 2 == 0)
				continue;
			System.out.println("\t\tLoop " + (i + 1) + ". The jump statement did not execute on this loop.");
		}
		System.out.println("--- End 'continue' Demo ---");

		System.out.println("\n=== Break Jump Statement ===" + "\n\t in For Loop: for (i = 0; i < 5; i++)");
		for (i = 0; i < 5; i++) {
			System.out.println(
					"\t\t(i%2 != 0) evaluates to " + (i % 2 != 0) + ". if 'true' the 'break' expression executes.");
			if (i % 2 != 0)
				break;
			System.out.println("\t\tLoop " + (i + 1) + ". The jump statement did not execute on this loop.");
		}
		System.out.println("--- End 'break' demo ---");
		System.out.println("\n=== Labels with Loops ===");
		aLoop: for (int a = 0; a < 10; a++) {
			iLoop: for (i = 0; i < 5; i++) {
				if (a < 4 || a == 6) {
					System.out.println("\t! 'continue aLoop;' executed:"
							+ "\n\t\tiLoop iteration " + (i+1)
							+ "\n\t\taLoop iteration " + (a+1));
					continue aLoop;
				} else
				if (i == 4) {
					System.out.println("\t! 'break iLoop;' executed:"
							+ "\n\t\tiLoop iteration " + (i+1)
							+ "\n\t\taLoop iteration " + (a+1));
					break iLoop;
				} else
				if (a == 7) {
					System.out.println("\t! 'break aLoop;' executed:"
							+ "\n\t\tiLoop iteration " + (i+1)
							+ "\n\t\taLoop iteration " + (a+1));
					break aLoop;
				}
				}
//		if ( a > 9 )continue iLoop; Not valid since it is outside the loop with the iLoop la
		}
		System.out.println("--- End Labels demo ---");

	}
}
