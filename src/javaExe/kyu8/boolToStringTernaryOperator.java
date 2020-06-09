package javaExe.kyu8;

public class boolToStringTernaryOperator {
    public static String boolToWord(boolean b) {
        String msg = b == true ? "Yes" : "No";
//        System.out.println(msg);

        // ANOTHER OPTION
//        return b ? "Yes" : "No";

        return msg;
    }
}
