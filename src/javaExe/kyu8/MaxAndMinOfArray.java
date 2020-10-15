package javaExe.kyu8;

import java.util.Arrays;

public class MaxAndMinOfArray {
    public int min(int[] list) {
        return Arrays.stream(list).min().orElse(0);
    }

    public int max(int[] list) {
        return Arrays.stream(list).max().orElse(0);
    }
}
