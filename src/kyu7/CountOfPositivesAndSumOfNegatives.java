package kyu7;

import java.util.ArrayList;
import java.util.List;

public class CountOfPositivesAndSumOfNegatives {
    public static int[] countPositivesSumNegatives(int[] input)
    {
        if (input == null) {
            return new int[0];
        }
        if (input.length == 0) {
            return new int[0];
        }

        int sum = 0;
        int count = 0;

        for (int number : input) {
            if (number < 0) {
                sum += number;
            } else if (number > 0) {
                count++;
            }
        }

        int[] result = {count, sum};

        return result; //return an array with count of positives and sum of negatives
    }

    public static void main(String[] args) {
        System.out.println(countPositivesSumNegatives(new int[] {}));
    }
}
