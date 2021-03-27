package com.epam.ik;

public class Task04 {
    public static void main(String[] args) {
        int k = 1;
        int num = 4;
        int n = 4;
        int[][] matrix = new int[n][n];

        int i;
        int j;
        for(i = 0; i < matrix.length; ++i) {
            if (i % 2 == 0) {
                for(j = 0; j < matrix.length; ++j) {
                    matrix[i][j] = k++;
                }

                k = 1;
            } else {
                for(j = 0; j < matrix.length; ++j) {
                    matrix[i][j] = num--;
                }

                num = n;
            }
        }

        for(i = 0; i < matrix.length; ++i) {
            for(j = 0; j < matrix.length; ++j) {
                System.out.print(matrix[i][j] + " ");
            }

            System.out.println();
        }

    }
}
