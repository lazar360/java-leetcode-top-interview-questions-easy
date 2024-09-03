package Strings;

import java.util.*;

public class FirstUniqueCharacterInString {

    public static void main(String[] args) {
        String s = "leetcode";
        checkFirstUniqueCharacter(s);
        System.out.println(checkFirstUniqueCharacter(s));
    }

    private static Integer checkFirstUniqueCharacter(String s) {
        String[] stringArray = s.split("");
        Map<String, Integer> counterMap = new HashMap<>();

        // Count occurrences of each character
        for (String theCharacter : stringArray) {
            counterMap.put(theCharacter, counterMap.getOrDefault(theCharacter, 0) + 1);
        }

        // Find the first unique character
        for (int i = 0; i < s.length(); i++) {
            String letter = stringArray[i];
            if (counterMap.get(letter) == 1) {
                return i;
            }
        }
        return -1;
    }
}
