package arraysAndMatrics;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    public static void main(String[] args) {
        int[] nums = {2,7,11,15};
        int target = 9;
        int[] ans = twoSum(nums, target);
        for (int x : ans) {
            System.out.printf("%d ",x);
        }
    }
    public static int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> dict = new HashMap<>();
        int[] ans = new int[2];
        for (int i = 0; i < nums.length; i++) {
            if (dict.get(target - nums[i]) != null) {
                ans[0] = i;
                ans[1] = dict.get(target - nums[i]);
                break;
            }
            dict.put(nums[i], i);
        }
        return ans;
    }
}
