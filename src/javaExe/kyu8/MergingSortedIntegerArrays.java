package javaExe.kyu8;

import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class MergingSortedIntegerArrays {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(mergeArrays(new int[] {1, 3, 5}, new int[] {2, 4, 6})));
    }

    public static int[] mergeArrays(int[] first, int[] second) {
        Stream<Integer> s1 = IntStream.of(first).boxed();
        Stream<Integer> s2 = IntStream.of(second).boxed();
        return (Stream.concat(s1, s2).distinct().sorted().mapToInt(i -> i).toArray());
    }
}
