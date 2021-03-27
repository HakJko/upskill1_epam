package com.epam.ik;

import java.util.Arrays;

public class Task06 {
    public static void main(String[] args) {
        int[] arr = new int[20];
        int sum = 0;

        int j;
        for(j = 0; j < arr.length; ++j) {
            arr[j] = j + 1;
        }

        for(j = 0; j < arr.length; ++j) {
            if (j != 1) {
                if (j == 2 || j == 3 || j == 5) {
                    sum += j;
                    System.out.println(j);
                }

                if (j % 2 != 0 & j % 3 != 0 & j % 5 != 0) {
                    sum += j;
                    System.out.println(j);
                }
            }
        }

        System.out.println("Сумма чисел, порядковые номера которых являются простыми числами: " + sum);
        System.out.println(Arrays.toString(arr));
    }
}
