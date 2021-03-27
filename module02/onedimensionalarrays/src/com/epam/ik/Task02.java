package com.epam.ik;

import java.util.Arrays;

public class Task02 {
    public static void main(String[] args) {
        double[] arr = new double[]{1.0D, 1.1D, 1.2D, 1.3D, 1.1D, 1.6D, 1.1D};
        double z = 1.2D;
        int sumSwap = 0;

        for(int i = 0; i < arr.length; ++i) {
            if (arr[i] > z) {
                arr[i] = z;
                ++sumSwap;
            }
        }

        System.out.println(Arrays.toString(arr));
        System.out.println("Колличество замен: " + sumSwap);
    }
}
