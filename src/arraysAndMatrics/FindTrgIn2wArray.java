package arraysAndMatrics;

/**
 * 给定一个二维数组，其每一行从左到右递增排序，从上到下也是递增排序。给定一个数，判断这个数是否在该二维数组中。
 * <p>
 * Consider the following matrix:
 * [
 * [1,   4,  7, 11, 15],
 * [2,   5,  8, 12, 19],
 * [3,   6,  9, 16, 22],
 * [10, 13, 14, 17, 24],
 * [18, 21, 23, 26, 30]
 * ]
 * <p>
 * Given target = 5, return true.
 * Given target = 20, return false.
 * 要求时间复杂度 O(M + N)，空间复杂度 O(1)
 */
public class FindTrgIn2wArray {
    public static void main(String[] args) {
        int[][] arr = {
                {1, 4, 7, 11, 15},
                {2, 5, 8, 12, 19},
                {3, 6, 9, 16, 22},
                {10, 13, 14, 17, 24},
                {18, 21, 23, 26, 30}
        };
        System.out.println(findTrg(arr, 16));
    }

    public static boolean findTrg(int[][] arr, int target) {
        int row = arr.length;
        int col = arr[0].length;
        int i = 0, j = col - 1;

        while (i < row && j >= 0) {
            if (arr[i][j] > target) {
                j--;
            } else if (arr[i][j] < target) {
                i++;
            } else {
                return true;
            }
        }
        return false;
    }
}
