package javaExe.kyu7;

import java.util.*;

public class TwoToOne_MergeStringsDistinct {
    public static String longest (String s1, String s2) {
        String[] s1Array = s1.split("");
        String[] s2Array = s2.split("");
        List<String> list = new ArrayList<>(Arrays.asList(s1Array));
        list.addAll(Arrays.asList(s2Array));

        Set<String> set = new HashSet<>(list);

        List<String> listAfterSet = new ArrayList<>(set);
        Collections.sort(listAfterSet);

        StringBuilder sb = new StringBuilder();
        for (String str : listAfterSet) {
            sb.append(str);
        }

        return sb.toString();
    }

    public static void main(String[] args) {
        System.out.println(longest("aretheyhere", "yestheyarehere"));
    }

    // SECOND OPTION
    public static String longest2 (String s1, String s2) {
        String s = s1 + s2;
        return s.chars().distinct().sorted().collect(StringBuilder::new, StringBuilder::appendCodePoint, StringBuilder::append).toString();
    }

    // THIRD OPTION
    public static String longest3 (String s1, String s2) {
        StringBuilder sb = new StringBuilder();
        (s1 + s2).chars().distinct().sorted().forEach(c -> sb.append((char) c));
        return sb.toString();
    }
}
