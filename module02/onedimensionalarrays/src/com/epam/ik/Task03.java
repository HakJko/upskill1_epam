package com.epam.ik;

import java.util.Arrays;

public class Task03 {
    public static void main(String[] args) {
        int firstValueInArray = -5;
        int n = 10;
        int[] arr = fillArray(n, firstValueInArray);
        int negative = sumN(arr);
        int positive = sumP(arr);
        int zero = sumZ(arr);
        System.out.println("Отрицательных: " + negative + "\nПоложительных: " + positive + "\nНулей: " + zero);
        System.out.println(Arrays.toString(arr));
    }

    public static int[] fillArray(int n, int firstValueInArray) {
        int[] arrF = new int[n];

        for(int i = 0; i < arrF.length; ++i) {
            arrF[i] = firstValueInArray++;
        }

        return arrF;
    }

    public static int sumN(int[] arr) {
        int sumNegativeValues = 0;

        for(int i = 0; i < arr.length; ++i) {
            if (arr[i] < 0) {
                ++sumNegativeValues;
            }
        }

        return sumNegativeValues;
    }

    public static int sumP(int[] arr) {
        int sumPositiveValues = 0;

        for(int i = 0; i < arr.length; ++i) {
            if (arr[i] > 0) {
                ++sumPositiveValues;
            }
        }

        return sumPositiveValues;
    }

    public static int sumZ(int[] arrF) {
        int sumZeroValues = 0;

        for(int i = 0; i < arrF.length; ++i) {
            if (arrF[i] == 0) {
                ++sumZeroValues;
            }
        }

        return sumZeroValues;
    }
}
