package com.ifelseexercise;

public class SimpleNumberCalculation {
//	Exercise implementing a console program which will meet the following requirements:
//		1.	Program is started with two arguments (numbers)
//		2.	Program adds these two numbers
//		3.	In case one of the input arguments is floating-point number 
//			- the result of addition is floating-point number
//		4.	In case two arguments are integer - the result of addition is integer

	public static void main(String[] args) {
		if (args[0].contains(".") || args[1].contains(".")) {
			System.out.println(Float.parseFloat(args[0]) + Float.parseFloat(args[1]));
			System.out.println("Or round to 1 decimal place: " +String.format("%.1f", Float.valueOf(args[0]) + Float.valueOf(args[1])));
		} else {
			System.out.println(Integer.parseInt(args[0]) + Integer.parseInt(args[1]));
		}
	}

}
