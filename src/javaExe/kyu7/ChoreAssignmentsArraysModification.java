package javaExe.kyu7;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ChoreAssignmentsArraysModification {
    public static int[] choreAssignments(int[] chores)
    {
        System.out.println("chores = " + Arrays.toString(chores));
        System.out.println("len of chores = " + chores.length);
        List<Integer> numbers = new ArrayList<>();

        if (chores.length % 2 == 0) {
            int[] result = new int[chores.length / 2];
            for (int i = 0; i < chores.length; i = i + 2) {
                System.out.println("i = " + i);

                int number = chores[i] + chores[i + 1];
                System.out.println("number = " + number);
                numbers.add(number);

                System.out.println("numbers = " + numbers);
//                result[i] = chores[i];
//                result[i] = chores[i] + chores[i];


//                System.out.println("result = " + Arrays.toString(result));
            }
            System.out.println("*****");
            System.out.println("chores = " + Arrays.toString(chores));
            System.out.println("final numbers = " + numbers);

//            System.out.println("final result = " + Arrays.toString(result));




        }
//        Integer[] array = numbers. toArray(new Integer[0]);

        int[] primitive = numbers.stream().sorted().mapToInt(Integer::intValue).toArray();


        System.out.println("array = " + Arrays.toString(primitive));



        return primitive;
    }

    public static void main(String[] args) {
        int[] arr = new int[] {1, 5, 2, 8, 4, 9, 6, 4, 2, 2, 2, 9};
        int[] arr2 = new int[] {5, 2, 1, 6, 4, 4};
        int[] arr3 = new int[] {1, 6, 5, 5, 1, 10, 10, 9, 2, 10, 3, 9, 5, 4, 5, 6, 1, 9, 1, 8};
        int[] arr4 = new int[] {5, 8, 3, 5, 3, 10, 5, 3, 10, 2, 4, 8, 7, 3, 9, 6};
        int[] arr5 = new int[] {9, 2, 10, 10, 5, 5, 8, 7, 4, 2, 8, 3, 6, 8, 7, 3, 6, 2};

        System.out.println(choreAssignments(arr));
        System.out.println("=======================");
        System.out.println(choreAssignments(arr2));
        System.out.println("=======================");
        System.out.println(choreAssignments(arr3));
        System.out.println("=======================");
        System.out.println(choreAssignments(arr4));
        System.out.println("=======================");
        System.out.println(choreAssignments(arr5));


    }
}
