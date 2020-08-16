package javaExe.kyu8;

import java.util.Arrays;

public class ArrayMean {
    public static int findAverage(int[] nums) {
        return Arrays.stream(nums).sum() / nums.length;
    }

    public static void main(String[] args) {
        System.out.println(findAverage(new int[]{1, 3, 5, 7}));
    }
}
