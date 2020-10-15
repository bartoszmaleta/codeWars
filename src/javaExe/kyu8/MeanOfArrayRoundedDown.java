package javaExe.kyu8;

import java.util.Arrays;

public class MeanOfArrayRoundedDown {
    public static int getAverage(int[] marks){
        return (int) Math.floor(Arrays.stream(marks).average().getAsDouble());
    }
}
