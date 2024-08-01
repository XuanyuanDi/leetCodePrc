package stackQueueListHeap;

import java.util.Stack;

/**
 * 用两个栈来实现一个队列，完成队列的 Push 和 Pop 操作。
 */
public class TwoStack2Queue {
    public static void main(String[] args) throws Exception {
        Solution s1 = new Solution();
        s1.push(1);
        s1.push(2);
        System.out.println(s1.pop());
        s1.push(3);
        System.out.println(s1.pop());
    }

}

class Solution {
    Stack<Integer> stack1 = new Stack<Integer>();
    Stack<Integer> stack2 = new Stack<Integer>();

    public void push(int node) {
        stack1.push(node);
    }

    public int pop() throws Exception {
        if (stack2.isEmpty()) {
            while (!stack1.isEmpty()) {
                stack2.push(stack1.pop());
            }
        }

        if (stack2.isEmpty()) {
            throw new Exception("队列中没有数据");
        }

        return stack2.pop();
    }
}


