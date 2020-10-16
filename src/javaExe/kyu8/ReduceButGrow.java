package javaExe.kyu8;

import java.util.Arrays;
import java.util.stream.IntStream;

public class ReduceButGrow {
    public static int grow(int[] x){
        int product = 1;
        for (int num : x) {
            product *= num;
        }
        return product;
    }

    // SECOND OPTION
    public static int grow2(int[] x){
        return IntStream.of(x).reduce(1, (a, b) -> a * b);
    }

    // THIRD OPTION
    public static int grow3(int[] x){
        return Arrays.stream(x).reduce(1, (a, b) -> a * b);
    }

}
