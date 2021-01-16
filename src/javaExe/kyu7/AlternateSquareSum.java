package javaExe.kyu7;

import java.util.stream.IntStream;

public class AlternateSquareSum {
    public static int alternateSqSum(int[] arr) {
        if (arr.length == 0) return 0;

        int sqSum = 0;

        for (int i = 0; i < arr.length; i++) {
            if (i % 2 != 0) {
                sqSum += Math.pow(arr[i], 2);
            } else {
                sqSum += arr[i];
            }
        }

        return sqSum;
    }

    // SECOND OPTION
    public static int alternateSqSum2(int[] arr) {
        int sum = 0;
        for (int i=0; i<arr.length; i++) {
            sum += (i % 2 == 0) ? arr[i] : arr[i] * arr[i];
        }
        return sum;
    }

    // THIRD OPTION
    public static int alternateSqSum3(int[] arr) {
        return IntStream.range(0, arr.length).map(i -> ((i + 1) % 2) * arr[i] + (i % 2) * arr[i] * arr[i]).sum();
    }

    public static void main(String[] args) {
        System.out.println(alternateSqSum(new int[]{11, 12, 13, 14, 15}));

    }
}
