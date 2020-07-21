package com.numbersystems;

public class NumberSystems {

	public static void main(String[] args) {
		int dec = 152;
		int bin = 0b10011000;
		int oct = 0230;
		int hex = 0x98;
		
		printVariables(dec, bin, oct, hex);
	}

	private static void printVariables(int dec, int bin, int oct, int hex) {
		System.out.println();

		System.out.println("int dec = 152; " + dec);
		System.out.println("int bin = 0b10011000; " + bin);
		System.out.println("int oct = 0230; " + oct);
		System.out.println("int hex = 0x98; " + hex);
	}

}
