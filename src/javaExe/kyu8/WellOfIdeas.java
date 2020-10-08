package javaExe.kyu8;

import java.util.Arrays;

public class WellOfIdeas {
    public static String well(String[] x) {
        long count = Arrays.stream(x).filter(word -> word.equals("good")).count();
        return count > 2 ? "I smell a series!" : count > 0 ? "Publish!" : "Fail";
    }
}
