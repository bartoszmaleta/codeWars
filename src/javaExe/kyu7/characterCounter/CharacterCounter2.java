package javaExe.kyu7.characterCounter;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class CharacterCounter2 {
    public static boolean validateWord(String word) {
        Map<Character, Integer> map = new HashMap<Character, Integer>();
        char array[] = word.toLowerCase().toCharArray();
        for (int i = 0; i < word.length(); i++) {
            int value = 1;
            if (map.containsKey(array[i]))
                value = map.get(array[i]) + 1;
            map.put(array[i], value);
        }
        Set<Object> uniqueValues = new HashSet<Object>(map.values());
        
        if (uniqueValues.size() == 1)
            return true;
        else
            return false;
    }

    public static void main(String[] args) {
        System.out.println(validateWord("abcabc"));
    }
}