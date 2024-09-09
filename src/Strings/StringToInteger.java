package Strings;

public class StringToInteger {
    public static void main(String[] args) {
        String s = "words and 987";
        Integer myInt = myAtoi(s);
        System.out.println(myInt);
    }

    static Integer myAtoi(String s) {
        s = s.trim(); // Step 1: Trim white spaces
        if (s.isEmpty()) return 0;

        int i = 0, sign = 1;
        long result = 0;

        // Step 2: Check sign
        if (s.charAt(i) == '-' || s.charAt(i) == '+') {
            sign = s.charAt(i) == '-' ? -1 : 1;
            i++;
        }

        // Step 3: Convert digits to integer
        while (i < s.length() && Character.isDigit(s.charAt(i))) {
            result = result * 10 + (s.charAt(i) - '0');
            if (result > Integer.MAX_VALUE) {
                return sign == 1 ? Integer.MAX_VALUE : Integer.MIN_VALUE;
            }
            i++;
        }

        return (int) result * sign;
    }
}
