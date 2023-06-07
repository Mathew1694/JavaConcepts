package com.sample.tests;

import java.util.Arrays;

public class MiddlePositionArray {

	private static int someMethod(int[] numbers, int num) {

		int low = 0;
		int high = numbers.length - 1;

		while (low <= high) {
			int middlePostion = (low + high) / 2;
			int middleNum = numbers[middlePostion];

			if (num == middleNum) {
				return middlePostion;
			}
			if (num < middleNum) {
				high = middlePostion - 1;
			} else {
				low = middlePostion + 1;
			}
		}
		return -1;
	}

	public static void main(String[] args) {
		int[] x = { 109, 5, 900, -1, 45, 68, 7, 4, 0, 8, 1, 9, 11, 34, 65 };
		 Arrays.sort(x);
		System.out.println(Arrays.toString(x));
		System.out.println(x[9]);

		System.out.println("The positon of given number is: " + someMethod(x, 34));
	}

}
