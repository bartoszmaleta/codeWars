package javaExe.kyu7;

public class StringCounter {
    public static int stringCounter(String inputS, char charS) {
        int counter = 0;
        for (int i = 0; i < inputS.length(); i++) {
            if (inputS.charAt(i) == charS) {
                counter++;
            }
        }
        return counter;
    }

    // SECOND OPTION
    public static int stringCounter2(String inputS, char charS) {
        return (int)inputS.chars().filter(c -> c == charS).count();
    }

}