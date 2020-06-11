package javaExe.kyu7;

import java.util.Arrays;

public class LuckyNumber {
    public static boolean isLucky(long n) {
        // is n lucky?
        String nString = String.valueOf(n);
        int[] nArrayInt = new int[nString.length()];

        for (int i = 0; i < nString.length(); i++) {
            char charString = nString.charAt(i);
            nArrayInt[i] = Integer.parseInt(String.valueOf(charString));
        }
        int sum = 0;
        for (int num : nArrayInt) {
            sum += num;
        }
//        System.out.println(sum);
//        System.out.println(Arrays.toString(nArrayInt));
//
//        System.out.println(nString);

        return sum % 9 == 0;
    }

    public static boolean isLucky2(long n) {
        return n % 9 == 0;
    }

    static boolean isLucky3(long n) {
        return ("" + n).chars().map(c -> c - 48).sum() % 9 == 0;
    }

    public static void main(String[] args) {
        isLucky(34434);
    }


}
