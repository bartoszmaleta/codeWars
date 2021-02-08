package javaExe.kyu7;

import java.util.stream.IntStream;

public class ReturnTheFirstMMultiplesOfN {
    public static int[] multiples(int m, int n) {
        int[] arr = new int[m];
        for (int i = 1; i <= m; i++) {
            arr[i- 1] = n * i;
        }
        return arr;
    }

    // SECOND OPTION
    public static int[] multiples2(int m, int n) {
        return IntStream.rangeClosed(1, m)
                .map(x -> x * n)
                .toArray();
    }
}
