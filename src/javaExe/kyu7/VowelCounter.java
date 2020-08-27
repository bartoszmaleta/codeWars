package javaExe.kyu7;

public class VowelCounter {

    public static int getCount(String str) {
        int vowelsCount = 0;

        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                vowelsCount++;
            }
        }
        return vowelsCount;
    }

    // SECOND OPTION
    public static int getCount2(String str) {
        return str.replaceAll("(?i)[^aeiou]", "").length();
    }

    // THIRD OPTION
    public static int getCount3(String str) {
        return (int) str.chars().filter(c -> "aeiou".indexOf(c) >= 0).count();
    }

}
