package javaExe.kyu8;

import java.util.Arrays;

public class HowManyStairsWillSuzukiClimb20Years {
    public static long stairsIn20(int[][] stairs) {
        int starisClimbedInYear = 0;
        for (int[] dayInWeekTable : stairs) {
            for (int stairsClimbed : dayInWeekTable) {
                starisClimbedInYear += stairsClimbed;
            }
        }
        return starisClimbedInYear * 20L;
    }

    // SECOND OPTION
    public static long stairsIn202(int[][] stairs)
    {
        return 20L * Arrays.stream(stairs).flatMapToInt(Arrays::stream).sum();
//        return 20 * Arrays.stream(stairs).flatMapToInt(arr -> Arrays.stream(arr)).sum();
    }
}
