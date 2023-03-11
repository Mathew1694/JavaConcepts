package com.sample.tests;

import org.apache.commons.lang3.RandomStringUtils;

public class RandomAlphaNum {

	public static void main(String[] args) {
//		long start = System.currentTimeMillis();
//		char ix = '0';
//		String build = "";
//
//		for (int i = ix; i <= 'z'; i++) {
//
//			build = ix + build;
//			ix++;
//			if (build.length() == 100) {
//				break;
//			}
//		}
//		System.out.println(build);
		String random = RandomStringUtils.randomAlphanumeric(6);
		System.out.println("Gen String: " + random);
		if (random.matches(".*\\d.*")) {
			System.out.println(random);
		} else {
			System.out.println("no num");
		}

//		String x = UUID.randomUUID().toString();
//		String[] split = x.split("-");
//		System.out.println(split[0]);
//
//		String alp = "ABCDEFGHIJKLMNOPQRSTUVWXYZ" + "0123456789" + "abcdefghijklmnopqrstuvxyz";
//		StringBuilder sb = new StringBuilder();
//
//		for (int i = 0; i < 5; i++) {
//			int ran = (int) (alp.length() * Math.random());
//			sb.append(alp.charAt(ran));
//		}
//		System.out.println("SB --> " + sb);
//		long end = System.currentTimeMillis();
//		System.out.println(end - start+" ms");

//		String x = "fXa1L8e9SJam6SivIqIXjZ7b1upZFotjFXBqFIaFBV3h5T9sQxOvINkp97bQ";
//		int con = 0;
//		for (int i = 0; i < x.length(); i++) {
//			if (x.charAt(i) != ' ')
//				con++;
//		}
//		System.out.println(start);
//		

	}

}
