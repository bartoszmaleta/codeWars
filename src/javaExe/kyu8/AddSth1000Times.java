package javaExe.kyu8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AddSth1000Times {

    public static String[] kataExampleTwist() {
        List<String> websitesList = new ArrayList<>();
        fillList(websitesList, 1000, "codewars");
        return websitesList.toArray(new String[0]);
    }

    private static void fillList(List<String> websitesList, int times, String wordToAdd) {
        for (int i = 0; i < times; i++) {
            websitesList.add(wordToAdd);
        }
    }

    public static String[] kataExampleTwist2()
    {
        String[] websites = new String[1000];
        Arrays.fill(websites,"codewars");
        return websites;
    }
}
