package com.epam.ik;

public class Task10 {
    // Задание 10
    // Строка X состоит из нескольких предложений, каждое из которых кончается точкой, восклицательным или вопросительным знаком.
    // Определить количество предложений в строке X
    public static void main(String[] args) {
        String x = " This is Java. Is the best in world! How do I write Java cod?";
        int count = 0;
        for (int i = 0; i < x.length(); i++){
            if (x.charAt(i) == '.' || x.charAt(i) == '!' || x.charAt(i) == '?'){
                count++;
            }
        }
        System.out.println("Quantity of sentences in the text: " + count);
    }
}
