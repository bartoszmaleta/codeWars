package javaExe.kyu7;

import java.util.ArrayList;
import java.util.Arrays;

public class TODOSimpleStringDivisionII {
    public static int solve(String s, int k) {
        String[] sArray = s.split(" ");
//        System.out.println("String array = " + Arrays.toString(sArray));

        int[] sArrayInt = Arrays
                .asList(sArray)
                .stream()
                .mapToInt(Integer::parseInt)
                .toArray();

//        System.out.println("Int array = " + Arrays.toString(sArrayInt));

        int counter = 0;

        for (int i = 0; i < sArray.length; i++) {
            for (int j = 0; j < sArray.length; j++) {
                if (i == j) {
                    continue;
                } else if ((sArrayInt[i] + sArrayInt[j]) % k == 0) {
                    counter++;
                }
            }
        }

//        System.out.println("counter = " + counter);



        return counter;
    }

    public static void main(String[] args) {
        solve("1 2 36 4 8", 2);
    }
}
