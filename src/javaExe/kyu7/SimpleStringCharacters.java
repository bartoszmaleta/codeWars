package javaExe.kyu7;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SimpleStringCharacters {
    public static int[] Solve(String word) {
        int countUpperCase = countUpperCase(word);
        int countLowerCase = countLowerCase(word);
        int countNumbers = countNumbers(word);
        int rest = word.length() - countLowerCase - countUpperCase - countNumbers;
        return new int[] {countUpperCase(word), countLowerCase(word), countNumbers(word), rest};
    }

    private static int countUpperCase(String inputString) {
        return (int) inputString.chars().filter((s)->Character.isUpperCase(s)).count();
    }

    private static int countLowerCase(String inputString) {
        return (int) inputString.chars().filter((s)->Character.isLowerCase(s)).count();
    }

    public static int countNumbers(String str) {
        final Pattern standaloneNumber = Pattern.compile("(?<=[\\s,])\\d+(?=[\\s,])");
        Matcher matcher = standaloneNumber.matcher(str);
        int pos = 0;
        int count = 0;

        while (matcher.find(pos)) {
            pos = matcher.end();
            count++;
        }

        return count;
    }

    public static int countSpecial(String userInput) {
//        if (userInput == null || userInput.trim().isEmpty()) {
//            return 0;
//        }
        int countSpecial = 0;

        for (int i = 0; i < userInput.length(); i++) {
            if (userInput.substring(i, i+1).matches("[^A-Za-z0-9]")) {
                countSpecial++;
            }

        }
        System.out.println("The number of special chars is: " + countSpecial);
        return countSpecial;
    }
}
