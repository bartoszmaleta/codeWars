package javaExe.kyu8;

import java.util.Arrays;
import java.util.Collections;

public class AWolfInSheepClothing {
    public static String warnTheSheep(String[] array) {
        if (array[array.length - 1].equals("wolf")) return "Pls go away and stop eating my sheep";
        for (int i = 0; i < array.length; i++) {
            if (array[i].equals("wolf")) {
                return String.format("Oi! Sheep number %d! You are about to be eaten by a wolf!", array.length - i - 1);
            }
        }
        return null;
    }

    // SECOND OPTION
    public static String warnTheSheep2(String[] array) {
        Collections.reverse(Arrays.asList(array));
        int pos = Arrays.asList(array).indexOf("wolf");
        return pos == 0 ? "Pls go away and stop eating my sheep" : "Oi! Sheep number " + pos + "! You are about to be eaten by a wolf!";
    }
}
