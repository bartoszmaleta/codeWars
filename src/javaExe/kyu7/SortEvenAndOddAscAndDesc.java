package javaExe.kyu7;

import java.util.*;
import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class SortEvenAndOddAscAndDesc {
    public static int[] menFromBoys(final int[] values) {

        List<Integer> valuesDistinctList = Arrays.stream(values).boxed().distinct().collect(Collectors.toList());

        List<Integer> oddNums =  new ArrayList<>();
        List<Integer> evenNums =  new ArrayList<>();

        for (int num : valuesDistinctList) {
            if (num % 2 != 0) {
                oddNums.add(num);
            } else {
                evenNums.add(num);
            }
        }
        oddNums.sort(Comparator.reverseOrder());
        evenNums.sort(Comparator.naturalOrder());

        List<Integer> together = new ArrayList<>(evenNums);
        together.addAll(oddNums);

        int[] togetherArray = together.stream().mapToInt(i -> i).toArray();
        return togetherArray;
    }

    public static void main(String[] args) {
//        System.out.println(Arrays.toString(menFromBoys(new int[]{7, 3, 14, 17})));
//        System.out.println(Arrays.toString(menFromBoys(new int[]{2, 43, 95, 90, 37})));
//        System.out.println(Arrays.toString(menFromBoys(new int[]{20, 33, 50, 34, 43, 46})));
        System.out.println(Arrays.toString(menFromBoys(new int[]{82, 91, 72, 76, 76, 100, 85})));
//        System.out.println(Arrays.toString(menFromBoys(new int[]{2, 15, 17, 15, 2, 10, 10, 17, 1, 1})));
    }

    // SECOND OPTION
    public static int[] menFromBoys2(final int[] values) {
        int arrEven [] = Arrays.stream(values).filter(a->a%2==0).distinct().sorted().toArray();
        int arrOdd [] = Arrays.stream(values).filter(a->a%2!=0).distinct().map(a->a*(-1)).sorted().map(a->a*(-1)).toArray();

        return IntStream.concat(IntStream.of(arrEven),IntStream.of(arrOdd)).toArray();
    }

    // THIRD OPTION
    public static int[] menFromBoys3(final int[] values) {
        return Arrays.stream(values)
                .distinct()
                .boxed()
                .sorted(Comparator.comparing(i -> i % 2 == 0 ? i : -i))
                .sorted(Comparator.comparing(i -> Math.abs(i % 2)))
                .mapToInt(i -> i)
                .toArray();
    }






    }
