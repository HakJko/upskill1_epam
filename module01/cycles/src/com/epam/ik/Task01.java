package com.epam.ik;

import java.util.Scanner;

public class Task01 {
    public static void main(String[] args) {

        Scanner console = new Scanner(System.in);
        System.out.print("Enter the natural number A (non-negative integer greater than or equal to 1): ");
        long num = console.nextLong();

        if (num >= 1) {
            long sum = 0;
            for (long i = 1; i <= num; i++) {
                sum += i;
            }
            System.out.println("Total amount is " + sum);
        } else {
            System.out.println("The number must be greater than or equal to 1!");
        }

    }
}
