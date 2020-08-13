package javaExe.kyu8;

public class RepeatIt {
    public static String repeatString(final Object toRepeat, final int n) {
        return toRepeat instanceof String ? repeated((String) toRepeat, n) : "Not a string";
    }

    public static String repeated(String toRepeat, int n) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < n; i++) {
            result.append(toRepeat);
        }
        return result.toString();
    }


    // SECOND OPTION
    public static String repeatString2(final Object toRepeat, final int n) {
        return toRepeat instanceof String ? String.valueOf(toRepeat).repeat(Math.max(0, n)) : "Not a string";
    }
}
