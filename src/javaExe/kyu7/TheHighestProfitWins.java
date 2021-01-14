package javaExe.kyu7;

import java.util.Arrays;

public class TheHighestProfitWins {
    public static int[] minMax(int[] arr) {
        return new int[] {Arrays.stream(arr).min().getAsInt(), Arrays.stream(arr).max().getAsInt()};
    }
}
