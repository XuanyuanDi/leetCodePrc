package linkedList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 从尾到头打印链表
 *
 * @author HuangDi
 * @since 2024/8/2
 */
public class PrintListFromTail {
    public static void main(String[] args) {
        ListNode node = new ListNode(1);
        node.next = new ListNode(2);
        node.next.next = new ListNode(3);
        System.out.println(printListFromTailToHead2(node));
    }

    // 递归法
    public static ArrayList<Integer> printListFromTailToHead(ListNode listNode) {
        ArrayList<Integer> list = new ArrayList<>();
        if (listNode != null) {
            list.addAll(printListFromTailToHead(listNode.next));
            list.add(listNode.val);
        }
        return list;
    }

    // 头插法
    public static ArrayList<Integer> printListFromTailToHead2(ListNode listNode) {
        ListNode newHead = new ListNode(-1);
        /*// 新建一个链表
        while (listNode.next != null) {
            ListNode memo = newHead;
            listNode = listNode.next;
            newHead = new ListNode(listNode.val);
            newHead.next = memo;
        }*/

        // 或者在原链表基础上更改指向
        while (listNode != null) {
            ListNode memo = listNode.next;
            listNode.next = newHead.next;
            newHead.next = listNode;
            listNode = memo;
        }
        newHead = newHead.next;

        ArrayList<Integer> ret = new ArrayList<>();
        while (newHead != null) {
            ret.add(newHead.val);
            newHead = newHead.next;
        }
        return ret;
    }
}
