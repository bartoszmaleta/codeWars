package javaExe.kyu8;

import java.util.Arrays;

public class HowGoodAreYouReally {

    public static boolean betterThanAverage(int[] classPoints, int yourPoints) {
        return Arrays.stream(classPoints).average().getAsDouble() < yourPoints;
    }

}
