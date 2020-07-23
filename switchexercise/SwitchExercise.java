package com.switchexercise;

import java.util.Scanner;

public class SwitchExercise {
//Exercise to implement console program which will meet the following requirements:
//
//	A.	Program is started and user is asked to enter one of possible events:
//		1.	login
//		2.	sign_up
//		3.	terminate_program
//		4.	main_menu
//		5.	about_app
//	B.	Based on user input program prints text to the console.

	public static void main(String[] args) {
		System.out.println("Please enter an action code"
				+ "\nlogin | sign_up | terminate_program | main_menu | about_app");
		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();
		String output = "";

		switch (input) {
			case "login":
				output = "Please, enter your username";
				break;
			case "sign_up":
				output = "Welcome!";
				break;
			case "terminate_program":
				output = "Thank you! Good bye!";
				break;
			case "main_menu":
				output = "Main menu";
				break;
			case "about_app":
				output = "This app is created by me with support of ®IT-Bulls.com";
				break;
			default:
				output = "Please, enter one of these values: login, sign_up, "
						+ "terminate_program, main_menu, about_app";
		}
		System.out.println(output);
	}

}
