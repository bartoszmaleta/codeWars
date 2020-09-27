package javaExe.kyu8;

public class RemoveNExclamationMarks {
    public static void main(String[] args) {
        System.out.println();
        System.out.println(remove("Hi!", 1));
        System.out.println("===========================");
        System.out.println(remove("Hi!", 100));
        System.out.println("===========================");

        System.out.println(remove("Hi!!!", 1));
        System.out.println("===========================");

        System.out.println(remove("Hi!!!", 100));
        System.out.println("===========================");

        System.out.println(remove("!Hi", 1));
        System.out.println("===========================");

        System.out.println(remove("!Hi!", 1));
        System.out.println("===========================");

        System.out.println(remove("!Hi!", 100));
    }

    // FIRST OPTION
    public static String remove(String s, int n){
        int numberOfExclamations = 0;
        numberOfExclamations = getNumberOfExclamations(s, numberOfExclamations);

        String resultWhenGreaterNumber = resultWhenNumberOfExclamationsIsGreaterThanCountOfExclamations(s, n, numberOfExclamations);
        StringBuilder resultWhenLesserNumber = getStringBuilder(s, n);

        return numberOfExclamations <= n ? resultWhenGreaterNumber : resultWhenLesserNumber.toString();
    }

    private static StringBuilder getStringBuilder(String s, int n) {
        int counter = 0;
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            if (counter < n && s.charAt(i) == '!') {
                counter++;
            } else {
                sb.append(s.charAt(i));
            }
        }
        return sb;
    }

    private static String resultWhenNumberOfExclamationsIsGreaterThanCountOfExclamations(String s, int n, int numberOfExclamations) {
        if (numberOfExclamations <= n) {
            return s.replace("!", "");
        }
        return null;
    }

    private static int getNumberOfExclamations(String s, int numberOfExclamations) {
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '!') {
                numberOfExclamations++;
            }
        }
        return numberOfExclamations;
    }

    // ----------------------------------------------------
    // SECOND OPTION
    public static String remove3(String s, int n){

        while(n-->0)
            s  = s.replaceFirst("!","");
        return s;
    }

    // ----------------------------------------------------
    // THIRD OPTION
    public static String remove4(String s, int n){
        StringBuilder sb = new StringBuilder();
        for (char d : s.toCharArray()) {
            if(n > 0 && d == '!') {
                n--;
            }
            else {
                sb.append(d);
            }
        }
        return sb.toString();
    }

    // ----------------------------------------------------
    // FOURTH OPTION
    public static String remove5(String s, int n){

        for(int i = 0; i<n;i++)
            s = s.replaceFirst("!","");

        return s;
    }
}
