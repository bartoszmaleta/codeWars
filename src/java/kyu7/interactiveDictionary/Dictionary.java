package java.kyu7.interactiveDictionary;

import java.util.HashMap;
import java.util.Map;

public class Dictionary {
    private HashMap<String, String> dict;

    public Dictionary() {
        this.dict = new HashMap<>();
        // your code
    }

    public void newEntry(String key, String value) {
        this.dict.put(key, value);
//        this.dict.put(value, key);
        // your code
    }

    public String look(String key) {
        for (String keyOfMap : this.dict.keySet()) {
            if (keyOfMap.equals(key)) {
                return this.dict.get(key);
            }
        }

        // Redundnat but cool
        for (Map.Entry<String, String> entry : dict.entrySet()) {
            if (entry.getValue().equals(key)) {
                return entry.getKey();
            }
        }
        String messageWhenNotFound = "Cant find entry for " + key;
        return messageWhenNotFound;
    }

    public String look2(String key) {
        return this.dict.getOrDefault(key, "Cant find entry for " + key);
    }
}

class Main {
    public static void main(String[] args) {
        Dictionary d = new Dictionary();

        d.newEntry("Apple", "A fruit that grows on trees");

        System.out.println(d.look("Apple"));

        d.look("Hi");
        d.newEntry("soccer", "a sport");
        System.out.println(d.look("a sport"));

    }
}