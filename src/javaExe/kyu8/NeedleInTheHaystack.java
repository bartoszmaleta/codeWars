package javaExe.kyu8;

import java.util.Arrays;

public class NeedleInTheHaystack {
    public static String findNeedle(Object[] haystack) {
        for (int i = 0; i < haystack.length; i++) {
            String element = String.valueOf(haystack[i]);
            if (element.equals("needle")) {
                return String.format("found the needle at position %d", i);
            }
        }
        return null;
    }

    // SECOND OPTION
    public static String findNeedle2(Object[] haystack) {
        return String.format("found the needle at position %d", java.util.Arrays.asList(haystack).indexOf("needle"));
    }

}
