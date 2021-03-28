package com.epam.ik;

public class Task03 {
    // Задание 3
    // В строке найти количество цифр
    public static void main(String[]args){
        String str = "`123456java789";

        print(firstSolution(str));
        print(secondSolution(str));
    }

    public static int firstSolution(String str){
        int length = str.length() - str.replaceAll("\\d+", "").length();
        return length;
    }

    public static int secondSolution(String str){
        int count = 0;
        for (int i = 0; i < str.length(); i++){
            if (Character.isDigit(str.charAt(i))){
                count++;
            }
        }
        return count;
    }

    public static void print(int value){
        System.out.println("Quantity numbers: " + value);
    }

}
