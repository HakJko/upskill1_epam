package com.epam.ik;

public class Task02 {
    public static void main(String[] args) {
        int n = 4;
        int[][] matrix = new int[n][n];
        int[][] matrixFill = createdMatrix(n, matrix);
        diagFirst(n, matrixFill);
        diagSecond(n, matrixFill);
    }

    static int[][] createdMatrix(int n, int[][] matrix) {
        for(int i = 0; i < n; ++i) {
            for(int j = 0; j < n; ++j) {
                matrix[i][j] = (i + 11) * (j + 11);
                System.out.print(matrix[i][j] + "\t");
            }

            System.out.println();
        }

        return matrix;
    }

    static void diagFirst(int n, int[][] matrixFill) {
        for(int i = 0; i < n; ++i) {
            System.out.print("\n" + matrixFill[i][n - 1 - i] + " ");
        }

        System.out.println();
    }

    static void diagSecond(int n, int[][] matrixFill) {
        int i = 0;
        if (i < n) {
            for(int j = 0; j < n; ++j) {
                System.out.print("\n" + matrixFill[j][j] + " ");
            }
        }

    }
}
