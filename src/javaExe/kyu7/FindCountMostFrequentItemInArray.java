package javaExe.kyu7;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

// LINK: https://www.codewars.com/kata/56582133c932d8239900002e/solutions/java

public class FindCountMostFrequentItemInArray {
    public static int mostFrequentItemCount(int[] collection) {
        if (collection.length == 0) return 0;
        Map<Integer, Integer> stats = new HashMap<>();

        for (int number : collection) {
            if (stats.get(number) != null) {
                stats.put(number, stats.get(number) + 1);
            } else {
                stats.put(number, 1);
            }
//            stats.merge(number, 1, Integer::sum); // THE SAME AS ABOVE
        }
        int[] arr = stats.values().stream().mapToInt(element -> element).toArray();
//        return Arrays.stream(arr).max().orElseThrow(InvalidAlgorithmParameterException::new);
        return Arrays.stream(arr).max().getAsInt();
    }
}
