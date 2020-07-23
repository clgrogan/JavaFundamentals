package com.expressiontypedemo;

public class ExpressionTypeDemo {

	public static void main(String[] args) {
		byte b = 1;
		short s = 1;
		int i = 1;
		long l = 1;

		float f = 1.0F;
		double d = 1.0;

		char c = 1;

		int intExpressionType = b + b;
//		byte byteExpressionType1 = b + b; type mismatch, rule dictates byte plus byte is int.
		int intExpressionType2 = s + s;
		int intExpressionType3 = b + i + c;

		long longExpressionType = i + l;

		float floatExpressionType = l + f;

		System.out.println("10 / 3: " + 10 / 3);
		System.out.println("10.0 / 3: " + (10.0 / 3));
		System.out.println("(float)10 / 3: " + (float) 10 / 3);

//		int stringExpressionType = "This is a string + float: " + f;
//		Type mismatch: cannot convert from String to int
		String stringExpressionType = "This is a string + float: " + f;

		System.out.println(stringExpressionType);
		System.out.println("This is a string + null: " + null);
	}
}
