package javaExe.kyu8;

import java.util.Arrays;

public class StringTemplatesBugFixing {
    public static String buildString(String... args)
    {
        if (args.length == 0) {
            return "I like !";
        }
        StringBuilder sb = new StringBuilder();
        sb.append("I like ");
        for (String string : args) {
            sb.append(string).append(", ");
        }
        return sb.substring(0, sb.toString().length() - 2).trim() + "!";
    }

    // SECOND OPTION
    public static String buildString2(String... args) {
        return "I like " + String.join(", ", args) + "!";
    }
}
