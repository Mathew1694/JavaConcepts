package com.sample.tests;

import java.util.Arrays;

public class FunClass {


    public static void main(String[] args) {
        int[] ar = {10, 202, 130, 2783, 548, -3894, -74938, 374, -21};
        Arrays.sort(ar);
        for (int j : ar) {
            if (j < 0) {
                continue;
            }
            System.out.println(j);
        }
    }

}
