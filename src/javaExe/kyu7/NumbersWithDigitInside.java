package javaExe.kyu7;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class NumbersWithDigitInside {
    public static long[] NumbersWithDigitInside(long x, long d) {
        long count = 0;
        long sum = 0;
        long product = 1;

        List<Long> resultList = new ArrayList<>();
        for (long i = 1; i <= x; i++) {
            String numberStr = String.valueOf(i);
            if (numberStr.contains(String.valueOf(d))) {
                resultList.add(i);
//                System.out.println(i);
            }
        }
        count = resultList.size();
        System.out.println("count = " + count);
        if (count == 0) {
            return new long[]{0, 0, 0};
        }

        sum = sum(resultList);
        System.out.println("sum = " + sum);

        for (Long number : resultList) {
            product *= number;
        }
        System.out.println("product = " + product);

        return new long[]{count, sum, product};
    }

    public static void main(String[] args) {
        System.out.println("\n1. result in main = " + Arrays.toString(NumbersWithDigitInside(5, 6)));
        System.out.println("\n2. result in main = " + Arrays.toString(NumbersWithDigitInside(7, 6)));
        System.out.println("\n3. result in main = " + Arrays.toString(NumbersWithDigitInside(11, 1)));
        System.out.println("\n4. result in main = " + Arrays.toString(NumbersWithDigitInside(20, 0)));
        System.out.println("\n5. result in main = " + Arrays.toString(NumbersWithDigitInside(44, 4)));
    }

    public static long sum(List<Long> list) {
        int sum = 0;
        for (long i : list) {
            sum += i;
        }
        return sum;
    }

    // SECOND OPTION
    public static long[] NumbersWithDigitInside2(long x, long d)  {
        long count = 0, sum = 0, prod = 0;

        for (long i = 1; i <= x; i++) {
            if (String.valueOf(i).contains(String.valueOf(d))) {
                count++;
                sum += i;
                prod = prod == 0 ? i : prod * i;
            }
        }

        return new long[]{count, sum, prod};
    }

}
