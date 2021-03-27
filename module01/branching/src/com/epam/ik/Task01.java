package com.epam.ik;

public class Task01 {
    public static void main(String[] args) {
        int[] anglesArr = new int[]{30, 90};
        int sum = 180;
        boolean isTriangle = true;
        boolean isOrthogonal = true;
        int[] var5 = anglesArr;
        int var6 = anglesArr.length;

        for(int var7 = 0; var7 < var6; ++var7) {
            int angle = var5[var7];
            sum -= angle;
            if (sum <= 0) {
                isTriangle = false;
                break;
            }

            if (!isOrthogonal) {
                isOrthogonal = angle == 90 || sum == 90;
            }
        }

        System.out.println("isTriangle: " + isTriangle);
        if (isTriangle) {
            System.out.println("isOrthogonal: " + isOrthogonal);
        }
    }
}
