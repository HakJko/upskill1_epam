package com.epam.ik;

import java.util.ArrayList;

public class Task01 {
    public static void main(String[] args) {
        int n = 5;
        int m = 5;
        int[][] matrix = new int[n][m];
        ArrayList<Integer> column = new ArrayList();
        int[][] fillM = fillMatrix(n, m, matrix);
        ArrayList<Integer> suitableColumns = oddColumns(n, m, matrix, column);
        print(n, m, fillM, suitableColumns);

        for(int i = 0; i < n; ++i) {
            for(int j = 0; j < m; ++j) {
                System.out.print(matrix[i][j] + "\t");
            }

            System.out.println();
        }

    }

    static int[][] fillMatrix(int n, int m, int[][] matrix) {
        for(int i = 0; i < n; ++i) {
            for(int j = 0; j < m; ++j) {
                matrix[i][j] = (i + 1) * (j + 1);
                matrix[0][0] = 20;
                matrix[0][1] = 20;
                matrix[0][2] = 20;
                matrix[0][3] = 30;
                matrix[0][4] = 40;
            }
        }

        return matrix;
    }

    static ArrayList<Integer> oddColumns(int n, int m, int[][] matrix, ArrayList<Integer> column) {
        for(int k = 0; k < n; ++k) {
            for(int t = 1; t < m; t += 2) {
                if (matrix[0][t] > matrix[n - 1][t]) {
                    column.add(k);
                }
            }
        }

        return column;
    }

    static void print(int n, int m, int[][] fillM, ArrayList<Integer> column) {
        int index = 0;

        for(int i = 0; i < n; ++i) {
            for(int j = 1; j < m; j += 2) {
                System.out.print(fillM[(Integer)column.get(index)][j] + "\t");
                ++index;
            }

            System.out.println();
        }

    }
}
