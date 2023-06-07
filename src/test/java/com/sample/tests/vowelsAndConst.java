package com.sample.tests;

import java.util.concurrent.ThreadLocalRandom;

public class vowelsAndConst {

    public static void main(String[] args) throws Exception {

        // readExcelFile("D:\\projects\\JavaTest\\Excel\\checkTargetFilter -ABM.xlsx");
        // readExcelFile("D:\\projects\\JavaTest\\Excel\\checkTargetFilter (1).xlsx");
        // readCsvExcelType("D:\\projects\\JavaTest\\Excel\\checkTargetFilterCSV.csv");
        // readCsvExcelType("D:\\projects\\JavaTest\\Excel\\sample_company_name_list
        // (1).csv");
        // readCsvExcelType("D:\\projects\\JavaTest\\Excel\\sample_d-u-n-s_number_list.csv");
        // System.out.println("//========================================//");
        // readExcelType("D:\\projects\\JavaTest\\Excel\\checkTargetFilter.xlsx");

        // csvToXLSX("D:\\projects\\JavaTest\\Excel\\checkTargetFilterCSV.csv",
        // "D:\\projects\\JavaTest\\XlsxConv\\dummy4.xlsx");

        String s = "welcome to electronic city Bangalore has a pleasant weather";

        String[] words = s.split(" ");
        int count = 0;

        for (String w : words) {
            String let1 = w.substring(0, 1).toUpperCase();
            String let2 = w.substring(1);
            String c = let1 + let2;
            System.out.println(c);
        }
        int num = ThreadLocalRandom.current().nextInt(words.length);
        String s1 = words[num];
        System.out.println("==========");
        System.out.println(s1);
        for (int i = 0; i < s1.length(); i++) {
            s1.charAt(i);
            count++;
        }
        System.out.println(count);
        System.out.println("============");

        char r;
        StringBuilder rev = new StringBuilder(" ");
        int vow = 0;
        int cons = 0;
        for (int i = 0; i < s1.length(); i++) {
            r = s1.charAt(i);
            if (r == 'a' || r == 'e' || r == 'i' || r == 'o' || r == 'u') vow++;
            else cons++;
            rev.insert(0, r);
        }
        System.out.println(rev);
        System.out.println("No of vow: " + vow);
        System.out.println("No of cons: " + cons);
        if (count % 2 == 0) {
            System.out.println("even count");
        } else {
            System.out.println("odd count");
        }

    }

}
