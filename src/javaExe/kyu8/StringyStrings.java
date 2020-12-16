package javaExe.kyu8;

import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class StringyStrings {
    public static String stringy(int size) {
        StringBuilder sb = new StringBuilder();
        boolean isOne = true;
        for (int i = 0; i < size; i++) {
            if (isOne) {
                sb.append("1");
                isOne = false;
            } else {
                sb.append("0");
                isOne = true;
            }
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        System.out.println(stringy(3));
        System.out.println(stringy(6));
        System.out.println(stringy(4));
        System.out.println(stringy(1));
        System.out.println(stringy(12));
    }

    // SECOND OPTION
    public static String stringy2(int size) {
        return IntStream.rangeClosed(1, size)
                .map(i -> i % 2)
                .mapToObj(String::valueOf)
                .collect(Collectors.joining(""));
    }
}
giu