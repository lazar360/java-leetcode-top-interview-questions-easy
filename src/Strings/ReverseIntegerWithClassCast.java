package Strings;

public class ReverseIntegerWithClassCast {

    public static void main(String[] args) {
        int x = -321;
        char[] y = String.valueOf(Math.abs(x)).toCharArray();
        for (int i = 0; i < y.length / 2; i++) {
            char tmp = y[i];
            y[i] = y[y.length - i - 1];
            y[y.length - i - 1] = tmp;
        }
        String z = new String(y);
        // Remove leading zeros
        z = z.replaceFirst("^0+(?!$)", "");

        // Convert the string back to an integer
        int result;
        try {
            result = Integer.parseInt(z);
        } catch (NumberFormatException e) {
            result = 0; // Handle the case where the string is not a valid integer
        }

        // Apply the sign
        result = x >= 0 ? result : -result;

        // Print the result
        System.out.println(result);

    }
}


