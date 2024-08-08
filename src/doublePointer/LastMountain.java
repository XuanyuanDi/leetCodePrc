package doublePointer;

/**
 * @author HuangDi
 * @since 2024/8/8
 */
public class LastMountain {
    public static void main(String[] args) {
        int[] arr = {2,1,4,5,3,2,5};
        System.out.println(longestMountain(arr));
    }

    public static int longestMountain(int[] arr) {
        int n = arr.length;
        int ans = 0;
        int left = 0;
        while (left + 2 < n) {
            int right = left + 1;
            if (arr[left] < arr[left + 1]) {
                while (right + 1 < n && arr[right] < arr[right + 1]) {
                    right++;
                }
                if (right < n-1 && arr[right] > arr[right + 1]) {
                    while (right + 1 < n && arr[right] > arr[right + 1]) {
                        right++;
                    }
                    ans = Math.max(ans, right - left + 1);
                } else {
                    right++;
                }
            }
            left = right;
        }
        return ans;
    }
}
