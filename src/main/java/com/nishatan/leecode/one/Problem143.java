package com.nishatan.leecode.one;

import java.util.LinkedList;

public class Problem143 {
    public static void main(String[] args) {

    }

    public void reorderList(ListNode head) {
        LinkedList<ListNode> queue = new LinkedList<>();
        ListNode cur = head;
        while (cur != null) {
            queue.add(cur);
            cur = cur.next;
        }
        cur = queue.pollFirst();
        while (!queue.isEmpty()) {
            cur.next = queue.pollLast();
            cur = cur.next;
            cur.next = queue.pollFirst();
            cur = cur.next;
        }
        if (cur != null) {
            cur.next = null;
        }
    }

}
