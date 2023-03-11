package com.sample.tests;

public class splitFunction {

	public static void main(String[] args) {

		String date = "Jun-2021-16245:Jul-2021-20:Aug-2021-23:Sep-2021-21";
		// String date = pacingDate;
		// String s = ":";
		// int indexOf = date.indexOf(s);
		// String firstmon = date.substring(0, indexOf);
		// String replaceFirst = firstmon.replaceFirst("-", "");
		// String x = "-";
		// int index = replaceFirst.indexOf(x);
		// int length = replaceFirst.length();
		// formatMatch =pacingType+" "+"-"+" "+firstmon.substring(0, 3)+"
		// "+firstmon.substring(4, 8)+" "+"-"+" "+firstmon.substring(index+2, length+1);

		String[] firstSplit = date.split(":");
		System.out.println("1st split " + firstSplit[0]);
		String[] split = firstSplit[0].split("-");
		String formatMatch = split[0] + " " + split[1] + " " + "-" + " " + split[2];
		System.out.println("format match: " + formatMatch);

		// System.out.println("order pacing date: " +
		// StringUtils.deleteWhitespace(date.substring(0, indexOf).replaceAll("-",
		// "")));

		String samp = "Jun 2021 - 16245";
		System.out.println(samp);
		// System.out.println("allocation Date: " +
		// StringUtils.deleteWhitespace(samp.replaceAll("-", "")));

	}

}
