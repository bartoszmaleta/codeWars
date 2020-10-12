package javaExe.kyu8;

import static java.lang.Character.*;

public class altERnaTIngcAsEALTerNAtiNGCaSe {
    public static String toAlternativeString(String string) {
        StringBuilder sb = new StringBuilder();
        for (char c : string.toCharArray()) {
            if (isLowerCase(c)) {
                sb.append(Character.toUpperCase(c));
            } else if (isUpperCase(c)) {
                sb.append(toLowerCase(c));
            } else {
                sb.append(c);
            }
        }
        return sb.toString();
    }

    // SECOND OPTION
    public static String toAasdlternativeString2(String string) {
        return string.chars()
                .map(c -> isUpperCase(c) ? toLowerCase(c) : isLowerCase(c) ? toUpperCase(c) : c)
                .collect(StringBuilder::new, StringBuilder::appendCodePoint, StringBuilder::append)
                .toString();
    }

    public static String toAlternativeString2(String string) {
        return string.chars().map(c -> isUpperCase(c) ? toLowerCase(c) : isLowerCase(c) ? toUpperCase(c) : c)
                .collect(StringBuilder::new, StringBuilder::appendCodePoint, StringBuilder::append)
                .toString();
    }
}
