package Array;

import java.util.Arrays;

public class SingleNumber {
    public static void main(String[] args) {
        int[] nums = {4, 1, 2, 1, 2};
        int singleNumber = findSingleNumber(nums);
        System.out.println(singleNumber);  // Output: 4
    }

    private static int findSingleNumber(int[] nums) {
        int result = 0;
        for (int number : nums) {
            result ^= number;  // XOR each number
        }
        return result;  // The remaining number is the unique number
    }
}
