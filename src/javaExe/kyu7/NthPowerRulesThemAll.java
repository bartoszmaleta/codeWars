package javaExe.kyu7;

import java.util.Arrays;

public class NthPowerRulesThemAll {
    public static int modifiedSum(int[] array, int power) {
        int sumPowers = 0;
        int sum = Arrays.stream(array).sum();

        for (int number : array) {
            sumPowers += Math.pow(number, power);
        }

        return sumPowers - Math.abs(sum);
    }

    // SECOND OPTION
    public static int modifiedSum2(int[] array, int power) {
        return Arrays.stream(array).map(x -> (int)Math.pow(x, power) - x).sum();
    }
}
