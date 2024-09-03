import java.util.Arrays;
import java.util.function.Function;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class ContainsDuplicate {

    public static void main(String[] args) {

        int[] nums = {1,2,3,4};
        boolean containsDuplicate = checkDuplicate(nums);
        System.out.println(containsDuplicate);
    }

    private static boolean checkDuplicate(int[] nums) {
        boolean containsDuplicate = false;
        Arrays.sort(nums);
        System.out.println(Arrays.toString(nums));
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == nums[i-1]){
                containsDuplicate = true;
                break;
            }
        }
        return containsDuplicate;
    }

}
