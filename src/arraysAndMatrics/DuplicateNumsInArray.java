package arraysAndMatrics;

import java.util.HashMap;
import java.util.Map;

/**
 * 在一个长度为 n 的数组里的所有数字都在 0 到 n-1 的范围内。数组中某些数字是重复的，但不知道有几个数字是重复的，也不知道每个数字重复几次。请找出数组中任意一个重复的数字。
 *
 * Input:
 * {2, 3, 1, 0, 2, 5}
 *
 * Output:
 * 2
 *
 * 要求时间复杂度 O(N)，空间复杂度 O(n)以内
 */
public class DuplicateNumsInArray {
    public static void main(String[] args) {
        int[] nums = {2,3,1,0,2,5,3};
        int[] nums2 = {2,3,1,2,5,3};
        System.out.println(duplicate(nums));
        System.out.println(duplicate2(nums2));
    }

    // 方法一：时间复杂度 O(N)，空间复杂度 O(n)
    public static int duplicate(int[] nums) {
        Map<Integer, Integer> dict = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (dict.get(nums[i]) != null) {
                return nums[i];
            }
            dict.put(nums[i], i);
        }
        return -1;
    }
    // 方法二：时间复杂度 O(N)，空间复杂度 O(1)
    public static int duplicate2(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            while (nums[i] != i) {
                if (nums[i] == nums[nums[i]]) {
                    return  nums[i];
                }
                swap(nums, i, nums[i]);
                /*for (int in : nums) {
                    System.out.printf("%d ",in);
                }
                System.out.println();*/
            }
            swap(nums, i, nums[i]);
            /*for (int in2 : nums) {
                System.out.printf("%d ",in2);
            }*/
        }
        return -1;
    }

    private static void swap(int[] nums, int i, int j) {
        int t = nums[i];
        nums[i] = nums[j];
        nums[j] = t;
    }
}
