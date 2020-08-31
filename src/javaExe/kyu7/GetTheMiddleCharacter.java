package javaExe.kyu7;

public class GetTheMiddleCharacter {

    public static String getMiddle(String word) {
        String middleWord = String.valueOf(word.charAt(word.length() / 2));
        return word.length() % 2 == 0 ? word.charAt(word.length() / 2 - 1) + middleWord : middleWord;
    }

    public static void main(String[] args) {
        System.out.println(getMiddle("test"));
        System.out.println("--------------------");

        System.out.println(getMiddle("middle"));
        System.out.println("--------------------");

        System.out.println(getMiddle("testing"));
        System.out.println("--------------------");

        System.out.println(getMiddle("A"));
    }
}
