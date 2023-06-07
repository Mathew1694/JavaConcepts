package com.sample.tests;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class TwoList {

	public static String[] a = { "Red", "Tea", "Coding", "Hat", "Fence", "Lavender", "Ranch", "cat", "apple",
			"Apricot" };

	public static void main(String[] args) {

		List<String> strList = new ArrayList<>(Arrays.asList(a));
		Collections.sort(strList);

		Map<Integer, String> em = new HashMap<>();
		for (int i =0 ; i < strList.size(); i++) {
			em.put(i+1, strList.get(i));
		}

		System.out.println(em);

		
		Set<Entry<Integer, String>> x = em.entrySet();
		
		for (Entry<Integer, String> ent : x) {
			if (ent.getValue().equalsIgnoreCase("Hat")) {
				System.out.println("val is --->>> "+ent.getKey());
			}
		}

	}

}
