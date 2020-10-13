package javaExe.kyu8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class ReversedSequence {
    public static int[] reverse(int n){
        List<Integer> numbers = new ArrayList<>();
        for (int i = n; i > 0; i--) {
            numbers.add(i);
        }
        return numbers.stream().mapToInt(Integer::intValue).toArray();
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(reverse(5)));
    }

    // SECOND OPTION
    public static int[] reverse2(int n) {
        return IntStream.range(-n, 0).map(Math::abs).toArray();
    }

    // THIRD OPTION
    public static int[] reverse3(int n){
        return IntStream.iterate(n, i -> i - 1).limit(n).toArray();
    }
}
