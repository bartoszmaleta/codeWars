package javaExe.kyu8;

import java.util.Arrays;

public class CalculateAverage {
    public static double find_average(int[] array){
        int sum = 0;
        for (int number : array) {
            sum += number;
        }
        return sum / array.length;
    }

    // SECOND OPTION
    public static double find_average2(int[] array){
        return Arrays.stream(array).average().getAsDouble();
    }
}
