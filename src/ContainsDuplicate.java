import java.util.HashMap;
import java.util.Map;

public class ContainsDuplicate {

    public static void main(String[] args) {
        int[] nums = {1,2,3,4};
        checkDuplicate(nums);
        System.out.println(checkDuplicate(nums));

    }

    private static boolean checkDuplicate(int[] nums) {
        if (nums.length==0) return true;
        Map<Integer, Integer> counterMap = new HashMap<>();
        boolean isThereDuplicate = false;
        for (int theInt : nums) {
            counterMap.put(theInt, counterMap.getOrDefault(theInt, 0)+1);
            if(counterMap.get(theInt) == 2){
                isThereDuplicate = true;
                break;
            }
        }
        return isThereDuplicate;
    }
}
