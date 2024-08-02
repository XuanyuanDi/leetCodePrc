package inputMethod;

import java.util.Arrays;
import java.util.Scanner;

/**
 * java做算法题时自行处理输入输出的各类场景测试
 */
public class InputTest {
    public static void main(String[] args) {
        input10();
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
     * 输入例子：
     * 1 5
     * 10 20
     * 0 0
     * 输出例子：
     * 6
     * 30
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
     * 输入例子：
     * 4 1 2 3 4
     * 5 1 2 3 4 5
     * 0
     * 输出例子：
     * 10
     * 15
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
     * <p>
     * 输入例子：
     * 2
     * 4 1 2 3 4
     * 5 1 2 3 4 5
     * 输出例子：
     * 10
     * 15
     */
    public static void input5() {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt(); //数据组数
        while (n-- > 0) {
            int nums = scan.nextInt(); //每行数字个数
            long sum = 0; //每行求和
            for (int i = 0; i < nums; i++) {
                sum += scan.nextLong();
            }
            System.out.println(sum);
        }
    }

    /**
     * 输入数据有多组, 每行表示一组输入数据。
     * 每行的第一个整数为整数的个数n(1 <= n <= 100)。
     * 接下来n个正整数, 即需要求和的每个正整数。
     * <p>
     * 输入例子：
     * 4 1 2 3 4
     * 5 1 2 3 4 5
     * 输出例子：
     * 10
     * 15
     */
    public static void input6() {
        Scanner in = new Scanner(System.in);

        while (in.hasNextLine()) {
            String line = in.nextLine();
            if ("".equals(line.trim())) {
                return;
            }
            String[] numsStr = line.trim().split("\\s+");
            int nums = Integer.parseInt(numsStr[0]);
            long sum = 0;
            for (int i = 1; i < nums + 1; i++) {
                sum += Long.parseLong(numsStr[i]);
            }
            System.out.println(sum);
        }
    }

    /**
     * 输入数据有多组, 每行表示一组输入数据。
     *
     * 每行不定有n个整数，空格隔开。(1 <= n <= 100)。
     *
     * 输入例子：
     * 1 2 3
     * 4 5
     * 0 0 0 0 0
     * 输出例子：
     * 6
     * 9
     * 0
     */
    public static void input7() {
        Scanner in = new Scanner(System.in);
        while (in.hasNextLine()) {
            String line = in.nextLine();
            if ("".equals(line.trim())) {
                return;
            }
            String[] numsStr = line.trim().split("\\s+");
            long sum = 0;
            for (int i = 0; i < numsStr.length; i++) {
                sum += Long.parseLong(numsStr[i]);
            }
            System.out.println(sum);
        }
    }

    /**
     * 输入有两行，第一行n
     *
     * 第二行是n个字符串，字符串之间用空格隔开
     *
     * 输入例子：
     * 5
     * c d a bb e
     * 输出例子：
     * a bb c d e
     */
    public static void input8() {
        Scanner in = new Scanner(System.in);

        int n = Integer.parseInt(in.nextLine().trim());

        while (in.hasNextLine()) {
            String line = in.nextLine();
            if ("".equals(line.trim())) {
                return;
            }
            String[] strs = line.trim().split("\\s+");
            Arrays.sort(strs);
            for (int i = 0; i < strs.length; i++) {
                System.out.printf("%s", strs[i]);
                System.out.print(" ");
            }
        }
    }

    /**
     * 多个测试用例，每个测试用例一行。
     *
     * 每行通过空格隔开，有n个字符，n＜100
     *
     * 输入例子：
     * a c bb
     * f dddd
     * nowcoder
     * 输出例子：
     * a bb c
     * dddd f
     * nowcoder
     */
    public static void input9() {
        Scanner in = new Scanner(System.in);

        while (in.hasNextLine()) {
            String line = in.nextLine();
            if ("".equals(line.trim())) {
                return;
            }
            String[] strs = line.trim().split("\\s+");
            Arrays.sort(strs);
            for (String x : strs) {
                System.out.printf("%s ", x);
            }
            System.out.println();
        }
    }

    /**
     * 多个测试用例，每个测试用例一行。
     * 每行通过,隔开，有n个字符，n＜100
     *
     * 输入例子：
     * a,c,bb
     * f,dddd
     * nowcoder
     * 输出例子：
     * a,bb,c
     * dddd,f
     * nowcoder
     */
    public static void input10() {
        Scanner in = new Scanner(System.in);

        while (in.hasNextLine()) {
            String line = in.nextLine();
            if ("".equals(line.trim())) {
                return;
            }
            String[] strs = line.trim().split(",");
            Arrays.sort(strs);
            for (int i = 0; i < strs.length; i++) {
                System.out.printf("%s", strs[i]);
                if (i != strs.length - 1) {
                    System.out.print(",");
                }
            }
            System.out.println();
        }
    }
}