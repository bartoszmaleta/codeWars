package javaExe.kyu7;

import java.lang.reflect.Array;
import java.util.HashMap;
import java.util.Map;

public class NameThatNumber {
    public static String nameThatNumber(int x) {
        String[] firstTen = new String[] {"zero"};
        Map<Integer, String> firstTenMap = new HashMap<>();
        firstTenMap.put(0, "zero");
        firstTenMap.put(1, "one");
        firstTenMap.put(2, "two");
        firstTenMap.put(3, "three");
        firstTenMap.put(4, "four");
        firstTenMap.put(5, "five");
        firstTenMap.put(6, "six");
        firstTenMap.put(7, "seven");
        firstTenMap.put(8, "eight");
        firstTenMap.put(9, "nine");
        firstTenMap.put(10, "ten");
        firstTenMap.put(11, "eleven");
        firstTenMap.put(12, "twelve");
        firstTenMap.put(13, "thirteen");
        firstTenMap.put(14, "fourteen");
        firstTenMap.put(15, "fifteen");
        firstTenMap.put(16, "sixteen");
        firstTenMap.put(17, "seventeen");
        firstTenMap.put(18, "eighteen");
        firstTenMap.put(19, "nineteen");
        if (x < 20) return firstTenMap.get(x);
        Map<Integer, String> nextNumbers = new HashMap<>();

        nextNumbers.put(2, "twenty");
        nextNumbers.put(3, "thirty");
        nextNumbers.put(4, "forty");
        nextNumbers.put(5, "fifty");
        nextNumbers.put(6, "sixty");
        nextNumbers.put(7, "seventy");
        nextNumbers.put(8, "eighty");
        nextNumbers.put(9, "ninety");

        char[] digits = String.valueOf(x).toCharArray();
        int firstDigit = Character.getNumericValue(digits[0]);

        int secondDigit = Character.getNumericValue(digits[1]);

        String firstNumber = nextNumbers.get(firstDigit);
        System.out.println(nextNumbers.get(2));
        String secondNumber = firstTenMap.get(secondDigit);
        if (secondDigit == 0) secondNumber = "";
        return (firstNumber + " " + secondNumber).trim();

    }

    public static void main(String[] args) {
        System.out.println(nameThatNumber(25));
    }

    // SECOND OPTION
    static String[] num1 = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine", "ten",
            "eleven", "twelve", "thirteen", "fourteen", "fifteen", "sixteen", "seventeen", "eighteen", "nineteen"};
    static String[] num2 = {"twenty", "thirty", "forty", "fifty", "sixty", "seventy", "eighty", "ninety"};

    public static String nameThatNumber2(int x) {
        if (x >= 0 && x < 20) {
            return num1[x];
        } else {
            return num2[x / 10 - 2] + ((x % 10 == 0) ? "" : " " + num1[x % 10]);
        }
    }
}
