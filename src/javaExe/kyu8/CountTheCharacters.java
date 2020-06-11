package javaExe.kyu8;

public class CountTheCharacters {
    public static int charCount(String str, char c) {
//        char[] chars = str.split("");
        System.out.println(str);
        str = str.toLowerCase();
        c = Character.toLowerCase(c);
        System.out.println(str);

        int counter = 0;
        for (int i = 0; i < str.length(); i++) {
            char characterInString = str.charAt(i);
            if (characterInString == c) {
                counter++;
            }
        }

        System.out.println(counter);
        return counter;
    }

    public static int charCount2(String str, char c) {
        return str.toUpperCase().replaceAll("[^"+Character.toUpperCase(c)+"]", "").length();
    }

    public static int charCount3(String str, char c) {

        long total=str.toLowerCase().chars()
                .mapToObj(i -> (char) i)
                .filter((l)->l== Character.toLowerCase(c))
                .count();

        return (int) total;
    }


    public static void main(String[] args) {
        charCount("fizzbuzz FIZZBUZZ", 'z');
    }
}
