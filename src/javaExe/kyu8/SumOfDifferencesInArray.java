package javaExe.kyu8;

import java.util.Arrays;
import java.util.Collections;

public class SumOfDifferencesInArray {
    public static int sumOfDifferences(int[] arr) {
        if (arr.length <= 1) return 0;
        Integer[] arr2 = getIntegers(arr);

        int sum = 0;
        for (int i = 0; i < arr2.length - 1; i++) {
            sum += (arr2[i] - arr2[i + 1]);
        }
        return sum;
    }

    private static Integer[] getIntegers(int[] arr) {
        Integer[] arr2 = new Integer[arr.length];
        for (int i = 0; i < arr.length; i++) {
            arr2[i] = arr[i];
        }
        Arrays.sort(arr2, Collections.reverseOrder());
        return arr2;
    }

    // SECOND OPTION
    public static int sumOfDifferences2(int[] arr) {
        Arrays.sort(arr);
        return arr.length <= 1 ? 0 : arr[arr.length-1] - arr[0];
    }


}
