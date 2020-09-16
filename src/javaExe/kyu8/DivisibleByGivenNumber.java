package javaExe.kyu8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class DivisibleByGivenNumber {

    public static int[] divisibleBy(int[] numbers, int divider) {
        return Arrays.stream(numbers).boxed().filter(number -> number % divider == 0).mapToInt(number -> number).toArray();
    }

    //EASIER TO UNDERSTAND
    public static int[] divisibleBy2(int[] numbers, int divider) {
        List<Integer> result = Arrays.stream(numbers).boxed().filter(number -> number % divider == 0).collect(Collectors.toList());
        return result.stream().mapToInt(number -> number).toArray();
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(divisibleBy(new int[]{1, 2, 3, 4, 5, 6}, 2)));
        System.out.println(Arrays.toString(divisibleBy(new int[]{1, 2, 3, 4, 5, 6}, 3)));
        System.out.println(Arrays.toString(divisibleBy(new int[]{0, 1, 2, 3, 4, 5, 6}, 4)));
    }
}