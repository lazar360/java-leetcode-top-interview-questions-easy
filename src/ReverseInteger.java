import java.util.Arrays;

public class ReverseInteger {

    public static void main(String[] args) {
        int x = 123;
        int reversed = 0;
        while (x != 0) {
            int digit = x % 10;
            x /= 10;

            // Check for overflow
            if (reversed > Integer.MAX_VALUE / 10 || (reversed == Integer.MAX_VALUE / 10 && digit > 7)) {
                x= 0;
            }
            if (reversed < Integer.MIN_VALUE / 10 || (reversed == Integer.MIN_VALUE / 10 && digit < -8)) {
                x= 0;
            }

            reversed = reversed * 10 + digit;
        }
        System.out.println(reversed);
    }

}
