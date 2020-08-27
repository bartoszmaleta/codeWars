package javaExe.kyu7;

public class HungarianVowelHarmony {

    public static String dative(String word) {
        for (int i = word.length() - 1; i >= 0; i--) {
            char c = word.charAt(i);
            if (c == 'a' || c == 'á' || c == 'ó' || c == 'o' || c == 'ú') {
                System.out.println("nak version");
                return word + "nak";
            } else if (c == 'e' || c == 'é' || c == 'í' || c == 'i' || c == 'ö' || c == 'ő'|| c == 'ü'|| c == 'ű') {
                System.out.println("nek version");
                return word + "nek";
            }
        }

        return word;

//        a front vowel (e, é, i, í, ö, ő, ü, ű) the suffix is -nek
//
//        a back vowel (a, á, o, ó, u, ú) the suffix is -nak
    }

    public static void main(String[] args) {
        System.out.println(dative("ablak"));
        System.out.println(dative("tükör"));
        System.out.println(dative("keret"));
        System.out.println(dative("otthon"));
    }


    // SECOND OPTION
    static final String w1 = "eéiíöőüű";
    static final String w2 = "aáoóuú";

    public static String dative2(String word) {
        for (int i = word.length() - 1; i >= 0; i--)
        {
            if (w1.indexOf(word.charAt(i)) >= 0) return word + "nek";
            if (w2.indexOf(word.charAt(i)) >= 0) return word + "nak";
        }
        return word;
    }

    // THIRD OPTION
    public static String dative3(String word) {
        String w1 = word.replaceAll("[eéiíöőüű]","1");
        String w2 = word.replaceAll("[aáoóuú]","2");
        return w1.lastIndexOf("1")>w2.lastIndexOf("2")? word+"nek":word+"nak";
    }


}
