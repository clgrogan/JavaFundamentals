package com.ifelseexercise;

import java.util.Arrays;

public class AdminGuestMode {
//	Implement console program which will meet the following requirements:
//		1.	Program can be started in 'admin' and 'guest' mode
//		2.	To start program in 'admin' mode any of multiple string arguments should be equal to '—admin'
//		3.	To start program in 'guest' mode any of multiple string arguments should be equal to '--guest'
//		4.	Program cannot be started with '—admin' and '—guest' arguments simultaneously
//		5.	If program is started in 'admin' mode then "Hello, Admin!" is printed to console
//		6.	If program is started in 'guest' mode then "Hello, Guest!" is printed to console
//		7.	If program is started with '—admin' and '—guest' arguments then 
//			program prints "Please, select either 'ADMIN' or 'GUEST' mode for this program" to console
//	
	public static void main(String[] args) {
//		System.out.println(
//				"Arrays.asList(args).indexOf(\"--admin\"): " 
//				+ Arrays.asList(args).indexOf("--admin"));
//		System.out.println(Arrays.toString(args));
		if (Arrays.asList(args).indexOf("--admin") >= 0 && Arrays.asList(args).indexOf("--guest") >= 0) {
			System.out.println("Please, select either 'ADMIN' or 'GUEST' mode for this program");
		} else if (Arrays.asList(args).indexOf("--admin") >= 0) {
			System.out.println("Hello, Admin!");
		} else if (Arrays.asList(args).indexOf("--guest") >= 0) {
			System.out.println("Hello, Guest!");
		} else {
			System.out.println("Please, select 'ADMIN' or 'GUEST' mode for this program");
		}
		
		System.out.println("\nAlternate solution suggested by instructor.");
        String input = String.join(",", args);
        if (input.contains("--admin") && input.contains("--guest")) {
            System.out.println("Please, select either 'ADMIN' or 'GUEST' mode for this program");
        } else if (input.contains("--admin")) {
            System.out.println("Hello, Admin!");
        } else if (input.contains("--guest")) {
            System.out.println("Hello, Guest!");
        }
	}

}
