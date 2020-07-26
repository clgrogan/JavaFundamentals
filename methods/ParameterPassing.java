package com.methods;

import java.util.Arrays;

public class ParameterPassing {

	public static void main(String[] args) {
		int i = 10;
		System.out.println("i before changeIntValue():\t" + i);
		changeIntValue(i);
		System.out.println("i after changeIntValue():\t" + i);

		int[] arr = {10,50,100};
		System.out.println("\narr before changeArrValue():\t" + Arrays.toString(arr));
		changeArrValue(arr);
		System.out.println("arr after changeArrValue():\t" + Arrays.toString(arr));

		System.out.println("\narr before nullArrValue():\t" + Arrays.toString(arr));
		nullArrValue(arr);
		System.out.println("arr after nullArrValue():\t" + Arrays.toString(arr));


		System.out.println("\narr before 'arr = null;':\t" + Arrays.toString(arr));
		 arr = null;
		System.out.println("arr after 'arr = null;':\t" + Arrays.toString(arr));
		
	}
	
	private static void changeIntValue(int i) {
		i += 100;
	}
	
	private static void changeArrValue(int[] arr) {
		arr[0] += 100;
	}
	
	private static void nullArrValue(int[] arr) {
		arr = null;
	}

}
