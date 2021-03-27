package com.epam.ik;

import java.util.Locale;
import java.util.Scanner;

public class Task01 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in).useLocale(Locale.US);
        System.out.print ("Enter the value a: ");
        double a = console.nextDouble();
        System.out.print ("Enter the value b: ");
        double b = console.nextDouble();
        System.out.print ("Enter the value c: ");
        double c = console.nextDouble();
        System.out.println ("Expression value = " + (((a - 3) * b / 2) + c));
    }
}
