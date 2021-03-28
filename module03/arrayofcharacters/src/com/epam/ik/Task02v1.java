package com.epam.ik;

import java.util.Scanner;

public class Task02v1 {
    // Замените в строке все вхождения 'word' на 'letter'.
    public static void main(String[]args){
        String input = input();
        print(replace(input));
    }
    static String input(){
        Scanner input = new Scanner(System.in);
        System.out.print("Input word: ");
        String in = input.next();
        return in;
    }
    static String replace(String input){
        String inputReplace = input.replace("word", "letter");
        return inputReplace;
    }
    static void print(String str){
        System.out.println(str);
    }
}
