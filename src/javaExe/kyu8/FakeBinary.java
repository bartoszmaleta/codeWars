package javaExe.kyu8;

import static java.util.stream.Collectors.joining;

public class FakeBinary {
    public static String fakeBin(String numberString) {
        StringBuilder sb = new StringBuilder();
        for (Character c : numberString.toCharArray()) {
            if (Character.getNumericValue(c) < 5) {
                sb.append("0");
            }
            else {
                sb.append("1");
            }
        }
        return sb.toString();
    }

    // SECOND OPTION
    public static String fakeBin2(String numberString) {
        return numberString.replaceAll("[0-4]", "0")
                .replaceAll("[5-9]", "1");
    }

    // THIRD OPTION
    public static String fakeBin3(String str) {
        return str.chars().mapToObj(c -> c < '5' ? "0" : "1").collect(joining());
    }
}
