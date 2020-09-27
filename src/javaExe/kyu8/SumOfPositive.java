package javaExe.kyu8;

import java.util.Arrays;

public class SumOfPositive {
    public static int sum(int[] arr){
        int sum = 0;
        for (int number : arr) {
            if (number > 0) {
                sum += number;
            }
        }
        return sum;
    }
    public static int sum2(int[] arr){
        return Arrays.stream(arr).filter(number -> number > 0).sum();
    }
}
