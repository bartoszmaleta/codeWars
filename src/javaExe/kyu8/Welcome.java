package javaExe.kyu8;

import java.util.HashMap;
import java.util.Map;

public class Welcome {
    public static void main(String[] args) {
        String wel = Welcome.greet("english");
        System.out.println(wel);

        //    Welcome.greet("english");
    }

    public static String greet(String language) {
        // Use HashMap
        Map<String, String> dict = new HashMap<>();
        dict.put("english", "Welcome");
        dict.put("czech", "Vitejte");
        dict.put("danish", "Velkomst");
        dict.put("dutch", "Welkom");
        dict.put("estonian", "Tere tulemast");
        dict.put("finnish", "Tervetuloa");
        dict.put("flemish", "Welgekomen");
        dict.put("french", "Bienvenue");
        dict.put("german", "Willkommen");
        dict.put("irish", "Failte");
        dict.put("italian", "Benvenuto");
        dict.put("latvian", "Gaidits");
        dict.put("lithuanian", "Laukiamas");
        dict.put("polish", "Witamy");
        dict.put("spanish", "Bienvenido");
        dict.put("swedish", "Valkommen");
        dict.put("welsh", "Croeso");


        for (String lang : dict.keySet()) {
            if (lang.equals(language)) {
                return dict.get(lang);
            }
        }


        return "Welcome";

//        one line!
//        return dict.getOrDefault(language, dict.get("english"));
//            dict.getOrDefault()

    }


}