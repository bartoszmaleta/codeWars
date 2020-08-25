package javaExe.kyu7;

public class IsItALetterRegexp {
    public static boolean isLetter(String s) {
        return s.length() == 1 && Character.isLetter(s.charAt(0));
    }
}
