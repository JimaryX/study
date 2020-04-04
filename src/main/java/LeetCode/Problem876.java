package LeetCode;

import java.util.List;

public class Problem876 {
    public static void main(String[] args) {
        ListNode list = new ListNode(1);
        ListNode p = list;
        for (int i = 2; i < 6; i++) {
            p.next = new ListNode(i);
            p = p.next;
        }
        p.next = null;

        ListNode result = middleNode(list);

        while (result != null) {
            System.out.println(result.val);
            result = result.next;
        }
    }

    public static ListNode middleNode(ListNode head) {
        if (head.next == null) {
            return head;
        }
        ListNode p1, p2;
        p1 = head.next;
        p2 = head.next;
        while (p1.next != null && p1.next.next != null) {
            p1 = p1.next.next;
            p2 = p2.next;
        }

        return p2;
    }
}

class ListNode {
    int val;
    ListNode next;

    ListNode(int x) {
        val = x;
    }
}
