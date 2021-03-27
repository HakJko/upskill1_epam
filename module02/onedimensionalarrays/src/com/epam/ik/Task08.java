package com.epam.ik;

import java.util.Arrays;

public class Task08 {
    public static void main(String[] args) {
        int[] arr = new int[]{1, 0, 1, 4, 0, 7, 10};
        int[] arrNew = deleteMinValue(arr);
        System.out.println(Arrays.toString(arrNew));
    }

    public static int[] deleteMinValue(int[] arr) {
        int minCount = 0;
        int min = arr[0];

        for(int i = 1; i < arr.length; ++i) {
            if (arr[i] <= min) {
                min = arr[i];
            }
        }

        int[] result = arr;
        int indexResult = arr.length;

        int i;
        for(i = 0; i < indexResult; ++i) {
            int value = result[i];
            if (value == min) {
                ++minCount;
            }
        }

        result = new int[arr.length - minCount];
        indexResult = 0;

        for(i = 0; i < arr.length; ++i) {
            if (arr[i] != min) {
                result[indexResult] = arr[i];
                ++indexResult;
            }
        }

        return result;
    }
}
