package com.epam.ik;

public class Task01 {
    public static void main(String[] args) {
        int[] arr = new int[]{1, 2, 3, 4, 5, 6};
        int k = 2;
        int sum = 0;

        for(int i = 0; i < arr.length; ++i) {
            if (arr[i] % k == 0) {
                sum += arr[i];
            }
        }

        System.out.println(sum);
    }
}
