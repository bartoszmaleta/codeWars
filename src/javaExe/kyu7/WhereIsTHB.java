package javaExe.kyu7;

public class WhereIsTHB {
    public static void main(String[] args) {
        System.out.println(testing("For those of you who would like to test your solution before submitting it."));
        System.out.println(testing(null));
    }

    public static String testing(String initial) {
        try {

            if (initial.isEmpty()) {
                return "";
            }
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < initial.length(); i++) {
                char c = initial.charAt(i);
                char cLowerCase = Character.toLowerCase(initial.charAt(i));

                if (cLowerCase == 't') {
                    sb.append(c);
                }
                if (cLowerCase == 'h') {
                    sb.append(c);
                }
                if (cLowerCase == 'b') {
                    sb.append(c);
                }
                System.out.println(sb);
            }
            System.out.println("after = " + sb);

            return sb.toString();
        } catch (NullPointerException nullPointerException) {
            return "";
        }
    }

    static String testing2(final String initial) {
        if (initial == null) {
            return "";
        }
        return initial.replaceAll("[^TBHtbh]", "");
    }

    public static String testing3(String initial) {
        return initial == null ? "" : initial.replaceAll("(?i)[^thb]", "");
    }

}
