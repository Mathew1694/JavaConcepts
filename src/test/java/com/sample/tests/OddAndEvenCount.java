package com.sample.tests;

import java.util.concurrent.ThreadLocalRandom;

public class OddAndEvenCount {

	public static void main(String[] args) {

//		String[] s = { "welcome", "to", "chennai","bangalore", "tirunelveli" };
		
		String samp = "welcome to Bangalore chennai Tirunelveli";
		
		String[] s = samp.split(" ");
		
		int num = ThreadLocalRandom.current().nextInt(0,s.length);
		System.out.println("num is : "+ num);
		String s1 = s[num];
		System.out.println(s1);
		int count = 0;
		for (int i = 0; i < s1.length(); i++) {
			char c = s1.charAt(i);
			count++;
		}
		System.out.println(count);
		if (count % 2 == 0) {
			System.out.println("even count");
		} else {
			System.out.println("Odd count");
		}
	}
}