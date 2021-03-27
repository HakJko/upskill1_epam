package com.epam.ik;

import java.util.Locale;
import java.util.Scanner;

public class Task02 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in).useLocale(Locale.US);
        System.out.print ("Enter the value a (cannot be 0): ");
        double a = console.nextDouble();
        System.out.print("Enter the value b: ");
        double b = console.nextDouble();
        System.out.print("Enter the value c: ");
        double c = console.nextDouble();
        if (a!=0 && (Math.pow(b, 2.0) + 4*a*c) >= 0) {

            double z = (b + Math.sqrt(Math.pow(b, 2.0) + 4 * a * c)) /
                    (2 * a) - (Math.pow(a, 3.0) * c) + (Math.pow(b, -2.0));
            System.out.println("Expression value = " + z);
        }
        else {
            System.out.print("Wrong values of arguments, try again!");
        }
    }
}
