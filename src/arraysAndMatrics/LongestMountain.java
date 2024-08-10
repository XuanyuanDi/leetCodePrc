package arraysAndMatrics;

/**
 * 数组中的最长山脉
 * 把符合下列属性的数组 arr 称为 山脉数组 ：
 *
 * arr.length >= 3
 * 存在下标 i（0 < i < arr.length - 1），满足
 * arr[0] < arr[1] < ... < arr[i - 1] < arr[i]
 * arr[i] > arr[i + 1] > ... > arr[arr.length - 1]
 * 给出一个整数数组 arr，返回最长山脉子数组的长度。如果不存在山脉子数组，返回 0 。
 */
public class LongestMountain {
    public static void main(String[] args) throws Exception {
        int[] nums = {2,1,4,7,3,2,5};
        System.out.println(findMountain(nums));
    }

    /**
     * 双指针解法，时间复杂度O(n)，空间复杂度O(1)
     * @param arr
     * @return
     */
    public static int findMountain(int[] arr) {
        int n = arr.length;
        int left = 0;
        int ans = 0;
        int lindex = 0;
        int rindex = 0;
        while (left + 2 < n) {
            int right = left + 1;
            if (arr[left] < arr[left + 1]) {
                while (right < n - 1 && arr[right] < arr[right + 1]) {
                    right++;
                }
                if (right < n - 1 && arr[right] > arr[right + 1]) {
                    while (right < n-1 && arr[right] > arr[right + 1]) {
                        right++;
                    }
                    if (right - left + 1 > ans) {
                        rindex = right;
                        lindex = left;
                        ans = right - left + 1;
                    }
                    //ans = Math.max(ans, right - left + 1);
                } else {
                    right++;
                }
            }
            left = right;
        }
        for (int i = lindex; i <= rindex; i++) {
            System.out.printf("%d ", arr[i]);
        }
        System.out.println();
        return ans;

    }

    /**
     * 动态规划，left[i] = left[i-1] + 1, right[i] = right[i-1] + 1
     * @param arr 输入数组
     * @return 最长山脉的长度
     */
    public static int findMountain2(int[] arr) {
        int n = arr.length;
        if (n == 0) {
            return 0;
        }
        int[] left = new int[n];
        for (int i = 1; i < n; i++) {
            left[i] = arr[i] > arr[i-1] ? left[i-1] + 1 : 0;
        }
        int[] right = new int[n];
        for (int i = n - 2; i > 0; i--) {
            right[i] = arr[i+1] < arr[i] ? right[i+1] + 1 : 0;
        }

        int ans = 0;
        for (int i = 0; i < n; i++) {
            if (left[i] > 0 && right[i] >0) {
                ans = Math.max(left[i] + right[i] + 1, ans);
            }
        }

        return ans;
    }
}
