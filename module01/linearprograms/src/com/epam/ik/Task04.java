package com.epam.ik;

import java.util.Locale;
import java.util.Scanner;

public class Task04 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in).useLocale(Locale.US);
        System.out.print ("Enter the real number in the format \"nnn.ddd\": ");
        double R = console.nextDouble();
        String[] partsOfNumber = String.valueOf(R).split("\\.");
        if (partsOfNumber[0].length() == 3 && partsOfNumber[1].length() == 3) {
            String newNumberString = (partsOfNumber[1] + "." + partsOfNumber[0]);
            R = Double.parseDouble(newNumberString);
            System.out.println (R);
        }
        else {
            System.out.println ("an invalid number format!");
        }
    }
}
