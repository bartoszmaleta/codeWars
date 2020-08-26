package javaExe.kyu7;

public class UppercaseLettersCounter {
    public static String solve(final String str) {
        int numberOfLowerCaseLetters = 0;
        for (int i = 0; i < str.length(); i++) {
            if (Character.isLowerCase(str.charAt(i))) {
                numberOfLowerCaseLetters++;
            }
        }
        return numberOfLowerCaseLetters - (str.length() - numberOfLowerCaseLetters) >= 1 ? str.toLowerCase() : str.toUpperCase();
    }

    // SECOND OPTION
    public static String solve2(final String str) {
        return str.chars().filter(Character::isLowerCase).count() >= str.chars().filter(Character::isUpperCase).count()
                ? str.toLowerCase()
                : str.toUpperCase();
    }
}
