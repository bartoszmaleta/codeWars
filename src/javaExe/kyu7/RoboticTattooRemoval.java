package javaExe.kyu7;

import java.util.Arrays;

public class RoboticTattooRemoval {
    public static String[][] robot(String[][] skinScan) {
        for (String[] column : skinScan) {
            for (int i = 0; i < column.length; i++) {
                column[i] = column[i].equals("X") ? column[i] = "*" : column[i];
            }
        }
        return skinScan;
    }

    // SECOND OPTION
    public static String[][] robot2(String[][] skinScan) {
        return Arrays
                .stream(skinScan)
                .map(x -> Arrays.stream(x).map(y -> y.equals("X") ? "*" : y).toArray(i -> new String[i]))
                .toArray(i -> new String[i][i]);
    };

}
