package com.epam.ik;
public class Task04 {
    // Задание 4
    // С помощью функции копирования и операции конкатенации составить из частей слова “информатика” слово “торт”.
    public static void main(String[] args) {
        String wordInfo = "информатика";

        print(createString(copyInArray(wordInfo)));
    }
    static char[] copyInArray(String wordInfo){
        char[] arrayNewWord = new char[4];
        wordInfo.getChars(7, 8, arrayNewWord, 0);
        wordInfo.getChars(3, 4, arrayNewWord, 1);
        wordInfo.getChars(4, 5, arrayNewWord, 2);
        wordInfo.getChars(7, 8, arrayNewWord, 3);
        return arrayNewWord;
    }
    static String createString(char[] arrayNewWord){
        String newWord = "";
        for (int i = 0; i < arrayNewWord.length; i++){
            newWord = newWord.concat(String.valueOf(arrayNewWord[i]));
        }
        return newWord;
    }
    static void print(String newWord){
        System.out.println(newWord);
    }

}
