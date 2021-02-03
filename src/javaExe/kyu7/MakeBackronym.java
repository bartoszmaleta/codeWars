package javaExe.kyu7;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class MakeBackronym {
    //    private static Map<String, String> dictionary = Preload.dictionary;
    // Don't have Preload class.
    // To have correct solution uncomment above line and comment below.
    private static final Map<String, String> dictionary = new HashMap<>();


    public static String makeBackronym(String acronym) {
        return acronym.toUpperCase().chars().mapToObj(i -> dictionary.get("" + (char)i)).collect(Collectors.joining(" "));
    }

    // SECOND OPTION
    public static String makeBackronym2(String acronym) {

        if(acronym == null){
            return "";
        }

        // Java 8 solution is le sexy
        return acronym
                .toUpperCase()
                .chars()
                .mapToObj(c -> dictionary.get(String.valueOf((char)c)))
                .collect(Collectors.joining(" "));


    }
}
