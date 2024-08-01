package stackQueueListHeap;

import java.util.Stack;

/**
 * 实现一个包含 min() 函数的栈，该方法返回当前栈中最小的值。
 */
public class StackIncludeMain {
    public static void main(String[] args) {
        Solution2 s2 = new Solution2();

    }
}

/**
 * 使用一个额外的 minStack，栈顶元素为当前栈中最小的值。在对栈进行 push 入栈和 pop 出栈操作时，
 * 同样需要对 minStack 进行入栈出栈操作，从而使 minStack 栈顶元素一直为当前栈中最小的值。
 * 在进行 push 操作时，需要比较入栈元素和当前栈中最小值，将值较小的元素 push 到 minStack 中。
 */
class Solution2 {
    private Stack<Integer> dataStack = new Stack<>();
    private Stack<Integer> minStack = new Stack<>();

    public void push(int node) {
        dataStack.push(node);
        minStack.push(minStack.isEmpty() ? node : Math.min(minStack.peek(), node));
    }

    public void pop() {
        dataStack.pop();
        minStack.pop();
    }

    public int top() {
        return dataStack.peek();
    }

    public int min() {
        return minStack.peek();
    }
}