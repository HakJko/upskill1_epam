package com.epam.ik;

public class Task01 {
    // Задание 1
    // Дан массив названий переменных в camelCase. Преобразовать названия в snake_case
    static final String[] arrStr = {"taskFirst", "taskSecond", "taskThird", "taskFourth"};

    public static void main(String[]args){
        transformation(arrStr);
    }
    static String[] transformation(String[] arrStr){
        for (String line : arrStr){
            line = camelToSnake(line);
            print(line);
        }
        return arrStr;
    }
    public static String camelToSnake(String str){
        String regex = "([a-z])([A-Z]+)";
        String replacement = "$1_$2";
        str = str.replaceAll(regex, replacement).toLowerCase();
        return str;
    }
    public static void print(String str){
        System.out.println(str);
    }
}
