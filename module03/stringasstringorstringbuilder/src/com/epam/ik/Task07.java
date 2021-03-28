package com.epam.ik;

public class Task07 {
    // Задание 7
    // Вводится строка. Требуется удалить из нее повторяющиеся символы и все пробелы.
    // Например, если было введено "abc cde def", то должно быть выведено "abcdef"
    public static void main(String[] args) {
        StringBuilder str = new StringBuilder("abc cde def");

        print(redactSpace(redactTwin(str)));
    }
    static StringBuilder redactTwin(StringBuilder str){
        for(int i = 0; i < str.length(); i++){
            char ch1 = str.charAt(i);
            for(int j = i+1; j < str.length(); j++){
                char ch2 = str.charAt(j);
                if(ch1 == ch2){
                    str.deleteCharAt(j);
                }
            }
        }
        return str;
    }
    static StringBuilder redactSpace(StringBuilder str){
        for (int i = 0; i < str.length(); i++){
            if (str.charAt(i) == ' '){
                str.deleteCharAt(i);
            }
        }
        return str;
    }
    static void print(StringBuilder str){
        System.out.println(str);
    }
}
