package com.PrimitiveReferenceTypeComparison;

import java.util.Arrays;

public class PrimRefTypeComparison {

	public static void main(String[] args) {
		int int1 = 128;
		int int2 = 128;

		System.out.println();
		System.out.println("Primitive Type Comparison");
		System.out.println("Variables: 'int int1 = 128', 'int int2 = 128'");
		System.out.println("int1 == int2: " + (int1 == int2));

		Integer i = 128;
		Integer i2 = 128;

		System.out.println();
		System.out.println("Reference Type Comparison");
		System.out.println("Variables: 'Integer i = 128', 'Integer i2 = 128'");
		System.out.println("i == i2: " + (i == i2));

		Integer i3 = 127;
		Integer i4 = 127;

		System.out.println();
		System.out.println("Java uses the Integer Pool if values are boxed from -128 to 127, ");
		System.out.println("meaning if two boxing conversions are equal create one object on the heap.");
		System.out.println("Variables: 'Integer i3 = 127', 'Integer i4 = 127'");
		System.out.println("i3 == i4: " + (i3 == i4));

		Integer i5 = new Integer(127);
		Integer i6 = new Integer(127);

		System.out.println();
		System.out.println("Explicitly  declaring a new object avoids the Integer Pool");
		System.out.println("Variables: 'Integer i5 = new Integer(127)', 'Integer i6 = new Integer(127)'");
		System.out.println("...not recommended");
		System.out.println("i5 == i6: " + (i5 == i6));

		Integer i7 = Integer.valueOf(127);
		Integer i8 = Integer.valueOf(127);

		System.out.println();
		System.out.println("Recommended method of initializing Integer Objects");
		System.out.println("Variables: 'Integer i7 = Integer.valueOf(127)', 'Integer i8 = new Integer(127)'");
		System.out.println("i7 == i8: " + (i7 == i8));
		i7 -= 1;
		System.out.println("i7 -= 1");
		System.out.println("i7 = " + i7);
		System.out.println("i8 = " + i8);

		System.out.println();
		System.out.println("Objects have an equals method that can be used to compare the values of two objects.");
		System.out.println("i.equals(i2): "+ i.equals(i2));
		System.out.println("     vs.");
		System.out.println("i == i2: " + (i == i2));

		int[] arr1 = {1,2,3};
		int[] arr2 = {1,2,3};
		
		System.out.println();
		System.out.println("Comparing Arrays");
		System.out.println("Arrays: " + "'int[] arr1 = {1,2,3}', 'int[] arr2 = {1,2,3}'");
		System.out.println("Of course using the '==' operand yields false since they are different objects.");
		System.out.println("    arr1 == arr2: "+ (arr1 == arr2));
		System.out.println("The Object 'equals' method also has limitations, and will always compare the memory reference pointer.");
		System.out.println("    arr1.equals(arr2): "+ arr1.equals(arr2));
		System.out.println("Use the Arrays 'equals' method to compare arrays.");
		System.out.println("    Arrays.equals(arr1, arr2): " + Arrays.equals(arr1, arr2));
		
		arr1 = arr2;
		
		System.out.println();
		System.out.println("If you assign an array object to another array object, you assign the reference.");
		System.out.println("In the example below, the reference for arr2 is assigned to arr1. Therefore,");
		System.out.println("arr1 and arr2 have the same pointer.");
		System.out.println("    arr1 = arr2;");
		System.out.println("    arr1 == arr2: "+ (arr1 == arr2));
	}

}
