package com.epam.ik;

public class Task05 {
    // Задание 5
    // Удалить в строке все лишние пробелы, то есть серии подряд идущих пробелов заменить на одиночные пробелы. Крайние пробелы в строке удалить
    public static void main(String[]args){
        String str = "  java   java  java     java   ";
        print(str);
        print(extremeSpace(cleanSpace(str)));
    }

    public static String cleanSpace(String str){
        str = str.replaceAll("[\\s]{2,}", " ");
        return str;
    }

    public static String extremeSpace(String str){
        str = str.trim();
        return str;
    }

    public static void print(String str){
        System.out.println(str);
    }
}
