package com.epam.ik;

public class Task03 {
    public static void main(String[] args) {
        int sum = 0;
        int v = 100;

        for(int i = 1; i <= v; ++i) {
            sum = (int)((double)sum + Math.pow((double)i, 2.0D));
        }

        System.out.println(sum);
    }
}
