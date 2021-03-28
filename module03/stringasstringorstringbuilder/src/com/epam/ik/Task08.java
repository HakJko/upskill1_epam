package com.epam.ik;

public class Task08 {
    // Задание 8
    // Вводится строка слов, разделенных пробелами. Найти самое длинное слово и вывести его на экран.
    // Случай, когда самых длинных слов может быть несколько, не обрабатывать
    public static void main(String[] args) {
        String str = "j ja jav java line";
        String longestWord = "";
        String word = "";
        for (int i = 0; i < str.length(); i++){
            if (str.charAt(i) != ' '){
                word += str.charAt(i);
            }else {
                word = "";
            }
            if (word.length() > longestWord.length()){
                longestWord = word;
            }
        }
        System.out.println(longestWord);
    }
}
