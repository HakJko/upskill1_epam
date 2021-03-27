package com.epam.ik;

public class Task04 {
    public static void main(String[] args) {
        int[] hole = new int[]{5, 2};
        int[] brick = new int[]{4, 3, 2};
        System.out.println(isRelevant(hole, brick));
    }

    public static boolean isRelevant(int[] hole, int[] brick) {
        for(int i = 0; i < brick.length; ++i) {
            if (hole[0] >= brick[i]) {
                for(int j = 0; j < brick.length; ++j) {
                    if (j != i && hole[1] >= j) {
                        System.out.println("Кирпич пройдёт в отверстие");
                        return true;
                    }
                }
            }
        }

        return false;
    }
}
