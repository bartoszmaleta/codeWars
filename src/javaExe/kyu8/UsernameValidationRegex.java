package javaExe.kyu8;

public class UsernameValidationRegex {
    public static boolean validateUsr(String s) {
        return s.matches("[a-z_\\d]{4,16}");
    }
}
