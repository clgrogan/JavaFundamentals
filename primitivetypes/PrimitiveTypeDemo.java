package com.primitivetypes;

public class PrimitiveTypeDemo {

	public static void main(String[] args) {
		byte b = 1;
		short s;
		s = 2;
		int i = 3;
		long l = 4;

		char c = 'a';

		boolean bool = true;

//		Add 'f' or "F" to the end of the numeric literal to set it as float. The
//		literal number with a decimal will be double by default and this will not compile.
		float f = 1.2f;

//		Whole number literals are int by default 2 trillion is out of range for an int.
//		Use L to set the literal as a long type.
		long l2 = 2_000_000_000_000l;

//		Java allows assignment from one primitive type to another provided the 
//		to variable is equal or larger in regards to memory usage.
		int i3 = s; // int is 4 bytes, s is short and short is 2 bytes so this is OK.

		char c2 = 100; // The character is the character equal to the 100 place on the unicode table.
		System.out.println("char c2 = 100: " + c2);

		System.out.println(1+3);

	}

}
