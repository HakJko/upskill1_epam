package com.epam.ik;

public class Task02v2 {
    public static void main(String[]args){
        String str1="Если сделал ляп или даже два. Этот ляп только твой ляп не ляп.";
        String zamStr = str1.replace("ляп", "-ой-");
        int replace = (zamStr.length() - zamStr.replace("-ой-", "").length())/4;
        System.out.println(zamStr);
        System.out.println("Кол-во замен: " + replace);
    }
}
