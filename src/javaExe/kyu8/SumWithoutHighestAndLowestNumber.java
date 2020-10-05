package javaExe.kyu8;

import java.util.Arrays;

import static java.util.stream.IntStream.of;

public class SumWithoutHighestAndLowestNumber {
    public static int sum(int[] numbers) {
        if (numbers == null || numbers.length <= 1) return 0;
        Arrays.sort(numbers);

        return Arrays.stream(numbers).sum() - numbers[0] - numbers[numbers.length - 1];
    }

    // SECOND OPTION
    public static int sum2(int[] numbers) {
        return (numbers == null || numbers.length <= 1) ? 0 : of(numbers).sum() - of(numbers).max().getAsInt() - of(numbers).min().getAsInt();
    }
}
