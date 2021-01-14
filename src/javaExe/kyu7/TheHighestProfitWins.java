package javaExe.kyu7;

import java.util.Arrays;

public class TheHighestProfitWins {
    public static int[] minMax(int[] arr) {
        return new int[] {Arrays.stream(arr).min().getAsInt(), Arrays.stream(arr).max().getAsInt()};
    }

    // SECOND OPTION
    public static int[] minMax2(int[] arr) {
        Arrays.sort(arr);
        return new int[]{arr[0],arr[arr.length-1]};
    }
}
