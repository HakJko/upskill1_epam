package com.epam.ik;

public class Task02 {
    // Задание 2
    // В строке вставить после каждого символа 'a' символ 'b'.
    public static void main(String[]args){
        StringBuilder str = new StringBuilder(" java javac javacp aaaaa");
    print(addingB(str));
    }
    static StringBuilder addingB(StringBuilder str){
        char b = 'b';
        for (int i = 0; i < str.length(); i++){
            if (str.charAt(i) == 'a'){
                str.insert(++i, b);
            }
        }
        return str;
    }
    static void print(StringBuilder str){
        System.out.println(str);
    }
}
