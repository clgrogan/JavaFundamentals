package com.arraysdemo;

import java.util.Arrays;

public class ArraysDemo {

	public static void main(String[] args) {
		
		int[] arr;
		int arr2[];
		
		arr = new int[10];
		System.out.println();
		System.out.println("arr.length: " + arr.length);
		System.out.println("arr[0]: " + arr[0]);
		
		double[] doubleArray;
		doubleArray = new double[10];
		System.out.println();
		System.out.println("doubleArray.length: " + doubleArray.length);
		System.out.println("doubleArray[0]: " + doubleArray[0]);
		
		boolean[] boolArray;
		boolArray = new boolean[10];
		System.out.println();
		System.out.println("boolArray.length: " + boolArray.length);
		System.out.println("boolArray[0]: " + boolArray[0]);
		
		char[] charArray;
		charArray = new char[10];
		System.out.println();
		System.out.println("charArray.length: " + charArray.length);
		System.out.println("charArray[0]: " + charArray[0]);
		
		int[] literals = {1,7,5,3,9};
		System.out.println();
		System.out.println("\nint[] literals = {1,7,5,3,9}");
		System.out.println("literals.length: " + literals.length);
		System.out.println("literals[0]: " + literals[0]);
		System.out.println();
		System.out.println("In JDK we have methods to perform basic operations with arrays.\n" + 
				"	• the methods are in the Arrays class\n" + 
				"  Example, the toString method accepts an array as the parameter. Syntax below.\n" + 
				"	• Arrays.toString(arrayName) returns a string representation of the array values.");
		System.out.println("\nArrays.toString(literals): " + Arrays.toString(literals));
		System.out.println("\nSort the literals with Arrays.sort(literals)");
		Arrays.sort(literals);
		System.out.println(" Arrays.toString(literals): " + Arrays.toString(literals));
		
		// Technically, there are not multidimensional arrays. 
		// an array of arrays is what we use in Java
		int[][] matrix = {
				{1,2,3},
				{4,5,6}
				
		};
		System.out.println();
		System.out.println("int[][] matrix = { {1,2,3}, {4,5,6}};");
		System.out.println("matrix.length: " + matrix.length);
		System.out.println(" Arrays.toString(matrix[0]): " + Arrays.toString(matrix[0]));
		System.out.println(" Arrays.toString(matrix[1]): " + Arrays.toString(matrix[1]));

		int[][] matrix2 = new int[10][10];
		System.out.println();
		System.out.println("int[][] matrix2 = new int[10][10];");
		System.out.println("matrix2.length: " + matrix2.length);
		System.out.println("matrix2[0]: " + matrix2[0]);
		System.out.println("matrix2[0][0]: " + matrix2[0][0]);
		System.out.println("matrix2[1][2]: " + matrix2[1][2]);
	}

	@Override
	public String toString() {
		System.out.println("custom toString executed");
		return "ArraysDemo []";
	}

}
