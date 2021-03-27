package com.epam.ik;

import java.util.Arrays;

public class Task04 {
    public static void main(String[] args) {
        int[] arr = new int[]{0, 5, 3, 6, 10, 8};
        int min = 0;
        int max = 0;

        for(int i = 0; i < arr.length; ++i) {
            if (arr[min] > arr[i]) {
                min = i;
            } else if (arr[max] < arr[i]) {
                max = i;
            }
        }

        int swap = arr[min];
        arr[min] = arr[max];
        arr[max] = swap;
        System.out.println(Arrays.toString(arr));
    }
}
