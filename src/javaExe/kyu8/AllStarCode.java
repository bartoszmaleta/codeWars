package javaExe.kyu8;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class AllStarCode {
    public static int strCount(String str, char letter) {
        if (str.length() == 0) return 0;

        Pattern pattern = Pattern.compile("[^"+ letter + "]*" + letter);
        Matcher matcher = pattern.matcher(str);
        int count = 0;
        while (matcher.find()) {
            count++;
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println(strCount("Hello", 'o'));
        System.out.println(strCount("Hello", 'l'));
        System.out.println(strCount("", 'z'));
    }

    // SECOND OPTION
    public static int strCount2(String str, char letter) {
        return (int)str.chars().filter(x -> x == letter).count();
    }


}
