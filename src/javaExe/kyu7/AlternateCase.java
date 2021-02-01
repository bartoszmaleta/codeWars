package javaExe.kyu7;

import java.util.stream.Collectors;

public class AlternateCase {
    static String alternateCase(final String string) {
        StringBuilder sb = new StringBuilder();
        for (int i=0; i < string.length(); i++)
        {
            char c = string.charAt(i);
            if (Character.isLowerCase(c))
                sb.append(Character.toUpperCase(c));
            else
                sb.append(Character.toLowerCase(c));
        }
        return sb.toString();
    }

    // SECOND OPTION
    static String alternateCase2(final String string) {
        return string.chars()
                .mapToObj(i -> new Character((char) i))
                .map(i -> Character.isUpperCase(i) ? Character.toLowerCase(i) : Character.toUpperCase(i))
                .map(i -> i.toString())
                .collect(Collectors.joining(""));
    }

}
