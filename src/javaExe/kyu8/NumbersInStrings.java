package javaExe.kyu8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class NumbersInStrings {
    public static int solve(String s) {
        return Arrays.stream(s.split("[a-z]+")).filter(element -> !element.isEmpty())
                .mapToInt(Integer::parseInt).max().getAsInt();
    }

    // SECOND OPTION
    public static int solve2(String s) {
        if (s.isEmpty()) return 0;
        ArrayList<Integer> list = new ArrayList<>();
        StringBuilder builder = new StringBuilder();
        for (char ch : s.toCharArray()) {
            if (Character.isDigit(ch)) {
                builder.append(ch);
            } else {
                if (builder.length() > 0) {
                    list.add(Integer.parseInt(builder.toString()));
                    builder.setLength(0);
                }
            }
        }
        if (builder.length() > 0) {
            list.add(Integer.parseInt(builder.toString()));
        }
        Collections.sort(list);

        return list.get(list.size() - 1);
    }
}
