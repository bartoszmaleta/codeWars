package javaExe.kyu7;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SantasNaughtyList {
    public static List<String> findChildren(List<String> santasList, List<String> children) {
        return children.stream()
                .filter(santasList::contains)
//                .filter(child -> santasList.contains(child)) // THE SAME AS ABOVE
                .distinct()
                .sorted()
                .collect(Collectors.toList());
    }

    public static void main(String[] args) {
        ArrayList<String> santasList = new ArrayList<String>(Arrays.asList("jASon", "JAsoN", "JaSON", "jasON"));
        ArrayList<String> children = new ArrayList<String>(Arrays.asList("JasoN", "jASOn", "JAsoN", "jASon", "JASON"));

        System.out.println("=========================");
        System.out.println(findChildren(santasList, children));
        System.out.println("=========================");
    }
}
