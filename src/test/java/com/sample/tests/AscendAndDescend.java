package com.sample.tests;

public class AscendAndDescend {

	public static void main(String[] args) {

		int[] a = { 10, 202, 130, 2783, 548, -3894, -74938, 374, -21 };

		for (int i = 0; i < a.length; i++) {
			for (int j = i + 1; j < a.length; j++) {
				if (a[i] > a[j]) {
					int temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
		}
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}

		System.out.println("============");
		for (int i = 0; i < a.length; i++) {
			if (a[i] > 0) {
				System.out.println(a[i]);
			}
		}

	}

}