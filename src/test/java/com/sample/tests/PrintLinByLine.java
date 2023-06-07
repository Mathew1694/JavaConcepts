package com.sample.tests;

public class PrintLinByLine {

	public static String s = "Hello welcome to coding camp pro";

	public static void main(String[] args) {

		String[] split = s.split(" ");
		for (String value : split) {
			String x = value.substring(0, 1).toUpperCase();
			String y = value.substring(1);
			String f = x + y;
			System.out.println(f);
		}
	}
}
