package javaExe.kyu8;

public class AreYouPlayingBanjo {
    public static String areYouPlayingBanjo(String name) {
        return name.toLowerCase().charAt(0) == 'r'
                ? String.format("%s plays banjo", name)
                : String.format("%s does not play banjo", name);
    }
}
