package javaExe.kyu8;

import java.util.Arrays;
import java.util.Collections;
//import org.apache.commons.lang3.StringUtils;

public class ReversedWords {
    public static String reverseWords(String str){
        String[] sentence = str.split(" ");
        Collections.reverse(Arrays.asList(sentence));
        return String.join(" ", sentence);
    }

    // SECOND OPTION
    public static String reverseWords2(String str){
//        return StringUtils.reverseDelimited(str, ' '); // Use StringUtils to revers based on space character
    }

    // THIRD OPTION
    static String reverseWords3(String str) {
        return Arrays.stream(str.split(" ")).reduce((x, y) -> y + " " + x).orElse("");
    }
}
