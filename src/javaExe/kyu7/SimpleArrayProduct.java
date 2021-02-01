package javaExe.kyu7;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SimpleArrayProduct {

    public static List<Integer> getLargest(int[][] arr) {
        List<Integer> largests = new ArrayList<>();

        for (int[] ints : arr) {
            int maxOfArr = Arrays.stream(ints).max().getAsInt();
            largests.add(maxOfArr);
        }
        System.out.println(largests);
        return largests;
    }

        public static int solve(int [][] arr){

        System.out.println(Arrays.toString(arr[0]));

//        List<Integer> flattened = flattenIntMatrixToList(arr);
        List<Integer> flattened = getLargest(arr);
        Collections.sort(flattened);
        System.out.println(flattened);

        return flattened.get(flattened.size() - 1) * flattened.get(flattened.size() - 2);
    }


    public static void main(String[] args) {
        System.out.println(solve(new int[][] {{4, 2}, {3, 1}}));
//        System.out.println(getLargest(new int[][] {{4, 2}, {3, 1}}));
    }

    public static List<Integer> flattenIntMatrixToList(int[][] arrays)
    {
        List<Integer> list = new ArrayList<>();

        for (int[] arr : arrays) {
            for (int num : arr) {
                list.add(num);
            }
        }
        return list;
    }

    public static Integer[] flatten(Object[] inputArray) throws IllegalArgumentException {

        if (inputArray == null) return null;

        List<Integer> flatList = new ArrayList<Integer>();

        for (Object element : inputArray) {
            if (element instanceof Integer) {
                flatList.add((Integer) element);
            } else if (element instanceof Object[]) {
                flatList.addAll(Arrays.asList(flatten((Object[]) element)));
            } else {
                throw new IllegalArgumentException("Input must be an array of Integers or nested arrays of Integers");
            }
            // System.out.println("Flattened Array "+flatList);
        }
        return flatList.toArray(new Integer[flatList.size()]);
    }



    // SOLUTION
    public static int solve5(int [][] arr){
        int BiggestMax = 1;
        int BiggestMin = 1;

        for (int i = 0; i < arr.length; ++i) {
            int min = Arrays.stream(arr[i]).min().getAsInt();
            int max = Arrays.stream(arr[i]).max().getAsInt();
            int[] guess = new int[]{BiggestMax * max, BiggestMax * min, BiggestMin * max, BiggestMin * min};
            BiggestMax = Arrays.stream(guess).max().getAsInt();
            BiggestMin = Arrays.stream(guess).min().getAsInt();
        }
        return ((BiggestMax > BiggestMin) ? BiggestMax : BiggestMin);
    }
}
