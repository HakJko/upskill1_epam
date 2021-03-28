package com.epam.ik;

public class Task01 {
    // Задание 1
    // Дан текст (строка). Найдите наибольшее количество подряд идущих пробелов в нем
    public static void main(String[]args){
        String str = " java  java   java     java ";
        print(searchMaxSpace(str));
    }

    static int searchMaxSpace(String str){
        int max = 0;
        int count = 0;
        for (char symbol : str.toCharArray()){
            if (symbol == ' '){
                count++;
                if (count > max){
                    max = count;
                }
            }else {
                count = 0;
            }
        }
        return max;
    }
    static void print(int value){
        System.out.println(value);
    }
}
