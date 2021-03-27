package com.epam.ik;

public class Task05 {
    public static void main(String[] args) {
        int[] arr = new int[]{1, 0, 1, 4, 0, 7, 10};

        for(int i = 0; i < arr.length; ++i) {
            if (arr[i] > i) {
                System.out.println(arr[i]);
            }
        }

    }
}
