package com.epam.ik;

public class Task05v1 {
    // Задание 5 Решение 1
    // Подсчитать, сколько раз среди символов заданной строки встречается буква “а”
    public static void main(String[] args) {
        String str = " jAva  java   java     java aA";
        str = str.toLowerCase();
        print(countA(str));
    }
    static int countA(String str){
        int count = 0;
        char[] arrSymbol = str.toCharArray();
        for (char symbol : arrSymbol){
            if (symbol == 'a'){
                count++;
            }
        }
        return count;
    }
    static void print(int value){
        System.out.println(value);
    }
}
