package javaExe.kyu7;

import java.util.Arrays;

public class InsertDashes {
    public static String insertDash(int num) {
        int[] numArray = new int[String.valueOf(num).length()];

        for (int i = 0; i < numArray.length; i++) {
            String numString = String.valueOf(num);
            char numChar = numString.charAt(i);
            int numInt = Integer.parseInt(String.valueOf(numChar));
            numArray[i] = numInt;
        }

        String result = "";
        for (int i = 0; i < numArray.length - 1; i++) {
            if ((numArray[i] % 2 != 0) && (numArray[i+1] % 2 != 0)) {
                result += String.valueOf(numArray[i] + "-");
            } else {
                result += String.valueOf(numArray[i]);
            }
        }

        result += String.valueOf(numArray[numArray.length - 1]);

        return result;
    }

    public static void main(String[] args) {
        insertDash(454793);
    }
}
