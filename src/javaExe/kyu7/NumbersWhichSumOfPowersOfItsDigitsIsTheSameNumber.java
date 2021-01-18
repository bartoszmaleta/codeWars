package javaExe.kyu7;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class NumbersWhichSumOfPowersOfItsDigitsIsTheSameNumber {

    // HELPER
    public static long[] eqSumPowDig2(long hmax, int exp) {
        if (hmax < 153) return new long[0];
        List<Long> result = new ArrayList<>();

        for (int i = 152; i <= hmax; i++) {

            String stringI = String.valueOf(i);
            int[] arrayOfNumber = new int[stringI.length()];

            for (int j = 0; j < stringI.length(); j++) {
                arrayOfNumber[j] = Character.getNumericValue(stringI.charAt(j));
            }
            System.out.println("array = " + Arrays.toString(arrayOfNumber));

            int sum = 0;
            Math.pow(i, exp);
            for (int k = 0; k < arrayOfNumber.length; k++) {
                sum += Math.pow(arrayOfNumber[k], exp);
            }

            System.out.println("sum = " + sum);

            if (sum == i) result.add(Long.valueOf(sum));
        }

        System.out.println();
        System.out.println("result = " + result);
        System.out.println();

        long[] resultLongArr = result.stream().mapToLong(element -> element).toArray();
        return resultLongArr;

    }

    public static void main(String[] args) {

        System.out.println(Arrays.toString(eqSumPowDig(100, 2)));
        System.out.println("==========================");
        System.out.println(Arrays.toString(eqSumPowDig(200, 3)));
        System.out.println("==========================");
        System.out.println(Arrays.toString(eqSumPowDig(370, 3)));

    }

    public static long[] eqSumPowDig(long hmax, int exp) {
        if (hmax < 153) return new long[0];
        List<Long> result = new ArrayList<>();

        for (int i = 152; i <= hmax; i++) {

            String stringI = String.valueOf(i);
            int[] arrayOfNumber = new int[stringI.length()];

            for (int j = 0; j < stringI.length(); j++) {
                arrayOfNumber[j] = Character.getNumericValue(stringI.charAt(j));
            }

            int sum = 0;
            for (int j : arrayOfNumber) {
                sum += Math.pow(j, exp);
            }

            if (sum == i) result.add((long) sum);
        }

        return result.stream().mapToLong(element -> element).toArray();
    }
}
