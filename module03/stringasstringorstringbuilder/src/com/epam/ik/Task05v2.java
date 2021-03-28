package com.epam.ik;

public class Task05v2 {
    // Задание 5 Решение 2
    // Подсчитать, сколько раз среди символов заданной строки встречается буква “а”
    public static void main(String[] args) {
        String str = "java  java   java     java aa";
        str = str.toLowerCase();
        char[] chars = str.toCharArray();
        int [] indexOfRusChars = new int[1200];

        for(int i = 0; i < chars.length; i++) {
            indexOfRusChars[chars[i]]++;
        }

        for (int i = 1000; i < indexOfRusChars.length; i++) {
            if (indexOfRusChars[i] != 0)
                System.out.println((char)i + " " + indexOfRusChars[i] + " раз");
        }
    }

}
