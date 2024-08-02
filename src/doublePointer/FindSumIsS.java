package doublePointer;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * 在有序数组中找出两个数，使得和为给定的数 S。如果有多对数字的和等于 S，输出两个数的乘积最小的。
 *
 * @author HuangDi
 * @since 2024/8/2
 */
public class FindSumIsS {
    public static void main(String[] args) {
        int[] nums = {1,2,4,7,11,15};
        int target = 11;
        System.out.println(FindNumbersWithSum(nums, target));
    }

    public static ArrayList<Integer> FindNumbersWithSum(int[] nums, int target) {
        int i = 0, j = nums.length - 1;
        while (i < j) {
            int cur = nums[i] + nums[j];
            if (cur == target)
                return new ArrayList<>(Arrays.asList(nums[i], nums[j]));
            if (cur < target)
                i++;
            else
                j--;
        }
        return new ArrayList<>();
    }
}
