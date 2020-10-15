package javaExe.kyu8;

import java.util.Arrays;

public class MeanOfArrayRoundedDown {
    public static int getAverage(int[] marks){
        return (int) Math.floor(Arrays.stream(marks).average().getAsDouble());
    }

    // SECOND OPTION
    public static int getAverage2(int[] marks){
        return (int) Arrays.stream(marks).average().orElse(Double.NaN);
    }
}
