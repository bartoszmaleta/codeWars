package javaExe.kyu7;

import java.util.Arrays;

public class MatrixAdditionOfElements {
    public static int sumOfElements(int[][] matrix) {
        int sum = 0;
        for (int[] ints : matrix) {
            for (int anInt : ints) {
                sum += anInt;
            }
        }
        return sum;
    }

    // SECOND OPTION
    public static int sumOfElements2(int matrix[][]) {
        return Arrays.stream(matrix).flatMapToInt(Arrays::stream).sum();
    }
}
