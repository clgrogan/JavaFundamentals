package com.randomclass;
import java.util.Random;

public class RandomNumber {

	public static void main(String[] args) {
		Random myRandom = new Random();
		System.out.println("Random int: " + myRandom.nextInt());
		System.out.println("Random int 0 - 99: " + myRandom.nextInt(100));
		System.out.println("Random int 1 - 100: " + myRandom.nextInt(100) + 1);
	}

}
