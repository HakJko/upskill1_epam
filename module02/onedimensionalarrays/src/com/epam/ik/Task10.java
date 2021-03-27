package com.epam.ik;

import java.util.Arrays;

public class Task10 {
    public static void main(String[] args) {
        int n = 15;
        int[] arr = new int[n];

        int j;
        for(j = 0; j < arr.length; ++j) {
            arr[j] = j + 1;
        }

        System.out.println(Arrays.toString(arr));

        for(j = 1; j < arr.length; j += 2) {
            arr[j] = 0;
        }

        System.out.println(Arrays.toString(arr));
    }
}
