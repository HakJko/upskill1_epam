package com.epam.ik;

import java.util.Locale;
import java.util.Scanner;

public class Task06 {
        static int x = -2;
        static int y = 2;

    public static void main(String[] args) {

        boolean flag1 = -4 <= x && x <= 4;
        boolean flag2 = -3 <= y && y <= 0;
        boolean flag3 = -2 <= x && x <= 2;
        boolean flag4 = 0 <= y && y <= 4;

        if ((flag1 && flag2) || (flag3 && flag4)){
            System.out.println("true");
        } else{
            System.out.println(false);
        }

        analog();
    }

    public static void analog() {
        System.out.println ((x<=4&&x>=-4&&y<=0&&y>=-3)||(x<=2&&x>=-2&&y<=4&&y>0));
    }
}
