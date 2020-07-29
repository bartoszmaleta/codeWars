package javaExe.kyu8;

import java.util.Arrays;
import java.util.stream.Collectors;

public class ConvertFullNameIntoInitials {
    public static void main(String[] args) {
        System.out.println(abbrevName("Sam Harris"));
    }

    public static String abbrevName(String name) {
        String[] fullnameArray = name.split(" ");
        return fullnameArray[0].toUpperCase().charAt(0) + "." + fullnameArray[1].toUpperCase().charAt(0);
    }


    public static String abbrevName2(String name) {
        return name.toUpperCase().replaceAll("(.).*\\s(.).*", "$1.$2");
    }

    public static String abbrevName3(String name) {
        return Arrays.stream(name.split(" "))
                .map(String::toUpperCase)
                .map(word -> word.substring(0, 1))
                .collect(Collectors.joining("."));
    }
}
