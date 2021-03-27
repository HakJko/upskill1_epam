package com.epam.ik;

public class Task06 {
    public static void main(String[] args) {
        int n = 7;
        int[][] matrix = new int[n][n];

        for(int i = 1; i < n; ++i) {
            for(int j = 1; j < n; ++j) {
                if ((i <= j && j <= n - i) | (i >= j && j >= n - i)) {
                    matrix[i][j] = 1;
                } else {
                    matrix[i][j] = 0;
                }

                System.out.print(matrix[i][j] + "  ");
            }

            System.out.println();
        }

    }
}
