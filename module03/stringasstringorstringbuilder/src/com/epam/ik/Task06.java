package com.epam.ik;

public class Task06 {
        // Задание 6
        // Из заданной строки получить новую, повторив каждый символ дважды
    public static void main(String[] args) {
        String str = "java";
        createdNewStr(str);
    }
    static void createdNewStr(String str){
        String strSec = "";

        for (int i = 0; i < str.length(); i++){
            int count = 2;
            while (count != 0){
                strSec += str.charAt(i);
                count--;
            }
        }
        System.out.println(strSec);
    }
}
