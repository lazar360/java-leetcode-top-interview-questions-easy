package Strings;

import java.util.Arrays;

public class ReverseString {
    public static void main(String[] args) {

        char[] s = {'h','e','l','l','o'};
        for (int i = 0; i < s.length/2; i++){
            char tmp = s[i];
            s[i] = s[s.length-i-1];
            s[s.length-i-1] = tmp;
        }

        System.out.println(Arrays.toString(s));

    }
}