package com.epam.ik;

import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task04 {
    // Задание 4
    // В строке найти количество чисел
    public static void main(String[]args){
        String str = "72java723java7231";

        countNumbersFirst(str);
        print(countNumbersSecond(str));

    }

    public static int countNumbersFirst(String str){
        int count = 0;
        Pattern patt = Pattern.compile("-?\\d+");
        Matcher match = patt.matcher(str);
        while (match.find()){
            System.out.println(match.group());
            count++;
        }
        return count;
    }

    public static String countNumbersSecond(String str){
        str = str.replaceAll("[^0-9]+", " ");
        return str;
    }

    public static void print(String str){
        System.out.println(Arrays.asList(str.trim().split(" ")));
    }

}
