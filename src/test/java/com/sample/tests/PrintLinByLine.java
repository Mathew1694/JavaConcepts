package com.sample.tests;

public class PrintLinByLine {

	public static String s = "Hello welcome to coding camp pro";

	public static void main(String[] args) {

		String[] split = s.split(" ");
		for (int i = 0; i < split.length; i++) {
			String x = split[i].substring(0,1).toUpperCase();
			String y = split[i].substring(1, split[i].length());
			String f = x+y;
			System.out.println(f);
		}
	}
}
