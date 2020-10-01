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

    // SECOND OPTION
    public String orderWord2(String s){
        if(s==null||"".equals(s))return "Invalid String!";
        char [] a = s.toCharArray();
        java.util.Arrays.sort(a);
        return String.valueOf(a);
    }

    // THIRD OPTION
    public String orderWord3(String s) {
        return (s == null || s.length() == 0) ? "Invalid String!" : s.chars().sorted().mapToObj(c -> String.valueOf((char) c)).collect(Collectors.joining());
    }

}
