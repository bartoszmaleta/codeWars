package javaExe.kyu7;

public class FindSumOfTopLeftToBottomRightDiagonals {
    public static int diagonalSum(final int[][] matrix) {
        int counter = 0;
        int sum = 0;

        for (int[] ints : matrix) {
            sum += ints[counter];
            counter++;
        }

        return sum;
    }

    public static void main(String[] args) {
        System.out.println("==========================");
        int[][] matrix = new int[][]{{12}};
        System.out.println(diagonalSum(matrix));

        System.out.println("==========================");
        matrix = new int[][]{{1, 2}, {3, 4}};
        System.out.println(diagonalSum(matrix));

        System.out.println("==========================");
        matrix = new int[][]{{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        System.out.println(diagonalSum(matrix));


    }

    public static int diagonalSum2(final int[][] matrix)
    {
        int sum = 0;
        for (int i = 0; i < matrix.length; i++) {
            sum += matrix[i][i];
        }
        return sum;
    }
}
