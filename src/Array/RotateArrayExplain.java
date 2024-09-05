package Array;

import java.util.Arrays;

public class RotateArrayExplain {

    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5,6,7};
        int k = 3;
        int[] rotatedNums = rotateNums(nums, k-1);
        System.out.println(Arrays.toString(rotatedNums));
    }

    private static int[] rotateNums(int[] nums, int k) {
        int i = 0;
        int j = nums.length-1;
        // 1- first loop which rotates whole array : [7, 6, 5, 4, 3, 2, 1]
        while(i < j){
            int tmp = nums[i];
            nums[i] = nums[j];
            nums[j] = tmp;
            i++;
            j--;
        }

        // 2- second loop which rotates index 0 to index k : [5, 6, 7, 4, 3, 2, 1]
        int i1 = 0;
        while(i1 < k){
            int tmp = nums[i1];
            nums[i1] = nums[k];
            nums[k] = tmp;
            i1++;
            k--;
        }

        // 3- third loop which rotates index k + 1 to the end of array : [5, 6, 7, 1, 2, 3, 4]
        i1 = k+2;
        k = nums.length-1;
        while(i1 < k){
            int tmp = nums[i1];
            nums[i1] = nums[k];
            nums[k] = tmp;
            i1++;
            k--;
        }
        return nums;
    }
}
