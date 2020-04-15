package kyu7.makeBackronym;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Backronym {
//    private static Map<String, String> dict = Preload.dict;
    private static Map<String, String> dict;


    public static String makeBackronym(String acronym) {
        List<String> result = new ArrayList<String>();
        for (char character : acronym.toUpperCase().toCharArray()) {
            result.add(dict.get(String.valueOf(character)));
        }
        return String.join(" ", result);
    }

    public static String makeBackronym2(String acronym) {
        if(acronym == null){
            return "";
        }

        // Java 8 solution is le sexy
        return acronym
                .toUpperCase()
                .chars()
                .mapToObj(c -> dict.get(String.valueOf((char)c)))
                .collect(Collectors.joining(" "));
    }
}

class Main {
    public static void main(String[] args) {
        Backronym.makeBackronym("");
    }
}