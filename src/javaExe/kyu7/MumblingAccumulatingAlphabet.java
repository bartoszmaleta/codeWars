package javaExe.kyu7;


import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class MumblingAccumulatingAlphabet {


    public static String accum(String s) {
        char[] letters = s.toLowerCase().toCharArray();

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < letters.length; i++) {
            String cRepeated = String.valueOf(letters[i]).repeat(i + 1);
            String subStr = Character.toUpperCase(cRepeated.charAt(0)) + cRepeated.substring(1);
            if (i < letters.length - 1) {
                sb.append(subStr).append("-");
            } else {
                sb.append(subStr);
            }
        }
        return sb.toString();
    }

    public static int getCount3(String str) {
        return (int) str.chars().filter(c -> "aeiou".indexOf(c) >= 0).count();
    }

    public static void main(String[] args) {

        System.out.println(accum("abcd"));
        System.out.println("--------------------");
        System.out.println(accum("RqaEzty"));
        System.out.println("--------------------");
        System.out.println(accum("cwAt"));
        System.out.println("--------------------");
        System.out.println(accum("ZpglnRxqenU"));

//        System.out.println(accum("NyffsGeyylB"));
//        System.out.println(accum("MjtkuBovqrU"));
//        System.out.println(accum("EvidjUnokmM"));
//        System.out.println(accum("ZpglnRxqenU"));
    }


    // SECOND OPTION
    public static String accum2(String s) {
        return IntStream.range(0,s.length())
                .mapToObj(i-> Stream.generate(()->s.charAt(i)).limit(i+1).collect(StringBuilder::new,StringBuilder::append,StringBuilder::append).toString())
                .map(a->a.substring(0,1).toUpperCase()+a.substring(1).toLowerCase())
                .collect(Collectors.joining("-"));
    }


}
