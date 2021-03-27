package com.epam.ik;

public class Task03 {
    public static void main(String[] args) {
        int[][] matrix = new int[5][5];
        int[][] matrixFill = createdMatrix(matrix);
        printLine(matrixFill);
        printColumn(matrixFill);
    }

    static int[][] createdMatrix(int[][] matrix) {
        for(int i = 0; i < 5; ++i) {
            for(int j = 0; j < 5; ++j) {
                matrix[i][j] = (i + 11) * (j + 11);
                System.out.print(matrix[i][j] + "\t");
            }

            System.out.println();
        }

        return matrix;
    }

    static void printLine(int[][] marixFill) {
        for(int i = 0; i < marixFill.length; ++i) {
            System.out.print(marixFill[i][1] + "  ");
        }

        System.out.println();
    }

    static void printColumn(int[][] matrixFill) {
        for(int i = 0; i < matrixFill.length; ++i) {
            int j = 0;
            if (j < matrixFill.length) {
                System.out.println(matrixFill[i][2] + "  ");
            }
        }

    }
}
