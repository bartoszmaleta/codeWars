package javaExe.kyu8;

import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class CountTheSheep {
    public static String countingSheep3(int num) {
        StringBuilder sb = new StringBuilder();
        for (int i = 1; i <= num; i++) {
            sb.append(i).append(" sheep...");
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        System.out.println(countingSheep(3));
    }

    // SECOND OPTION
    public static String countingSheep(int num) {
        return IntStream.rangeClosed(1, num)
                .mapToObj(i -> i + " sheep...")
                .collect(Collectors.joining());

    }
}
