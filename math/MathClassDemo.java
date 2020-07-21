package com.math;

public class MathClassDemo {
	public static void main(String[] args) {

		System.out.println();
		System.out.println("Constants");
		System.out.println("Math.PI: " + Math.PI);
		System.out.println("Math.E: " + Math.E);

		System.out.println();
		System.out.println("Math basic methods");
		System.out.println("Math.max(3, 5): " + Math.max(3, 5));
		System.out.println("Math.min(3, 5): " + Math.min(3, 5));
		System.out.println("Math.sqrt(4): " + Math.sqrt(4));
		int absoluteValue = Math.abs(-5);
		System.out.println("Math.abs(-5): " + absoluteValue);

		System.out.println();
		System.out.println("Not a Number NaN");
		System.out.println("Math.sqrt(-1): " + Math.sqrt(-1));
		System.out.println("0 / 0.0: " + 0 / 0.0);
		System.out.println("(0 / 0.0) + 5: " + ((0 / 0.0) + 5));

		System.out.println();
		System.out.println("Infinity. Divide number by floating point 0.0");
		System.out.println("5 / 0.0: " + (5 / 0.0));
		System.out.println("-5 / 0.0: " + (-5 / 0.0));

		System.out.println();
		System.out.println("Math.round");
		System.out.println("Math.round(20.0 / 3.0): " + Math.round(20.0 / 3.0));
		System.out.println("Math.round(20.0 * 100 / 3.0): " + Math.round(20.0 * 100 / 3.0));

		System.out.println();
		System.out.println("Math.random");
		System.out.println("Math.random number gives a decimal between 0 and 1.0");
		System.out.println("# 0 to 1.0 : Math.random(): " + Math.random());
		System.out.println("# 0 to 100 : (int)(Math.random() * 100): " + (int) (Math.random() * 100));
		System.out.println("# 100 to 200 : (int)(Math.random() * 100 + 100): " 
				+ (int) (Math.random() * 100 + 100));
	}

}
