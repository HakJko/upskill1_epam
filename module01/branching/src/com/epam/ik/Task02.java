package com.epam.ik;

public class Task02 {
    public static void main(String[] args) {
        int[] arr1 = new int[]{9, 10};
        int[] arr2 = new int[]{4, 3};
        int minInFirstArr = min(arr1);
        int minInSecondArr = min(arr2);
        int maxInTwoArr = max(minInFirstArr, minInSecondArr);
        System.out.println("Min first value: " + minInFirstArr + "\nMin second value: " + minInSecondArr + "\nMax: " + maxInTwoArr);
    }

    public static int min(int... arr1) {
        int min1 = arr1[0];

        for(int i = 0; i < arr1.length; ++i) {
            if (arr1[i] < min1) {
                min1 = arr1[i];
                break;
            }
        }

        return min1;
    }

    static int max(int min1, int min2) {
        int maxValue = min1;
        if (min1 < min2) {
            maxValue = min2;
        }

        return maxValue;
    }
}
