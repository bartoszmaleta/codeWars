package javaExe.kyu8;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

public class MultipleOfIndex {
    public static int[] multipleOfIndex(int[] array) {
        List<Integer> multiplies = new ArrayList<>();
        for (int i = 1; i < array.length; i++) {
            if (Math.abs(array[i]) % i == 0) multiplies.add(array[i]);
        }
        return multiplies.stream().mapToInt(i -> i).toArray();
    }

    // SECOND OPTION
    public static int[] multipleOfIndex2(int[] array) {
        return IntStream.range(1, array.length)
                .filter(i -> array[i] % i == 0)
                .map(i -> array[i])
                .toArray();
    }
}
