package javaExe.kyu7;

import java.util.ArrayList;
import java.util.List;

public class convertBase10To16 {
    public static String convertToHex2(int a) {
        double dividedBy16 = a;
        while (dividedBy16 > 15) {
            dividedBy16 = dividedBy16 / 16;
            System.out.println("In loop = " + dividedBy16);

        }
        System.out.println("After while = " + dividedBy16);
        int dividedBy16Int = (int) dividedBy16;
        System.out.println("Int = " + dividedBy16Int);

        double remainderOfDivision = dividedBy16 - dividedBy16Int;
        System.out.println("remainderOfDivision = " + remainderOfDivision);

        List<Integer> resultsNumbers = new ArrayList<>();
        resultsNumbers.add(dividedBy16Int);

        double multiplyResultRemainder = remainderOfDivision;
        while (multiplyResultRemainder > 0.01) {
            double multiplyResult = multiplyResultRemainder * 16;
            System.out.println("multiplyResult = " + multiplyResult);

            int multiplyResultInt = (int) multiplyResult;
            System.out.println("multiplyResultInt = " + multiplyResultInt);

            multiplyResultRemainder = multiplyResult - multiplyResultInt;
            System.out.println("multiplyResultRemainder = " + multiplyResultRemainder);


            resultsNumbers.add(multiplyResultInt);
            System.out.println("List in loop = " + resultsNumbers);
        }

        System.out.println("\nList after loop = " + resultsNumbers);

        String result = "";
        String numberStr = "";
        for (int number : resultsNumbers) {
            System.out.println("number = " + number);
            if (number > 9) {
                switch (number) {
                    case 10:
                        numberStr = "A";
                        break;
                    case 11:
                        numberStr = "B";
                        break;
                    case 12:
                        numberStr = "C";
                        break;
                    case 13:
                        numberStr = "D";
                        break;
                    case 14:
                        numberStr = "E";
                        break;
                    case 15:
                        numberStr = "F";
                        break;
                }
                result += numberStr;
            } else {
                numberStr = String.valueOf(number);
                result += numberStr;
            }
        }
        System.out.println("result = " + result);


        return "0x" + result.toUpperCase();
    }

    public static void main(String[] args) {
        convertToHex(256);
    }

    // WORKS
    private static final String hexDigits = "0123456789ABCDEF";
    public static String convertToHex(int a) {
        String hexadecimal = "";

        while (a > 0) {
            int digit = a % 16;
            hexadecimal = hexDigits.charAt(digit) + hexadecimal;
            a = a / 16;
        }
        return "0x" + hexadecimal;
    }
}
