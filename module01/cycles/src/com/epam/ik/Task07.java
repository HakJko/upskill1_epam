package com.epam.ik;

public class Task07 {
    public static void main(String[] args) {
        int value1 = 1135;
        int value2 = 3456;
        boolean have = false;
        int[] arr1 = createArray(value1);
        int[] arr2 = createArray(value2);

        for(int i = 0; i < arr1.length; ++i) {
            for(int j = i; j < arr2.length; ++j) {
                if (arr1[i] == arr2[j] && i != j) {
                    System.out.print(arr1[i] + " ");
                    have = true;
                }
            }
        }

        if (!have) {
            System.out.println("Повторяющихся цифр не обнаружено!");
        }

    }

    public static int[] createArray(int value1) {
        int[] array = new int[(int)Math.log10((double)value1) + 1];

        for(int i = 0; i < array.length; ++i) {
            array[i] = value1 % 10;
            value1 /= 10;
        }

        return array;
    }
}
