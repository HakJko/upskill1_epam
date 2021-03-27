package com.epam.ik;

public class Task05 {
    public static void main(String[] args) {
        String allSymbols = "Hello Ihar! 12345 Привет Мир";
        int num = 0;
        char[] var3 = allSymbols.toCharArray();
        int var4 = var3.length;

        for(int var5 = 0; var5 < var4; ++var5) {
            char symbol = var3[var5];
            String hexSymbol = String.format("", Integer.valueOf(symbol));
            System.out.println("Symbol: " + num + " " + symbol + " " + hexSymbol + " " + symbol);
            ++num;
        }

    }
}
