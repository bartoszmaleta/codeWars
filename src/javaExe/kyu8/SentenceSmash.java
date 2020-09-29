package javaExe.kyu8;

public class SentenceSmash {
    public static String smash(String... words) {
        return words != null ? String.join(" ", words) : null;
    }
}
