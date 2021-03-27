package com.epam.ik;

import java.math.BigInteger;

public class Task04 {
    public static void main(String[] args) {
        BigInteger sum = BigInteger.valueOf(1L);
        int v = 200;

        for(int i = 1; i <= v; ++i) {
            sum = sum.multiply(BigInteger.valueOf((long)i * (long)i));
        }

        System.out.println(sum);
    }
}
