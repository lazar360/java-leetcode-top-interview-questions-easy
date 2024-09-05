package Array;

import java.util.Arrays;

public class RemoveDuplicatesFromArray {
    public static void main(String[] args) {
        int[] nums = {1,1,2}; // Input array
        int k = removeDuplicates(nums); // Calls your implementation
        System.out.println("nums= " + Arrays.toString(nums));
        System.out.println("k= " + k);
    }

    private static int removeDuplicates(int[] nums) {
        int k = 1;
        for (int i = 1; i < nums.length; i++) {
            if(nums[i] != nums[i-1]){
                nums[k] = nums[i];
                k++;
            }
        }
        return k;
    }
}
