package Strings;

import java.util.Arrays;

public class ValidAnagram {

    public static void main(String[] args) {

        String s = "aa";
        String t = "a";
        isAnagram(s, t);
        System.out.println(isAnagram(s, t));
    }
    public static boolean isAnagram(String s, String t) {

        char[] sCharArray = s.toCharArray();
        char[] tCharArray = t.toCharArray();

        if(sCharArray.length != tCharArray.length || sCharArray.length == 0
        ){
            return false;
        }
        Arrays.sort(sCharArray);
        Arrays.sort(tCharArray);

        boolean isAnagram = true;

        for (int i = 0; i < sCharArray.length; i++) {
            if (sCharArray[i] != tCharArray[i]){
                isAnagram = false;
                break;
            }
        }
        return isAnagram;
    }
}
