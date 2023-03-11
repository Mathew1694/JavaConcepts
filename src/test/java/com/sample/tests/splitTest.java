package com.sample.tests;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

public class splitTest {

	public void someMethod(int con) {
		String[] header = { "First Name", "Last Name", "Email", "Domain", "Asset Name", "Company Name", "IP",
				"LinkedIn/Lead Validation Url", "Zip Code", "City" };
		List<String> list = new ArrayList<>(Arrays.asList(header));
		for (int i = 1; i <= con; i++) {
			if (list.isEmpty()) {
				break;
			}
			int ranInt = ThreadLocalRandom.current().nextInt(list.size());
			String selHeader = list.get(ranInt);
			System.out.println("sel option " + i + ": " + selHeader);
			Collections.sort(list);
			list.remove(selHeader);
			System.out.println("list after removal: " + list);
			System.out.println("=====xxxxxx=====");
		}
	}

	public static void main(String[] args) {
//		String s = "hello everyone, welcome to bangalore";
//		String[] words = s.split(" ");
//
//		for (String w : words) {
//			String upCase = w.substring(0, 1).toUpperCase();
//			String rem = w.substring(1);
//			System.out.print(upCase + rem + " ");
//		}

		splitTest sp = new splitTest();
		sp.someMethod(9);

	}
}
