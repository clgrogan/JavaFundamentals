package com.methods;

public class RecursiveMethods {

	public static void main(String[] args) {
//		blowTheStackRecursive();
		System.out.println("\ncalculateFactorial(4): " + calculateFactorial(4));
		System.out.println("calculateFactorial(31): " + calculateFactorial(31));
	}
	static int calculateFactorial(int i) {
		if (i != 0) {
			return i * calculateFactorial(i -1);
		} else {
			return  1;
		}
	}
	private static void blowTheStackRecursive() {
		blowTheStackRecursive();
	}
}
