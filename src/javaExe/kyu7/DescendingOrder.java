package javaExe.kyu7;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.stream.Collectors;

public class DescendingOrder {
    public static int sortDesc(final int num) {

        String numString = String.valueOf(num);
        String[] numStringArray = numString.split("");
//        System.out.println("numStringArray = " + Arrays.toString(numStringArray));
        Arrays.sort(numStringArray);
//        System.out.println("numStringArray after sort = " + Arrays.toString(numStringArray));

        String numStringSorted = "";
        for (String numStringFromArray : numStringArray) {
            numStringSorted += numStringFromArray;
        }
//        System.out.println("numStringSorted = " + numStringSorted);
//
//        System.out.println("numString = " + numStringSorted);

        StringBuilder numSB = new StringBuilder();
        numSB.append(numStringSorted);
//        System.out.println("numSB = " + numSB);

        numSB.reverse();
//        System.out.println("numSB reversed = " + numSB);

        int result = Integer.parseInt(String.valueOf(numSB));
//        System.out.println("result int = " + result);

        return result;
    }

    public static void main(String[] args) {
        sortDesc(21445);
    }

    public static int sortDesc2(final int num) {
        String[] array = String.valueOf(num).split("");
        Arrays.sort(array, Collections.reverseOrder());
        return Integer.parseInt((String.join("", array)));
    }
    public static int sortDesc3(final int num) {
        return Integer.parseInt((String.valueOf(num)
                .chars()
                .mapToObj(i -> String.valueOf(Character.getNumericValue(i)))
                .sorted(Comparator.reverseOrder())
                .collect(Collectors.joining())));
    }
}
