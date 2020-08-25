package javaExe.kyu7;

public class IsItALetterRegexp {
    public static boolean isLetter(String s) {
        return s.length() == 1 && Character.isLetter(s.charAt(0));
    }

    // SECOND OPTION
    public static boolean isLetter2(String s) {
        return s.matches("[a-zA-Z]");
    }
}
