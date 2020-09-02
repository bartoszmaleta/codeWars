package javaExe.kyu7;

import java.util.Arrays;

public class StrongnNumber {

    public static String isStrongNumber(int num) {
        return sumOfFactorialDigits(num) == num ? "STRONG!!!!" : "Not Strong !!";
    }

    private static int sumOfFactorialDigits(int num) {
        int[] digits = Integer.toString(num).chars().map(c -> c - '0').toArray();

        int sum = 0;
        for (int digit : digits) {
            sum+= factorial(digit);
        }
        return sum;
    }

    static int factorial(int n) {
        if (n == 0) return 1;
        return n * factorial(n - 1);
    }

    public static void main(String[] args) {
        System.out.println(isStrongNumber(1));
        System.out.println("------------------------");
        System.out.println(isStrongNumber(2));
        System.out.println("------------------------");

                System.out.println(isStrongNumber(145));
        System.out.println("------------------------");

        System.out.println(isStrongNumber(7));
        System.out.println("------------------------");

                System.out.println(isStrongNumber(93));
        System.out.println("------------------------");

        System.out.println(isStrongNumber(185));
    }


}
