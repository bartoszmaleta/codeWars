package javaExe.kyu7;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class MyLanguages {
    public static List<String> myLanguages(final Map<String, Integer> results) {
        return results.entrySet().stream()
                .filter(element -> element.getValue() >= 60)
                .sorted((element1, element2) -> element2.getValue()
                        .compareTo(element1.getValue()))
                .map(Map.Entry::getKey)
//                .map(object -> object.getKey())   // THE SAME AS ABOVE
                .collect(Collectors.toList());
    }
}
