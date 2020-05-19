package java.kyu8;

import java.util.Arrays;

public class AddingInterNumbersToArray {
    public static int[] pipeFix(int[] numbers) {
        int minimumValueOfArray = Integer.MAX_VALUE;
        int maximumValueOfArray = Integer.MIN_VALUE;

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > maximumValueOfArray) {
                maximumValueOfArray = numbers[i];
            }
        }

        minimumValueOfArray = numbers[0];
        // for (int i = 0; i < numbers.length; i++) {
        // if (numbers[i] < minimumValueOfArray) {
        // minimumValueOfArray = numbers[i];
        // }
        // }

        System.out.println("min = " + minimumValueOfArray);
        System.out.println("max = " + maximumValueOfArray);

        int[] filledArray = new int[maximumValueOfArray - minimumValueOfArray + 1];
        System.out.println("len = " + filledArray.length);

        int counter = 0;
        while (minimumValueOfArray <= maximumValueOfArray) {
            filledArray[counter] = minimumValueOfArray;
            counter++;
            minimumValueOfArray++;
        }

        System.out.println(Arrays.toString(filledArray));
        return filledArray;
    }

    public static void main(String[] args) {
        // int[] arraMy = {3, 5, 4, 7, 8, 9, 11};
        int[] arraMy = { 14, 0, 0, 0, 0, 527 };
        int[] newArray = pipeFix(arraMy);
        System.out.println(newArray.length);
    }
}