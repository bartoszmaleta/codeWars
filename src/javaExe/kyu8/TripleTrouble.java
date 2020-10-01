package javaExe.kyu8;

import java.util.Arrays;

public class TripleTrouble {
    public static String tripleTrouble(String one, String two, String three) {
        int[] arr = {one.length(), two.length(), three.length()};
        int maxLen = Arrays.stream(arr).max().getAsInt();

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < maxLen; i++) {
            if (i < one.length()) {
                sb.append(one.charAt(i));
            }
            if (i < two.length()) {
                sb.append(two.charAt(i));
            }
            if (i < three.length()) {
                sb.append(three.charAt(i));
            }
        }
        return sb.toString();
    }
}
