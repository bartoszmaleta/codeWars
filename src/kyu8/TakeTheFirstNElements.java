
package kyu8;

import java.util.Arrays;

public class TakeTheFirstNElements {
    public static void main(String[] args) {
        int[] arrayToPrint = take(new int[] { 0, 1, 2, 3, 5, 8, 13 }, 6);
        System.out.println(arrayToPrint.toString());

        for (int elem : arrayToPrint) {
            System.out.println(elem);
        }
    }

    public static int[] take(int[] arr, int n) {
        if (arr.length <= 0) {

            return arr;
        } else if (n > arr.length) {
            return arr;
        }
        
        int[] copiedArray = Arrays.copyOfRange(arr, 0, n);
        return copiedArray;

        // int[] newArr = new int[n];
        //
        // for (int i = 0; i < n; i++) {
        // newArr[i] = arr[i];
        // }
        //
        // return newArr;
    }
}