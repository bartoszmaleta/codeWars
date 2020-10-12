package javaExe.kyu8;

import java.util.Arrays;

public class BeginnerLostWithoutMap {
    public static int[] map(int[] arr) {
        int[] arrDoubled = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            arrDoubled[i] = arr[i] * 2;
        }
        return arrDoubled;
    }

    // SECOND OPTION
    public static int[] map2(int[] arr) {
        return Arrays.stream(arr).map(number -> number * 2).toArray();
    }

}
