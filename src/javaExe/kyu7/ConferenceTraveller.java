package javaExe.kyu7;

import java.util.*;
import java.util.stream.Collectors;

import static java.util.function.Predicate.not;
import static java.util.stream.Stream.of;

public class ConferenceTraveller {


    static String conferencePicker(String[] citiesVisited, String[] citiesOffered) {
        List<String> visited = Arrays.asList(citiesVisited);
        for (String city : citiesOffered) {
            if (!visited.contains(city)) return city;
        }
        return "No worthwhile conferences this year!";
    }

    // SECOND OPTION
    static String conferencePicker2(String[] citiesVisited, String[] citiesOffered) {
        return of(citiesOffered).filter(not(Set.of(citiesVisited)::contains)).findFirst()
                .orElse("No worthwhile conferences this year!");
    }

    // THIRD OPTION
    public static String conferencePicker3(String[] citiesVisited, String[] citiesOffered) {
        List<String> citiesVisitedList = Arrays.asList(citiesVisited);

        return Arrays.stream(citiesOffered)
                .dropWhile(citiesVisitedList::contains)
                .findFirst()
                .orElse("No worthwhile conferences this year!");
    }
}
