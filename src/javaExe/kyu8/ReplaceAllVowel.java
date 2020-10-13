package javaExe.kyu8;

import java.util.Arrays;
import java.util.regex.Pattern;

public class ReplaceAllVowel {

    public static String replace(final String s) {
        String vowels = "aeiouAEIOU";
        StringBuilder sb = new StringBuilder();
        for (char c : s.toCharArray()) {
            if (vowels.indexOf(c) >= 0) {
                sb.append('!');
            } else {
                sb.append(c);
            }
        }


        return sb.toString();
    }

    public static String replace2(final String s) {
        return s.replaceAll("[aeiouAEIOU]", "!");
    }

    public static String replace3(final String s) {
        Pattern vowels = Pattern.compile("[aeiou]", Pattern.CASE_INSENSITIVE);
        return vowels.matcher(s).replaceAll("!");
    }

}
