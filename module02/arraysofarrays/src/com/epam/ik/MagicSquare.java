package com.epam.ik;

public class MagicSquare {
    private static final int MIN_POSSIBLE_ORDER = 3;
    private static final int ORDER_OF_ODD_MAGIC_SQUARE = 9;

    public static void main(String[] args) {
        int[][] oddMagicSquare = MagicSquare.buildSquareWithOddOrder(ORDER_OF_ODD_MAGIC_SQUARE);
        if (oddMagicSquare != null) {
            System.out.println("\nThe generated magic square:");
            printMatrix(oddMagicSquare);
            System.out.println("\nThe magic constant is " + (ORDER_OF_ODD_MAGIC_SQUARE * ( (int) Math.
                    pow(ORDER_OF_ODD_MAGIC_SQUARE, 2) + 1) / 2));
        } else {
            System.out.println("\nThe order of the magic square must be odd number greater than two.");
        }
    }

    public static int[][] buildSquareWithOddOrder(int orderOfMatrix) {
        int[][] magicSquare = null;
        final boolean isOrderOfMatrixOddNumber = orderOfMatrix % 2 != 0;
        if (orderOfMatrix >= MIN_POSSIBLE_ORDER && isOrderOfMatrixOddNumber) {
            magicSquare = new int[orderOfMatrix][orderOfMatrix];
            final int maxValue = (int) Math.pow(orderOfMatrix, 2);
            final int lastIndex = orderOfMatrix - 1;
            int i = 0;
            int j = orderOfMatrix / 2; // the middle column
            int filler = 1; // the start value
            while (filler <= maxValue) {
                if (i < 0 && j <= lastIndex) {
                    i = lastIndex;
                } else if (i >= 0 && j > lastIndex) {
                    j = 0;
                } else if ( (i < 0 && j > lastIndex) || (magicSquare[i][j] != 0) ) {
                    i += 2;
                    j--;
                }
                magicSquare[i][j] = filler;
                filler++;
                i--;
                j++;
            }
        }
        return magicSquare;
    }

    public static void printMatrix(int[][] matrix) {
        System.out.println();
        for (int[] row : matrix) {
            for (int item : row) {
                System.out.printf("%5d ", item);
            }
            System.out.println();
        }
    }
}
