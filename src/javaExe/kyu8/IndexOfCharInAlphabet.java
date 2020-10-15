package javaExe.kyu8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class IndexOfCharInAlphabet {
    public static String position(char letter) {
        return String.format("Position of alphabet: %d", "abcdefghijklmnopqrstuvwxyz"
                .chars()
                .mapToObj(c -> (char) c)
                .collect(Collectors.toList())
                .indexOf(letter) + 1);
    }

    // FOR LEARNIGN VERSION
    public static String position2(char letter) {
        String alphabet = "abcdefghijklmnopqrstuvwxyz";
        List<Character> alphabetList = alphabet.chars().mapToObj(c -> (char) c).collect(Collectors.toList());
        return String.format("Position of alphabet: %d", alphabetList.indexOf(letter) + 1);
    }

    public static void main(String[] args) {
        //        char[] alphabet = "abcdefghijklmnopqrstuvwxyz".toCharArray();
//        char[] alphabet = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
        String alphabet = "abcdefghijklmnopqrstuvwxyz";

        System.out.println(position2('a'));
        System.out.println(position('z'));
        System.out.println(position('e'));
    }

    public static String positio3(char alphabet)
    {
        return "Position of alphabet: " + ((int) alphabet - 96);
    }

    public static String position4(char alphabet)
    {
        return "Position of alphabet: " + (alphabet-'a'+1);
    }
}
