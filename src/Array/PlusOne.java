package Array;

import java.math.BigInteger;
import java.util.Arrays;

public class PlusOne {
    public static void main(String[] args) {
        int[] nums = {9,8,7,6,5,4,3,2,1,0};
        System.out.println(Arrays.toString(plusOne(nums))); // Example print
    }

    private static int[] plusOne(int[] digits) {
        StringBuilder stringBuilder = new StringBuilder();
        for (int digit : digits) {
            stringBuilder.append(digit);
        }
        String myString = stringBuilder.toString();

        // Use BigInteger to handle large number addition
        BigInteger myBigIntegerPlusOne = new BigInteger(myString).add(BigInteger.ONE);

        // Convert back to an integer array
        char[] charArray = myBigIntegerPlusOne.toString().toCharArray();
        int[] newNums = new int[charArray.length];
        for (int i = 0; i < charArray.length; i++) {
            newNums[i] = Character.getNumericValue(charArray[i]); // Use getNumericValue
        }
        return newNums;
    }
}
