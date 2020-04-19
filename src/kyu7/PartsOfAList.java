package kyu7;

import static java.util.Arrays.copyOfRange;

public class PartsOfAList {

    public static String[][] partlist(String[] arr) {
        int y = arr.length - 1;
        int x = 2;

        String[][] arrayOfArrays = new String[y][x];

        for (int i = 0; i < arrayOfArrays.length; i++) {
            arrayOfArrays[i][0] = String.join(" ", copyOfRange(arr, 0, i +1));
            arrayOfArrays[i][1] = String.join(" ", copyOfRange(arr, i + 1, arr.length));
        }
        return arrayOfArrays;
    }

    public static void main(String[] args) {
        String[][] toPrint = partlist(new String[]{"I", "wish", "I", "hadn't", "come"});
        System.out.println("refernce = " + toPrint);

        for (String[] line : toPrint) {
            for (String str : line) {
                System.out.println(str);
            }
        }
    }
}
