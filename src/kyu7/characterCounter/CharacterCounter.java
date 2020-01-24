package kyu7.characterCounter;

import java.util.HashSet;
import java.util.Set;
import java.util.Map;
import java.util.HashMap;
import java.util.Arrays;
import java.util.ArrayList;;

public class CharacterCounter {
    public static boolean validateWord(String word) {
        Map<Character, Integer> myMap = new HashMap<Character, Integer>();
        char arrayOfCharsOfWord[] = word.toLowerCase().toCharArray();
        // System.out.println(Arrays.toString(arrayOfCharsOfWord));
        System.out.println(word.length());
        for (int i = 0; i < word.length(); i++) {
            int value = 1;
            if (myMap.containsKey(arrayOfCharsOfWord[i])) {
                value = myMap.get(arrayOfCharsOfWord[i]) + 1;
            }
            myMap.put(arrayOfCharsOfWord[i], value);
        }
        Set<Object> uniqueValues = new HashSet<Object>(myMap.values());
        System.out.println(uniqueValues);
        System.out.println(myMap.values().size());
        
        ArrayList<Object> arrayListOfValues = new ArrayList<Object>();
        arrayListOfValues.add(myMap.values());
        System.out.println(arrayListOfValues);

        if (uniqueValues.size() == 1)
            return true;
        else
            return false;
    }

    public static void main(String[] args) {
        System.out.println(validateWord("abcabc"));
    }
}