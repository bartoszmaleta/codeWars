package javaExe.kyu7;

import java.nio.CharBuffer;
import java.util.Arrays;
import java.util.stream.Collectors;

public class OrderingTheWords {
    public String orderWord(String s){
        if (s == null || s.isEmpty()) return "Invalid String!";

        char[] chars = s.toCharArray();
        Arrays.sort(chars);

        return CharBuffer.wrap(chars).chars()
                .mapToObj(intValue -> String.valueOf((char) intValue))
                .collect(Collectors.joining(""));
    }
}
