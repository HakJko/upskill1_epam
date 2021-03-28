package com.epam.ik;

import java.util.Scanner;

public class Task03 {
    // Задание 3
    // Проверить, является ли заданное слово палиндромом
    public static void main(String[] args) {
        String word = input();
        if (isPalindrome(word)){
            System.out.println("This Palindrome!");
        }else {
            System.out.println("This not Palindrome!");
        }
    }
    static String input(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input word: ");
        String word = scanner.nextLine();
        return word;
    }
    static String revers(String word){
        String reversStr = "";
        for (int i = word.length()-1; i >= 0; --i){
            reversStr += word.charAt(i);
        }
        return reversStr;
    }
    static boolean isPalindrome(String str){
        String reversStr = revers(str);
        boolean flag = str.equals(reversStr);
        return flag;
    }

}
