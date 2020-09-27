package javaExe.kyu8;

import java.util.Arrays;

public class IndexedCapitalization {
    public static String capitalize(String s, int[] ind){
        char[] arrS = s.toCharArray();
        for (int index : ind) {
            if (index > s.length()) {
                continue;
            }
            arrS[index] = Character.toUpperCase(arrS[index]);
        }
        return new String(arrS);
    }

    // SECOND OPTION
    public static String capitalize2(String s, int[] ind) {
        char[] chars = s.toCharArray();
        Arrays.stream(ind).filter(c -> c < s.length()).forEach(c -> chars[c] = Character.toUpperCase(chars[c]));
        return new String(chars);
    }
}
