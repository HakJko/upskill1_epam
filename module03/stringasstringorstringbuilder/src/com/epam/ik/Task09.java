package com.epam.ik;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task09 {
    // Задание 9
    // Посчитать количество строчных (маленьких) и прописных (больших) букв в введенной строке. Учитывать только английские буквы
    public static void main(String[] args) {
        String str = "Java The Best Джава";

        System.out.println(countLow(str));
        System.out.println(countUp(str));
    }
    static int countLow(String str){
        int countLow = 0;
        Pattern pattern = Pattern.compile("([a-z])");
        Matcher matcher = pattern.matcher(str);
        while (matcher.find()){
            countLow++;
        }
        return countLow;
    }
    static int countUp(String str){
        int countUp = 0;
        Pattern pattern = Pattern.compile("([A-Z])");
        Matcher matcher = pattern.matcher(str);
        while (matcher.find()){
            countUp++;
        }
        return countUp;
    }
}
