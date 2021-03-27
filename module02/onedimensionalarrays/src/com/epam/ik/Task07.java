package com.epam.ik;

import java.util.Arrays;

public class Task07 {
    public static void main(String[] args) {
        int[] arr = new int[]{1, 0, 1, 4, 0, 7, 10};
        int n = 2;
        int[] arrNew = changArray(n, arr);
        int maxValue = maxValueInNewArray(arrNew);
        System.out.println(Arrays.toString(arrNew));
        System.out.println("max: " + maxValue);
    }

    public static int[] changArray(int n, int[] arr) {
        for(int i = 0; i < arr.length; ++i) {
            if (i == 0) {
                arr[i] += arr[i] * 2 * n;
            } else if (i == 1) {
                arr[i] = arr[i] + arr[i] * 2 * n - 1;
            } else {
                arr[i] = arr[i] + arr[i] + 1;
            }
        }

        return arr;
    }

    public static int maxValueInNewArray(int[] arrNew) {
        int max = arrNew[0];

        for(int j = 0; j < arrNew.length; ++j) {
            if (max < arrNew[j]) {
                max = arrNew[j];
            }
        }

        return max;
    }
}
