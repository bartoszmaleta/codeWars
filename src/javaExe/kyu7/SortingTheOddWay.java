package javaExe.kyu7;

import java.util.*;
import java.util.stream.Stream;

import static java.util.Arrays.sort;

public class SortingTheOddWay {
    public static Double[] sortItOut(Double[] array) {
        Double[] result = new Double[array.length];
        List<Double> oddNumbers = new ArrayList<>();
        List<Double> evenNumbers = new ArrayList<>();

        for (Double someNumber : array) {
            Double number = Math.floor(someNumber);
            if (number % 2 != 0) {
                oddNumbers.add(someNumber);
            } else {
                evenNumbers.add(someNumber);
            }
        }

        Collections.sort(oddNumbers);
        evenNumbers.sort(Collections.reverseOrder());

        for (int i = 0; i < oddNumbers.size(); i++) {
            result[i] = oddNumbers.get(i);
        }
        int lastIndex = oddNumbers.size();
        for (Double evenNumber : evenNumbers) {
            result[lastIndex] = evenNumber;
            lastIndex++;
        }

        return result;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(sortItOut(new Double[]{11d, 22d, 33d, 44d, 55d, 55d, 90.4, 4d, 78d})));
    }

    // SECOND SOLUTION
    public static Double[] sortItOut2(Double[] array) {
        Double[] sortedOdds = Arrays.stream(array)
                .filter(e -> Math.floor(e) % 2 != 0)
                .sorted(Comparator.naturalOrder())
                .toArray(Double[]::new);
        Double[] sortedEven = Arrays.stream(array)
                .filter(e -> Math.floor(e) % 2 == 0)
                .sorted(Comparator.reverseOrder())
                .toArray(Double[]::new);
        return Stream.of(sortedOdds, sortedEven).flatMap(Stream::of).toArray(Double[]::new);
    }

    // THIRD SOLUTION
    public static Double[] sortItOut3(Double[] array) {
        sort(array, (a, b) -> (int) (Math.floor(a % 2) != 0
                ? Math.floor(b % 2) != 0 ? Math.floor(a - b) : -1
                : Math.floor(b % 2) == 0 ? Math.floor(b - a) : 1));
        return array;
    }
}
