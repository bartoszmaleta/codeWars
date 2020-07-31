package javaExe.kyu7;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class IsValidIdentifier {
    public static boolean isValid(String idn) {
        if  (idn.isEmpty()) {
            return false;
        }
        String regex = "^([a-zA-Z_$][a-zA-Z\\d_$]*)$";
        Pattern p = Pattern.compile(regex);
        Matcher m = p.matcher(idn);
        return m.matches();
    }

    // SECOND SOLUTION
    public static boolean isValid2(String idn) {
        return idn.matches("[$_a-zA-Z]+[$\\w]*");
    }

    // THIRD SOLUTION
    public static boolean isValid3(String idn) {
        return javax.lang.model.SourceVersion.isIdentifier(idn);
    }
}