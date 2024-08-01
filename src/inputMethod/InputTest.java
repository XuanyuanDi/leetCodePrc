package inputMethod;

import java.util.Scanner;

public class InputTest {
    public static void main(String[] args) {
        input4();
    }

    /**
     * 输入例子：
     * 1 5
     * 10 20
     * 输出例子：
     * 6
     * 30
     */
    public static void input1() {
        Scanner in = new Scanner(System.in);
        // 注意 hasNext 和 hasNextLine 的区别
        while (in.hasNextInt()) { // 注意 while 处理多个 case
            int a = in.nextInt();
            int b = in.nextInt();
            System.out.println(a + b);
        }
    }

    /**
     * 输入例子：
     * 2     代表数据输入的组数
     * 1 5
     * 10 20
     * 输出例子：
     * 6
     * 30
     */
    public static void input2() {
        Scanner in = new Scanner(System.in);
        // 注意 hasNext 和 hasNextLine 的区别
        int arrays = in.nextInt();
        int count = 0;
        while (in.hasNextInt() && count < arrays) { // 注意 while 处理多个 case
            int a = in.nextInt();
            int b = in.nextInt();
            System.out.println(a + b);
            count += 1;
        }
    }

    /**
     * 输入包括两个正整数a,b(1 <= a, b <= 10^9),输入数据有多组, 如果输入为0 0则结束输入。
     *  输入例子：
     *  1 5
     *  10 20
     *  0 0
     *  输出例子：
     *  6
     *  30
     */
    public static void input3() {
        Scanner in = new Scanner(System.in);
        // 注意 hasNext 和 hasNextLine 的区别
        while (in.hasNextInt()) { // 注意 while 处理多个 case
            int a = in.nextInt();
            int b = in.nextInt();
            if (a == 0 && b == 0) {
                return;
            }
            System.out.println(a + b);
        }
    }

    /**
     * 输入数据包括多组。
     * 每组数据一行,每行的第一个整数为整数的个数n(1 <= n <= 100), n为0的时候结束输入。
     * 接下来n个正整数,即需要求和的每个正整数。
     *  输入例子：
     *  4 1 2 3 4
     *  5 1 2 3 4 5
     *  0
     *  输出例子：
     *  10
     *  15
     */
    public static void input4() {
        Scanner in = new Scanner(System.in);
        int count = 0;
        int nums = 0;
        int sum = 0;
        boolean flag = true;
        // 注意 hasNext 和 hasNextLine 的区别
        while (in.hasNextInt()) { // 注意 while 处理多个 case
            if (flag) {
                nums = in.nextInt();
                flag = false;
            }
            if (nums == 0) {
                return;
            }
            if (count < nums) {
                sum += in.nextInt();
                count += 1;
                if (count == nums) {
                    System.out.println(sum);
                    sum = 0;
                    count = 0;
                    flag = true;
                }
            }
        }
    }

    /**
     * 输入的第一行包括一个正整数t(1 <= t <= 100), 表示数据组数。
     * 接下来t行, 每行一组数据。
     * 每行的第一个整数为整数的个数n(1 <= n <= 100)。
     * 接下来n个正整数, 即需要求和的每个正整数。
     *
     *  输入例子：
     *  2
     *  4 1 2 3 4
     *  5 1 2 3 4 5
     *  输出例子：
     *  10
     *  15
     */
    public static void input5() {
        //TODO
    }
}
