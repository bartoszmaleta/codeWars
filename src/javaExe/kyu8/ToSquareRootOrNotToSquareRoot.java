package javaExe.kyu8;

import java.util.Arrays;

public class ToSquareRootOrNotToSquareRoot {
    public static int[] squareOrSquareRoot(int[] array) {
        int[] newArray = new int[array.length];
        for (int num : array) {
            for (int i = 0; i < array.length; i++) {
                if (array[i] * array[i] == array[i]) {
                    newArray[i] = array[i];
//                } else if ((array[i] ^ (1/2)) % 1 == 0) {
                } else if (Math.sqrt(array[i]) % 1 == 0) {
                    newArray[i] = (int) Math.sqrt(array[i]);
                } else {
                    newArray[i] = array[i] * array[i];
                }
            }
            return newArray;
        }
        return newArray;
    }

    public static void main(String[] args) {
        int[] input = new int[] { 4, 3, 9, 7, 2, 1 };
        int[] newInput = squareOrSquareRoot(input);
        System.out.println("Old = " + Arrays.toString(input));
        System.out.println("New = " + Arrays.toString(newInput));
    }
}
