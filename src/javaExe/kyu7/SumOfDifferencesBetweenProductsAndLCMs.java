package javaExe.kyu7;

import java.math.BigInteger;
import java.util.Arrays;
import java.util.function.IntBinaryOperator;
import java.util.stream.IntStream;

import static java.util.stream.IntStream.range;

public class SumOfDifferencesBetweenProductsAndLCMs {
    public static int sumDifferencesBetweenProductsAndLCMs2(final int[][] pairs) {
        int sum = 0;
        for (int[] pair : pairs) {
            int firstNumber = pair[0];
            int secondNumber = pair[1];

            if (secondNumber == 0) continue;

            int product = firstNumber * secondNumber;
            int lcm = lcm(firstNumber, secondNumber);

            System.out.println("firstNumber = " + firstNumber);
            System.out.println("secondNumber = " + secondNumber);
            System.out.println("product = " + product);
            System.out.println("lcm = " + lcm);

            sum += (product - Math.abs(lcm));
            System.out.println("sum = " + sum);
        }
        return sum;
    }

    public static int sumDifferencesBetweenProductsAndLCMs(final int[][] pairs) {
        int sum = 0;
        for (int[] pair : pairs) {
            int firstNumber = pair[0];
            int secondNumber = pair[1];

            if (secondNumber == 0) continue;

            sum += ((firstNumber * secondNumber) - (lcm(firstNumber, secondNumber)));
        }
        return sum;
    }

    // Recursive method to return gcd of a and b
    static int gcd(int a, int b) {
        return a == 0 ? b : gcd(b % a, a);
    }

    // Recursive method to return LCM of two numbers
    static int lcm(int a, int b) {
        return (a / gcd(a, b)) * b;
    }

    public static void main(String[] args) {
        System.out.println(sumDifferencesBetweenProductsAndLCMs(new int[][]{}));
        System.out.println("=========================");
        System.out.println(sumDifferencesBetweenProductsAndLCMs(new int[][]{{15,18}, {4,5}, {12,60}}));
        System.out.println("=========================");
        System.out.println(sumDifferencesBetweenProductsAndLCMs(new int[][]{{1,1}, {0,0}, {13,91}}));
        System.out.println("=========================");
        System.out.println(sumDifferencesBetweenProductsAndLCMs(new int[][]{{15,7}, {4,5}, {19,60}}));
        System.out.println("=========================");
        System.out.println(sumDifferencesBetweenProductsAndLCMs(new int[][]{{20,50}, {10,10}, {50,20}}));
    }

    // SECOND OPTION
    public static int sumDifferencesBetweenProductsAndLCMs3(final int[][] pairs) {
        int[] pairProduct = Arrays.stream(pairs).mapToInt(pair -> pair[0] * pair[1]).toArray();
        int[] pairLCM = Arrays.stream(pairs).mapToInt(SumOfDifferencesBetweenProductsAndLCMs::LCM).toArray();

        return range(0, pairs.length).map(i -> pairProduct[i] - pairLCM[i]).sum();
    }

    static int LCM(int[] pair) {
        int a = pair[0];
        int b = pair[1];
        return a * b / GCD(a, b);
    }

    static int GCD(int a, int b) {
        return Math.max(b == 0 ? a : GCD(b, a % b), 1);
    }

    static int sumDifferencesBetweenProductsAndLCMs4(int[][] p) {
        IntBinaryOperator gcd = (a, b) -> Math.max(BigInteger.valueOf(a).gcd(BigInteger.valueOf(b)).intValue(), 1);
        return range(0, p.length).reduce(0, (s, i) -> s + p[i][0] * p[i][1] - p[i][0] * p[i][1] / gcd.applyAsInt(p[i][0], p[i][1]));
    }

    // THIRD OPTION
    public static int gcd2(int a, int b) {
        if (a*b == 0) return 1;
        if (a%b == 0) return b;
        return gcd2(b, a%b);
    }

    public static int sumDifferencesBetweenProductsAndLCMs5(final int[][] pairs)
    {
        int[] ps = range(0, pairs.length).map(i->pairs[i][0]*pairs[i][1]).toArray();
        return range(0, pairs.length).map(i->ps[i] - ps[i]/gcd(pairs[i][0],pairs[i][1])).sum();
    }
}
