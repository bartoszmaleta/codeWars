package javaExe.kyu7;

public class OddEvenStringSort {
    public static String sortMyString(String s) {
        StringBuilder evenChars = new StringBuilder();
        StringBuilder oddChars = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {
            if (i % 2 != 0) {
                oddChars.append(s.charAt(i));
            } else {
                evenChars.append(s.charAt(i));
            }
        }
        return evenChars + " " + oddChars;
    }
}
