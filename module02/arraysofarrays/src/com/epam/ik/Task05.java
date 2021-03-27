package com.epam.ik;

public class Task05 {
    public static void main(String[] args) {
        int n = 6;
        int[][] matrix = new int[n][n];

        int i;
        int j;
        for(i = 0; i < matrix.length; ++i) {
            for(j = 0; j < matrix.length; ++j) {
                matrix[i][j] = 0;
            }
        }

        for(i = 0; i < matrix.length; ++i) {
            for(j = n - i - 1; j >= 0; --j) {
                matrix[i][j] = i + 1;
            }
        }

        for(i = 0; i < n; ++i) {
            for(j = 0; j < n; ++j) {
                System.out.print(matrix[i][j] + "  ");
            }

            System.out.println();
        }

    }
}
