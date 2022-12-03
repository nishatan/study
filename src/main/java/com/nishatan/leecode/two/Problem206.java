package com.nishatan.leecode.two;

import com.nishatan.leecode.one.ListNode;

public class Problem206 {
    public static void main(String[] args) {

    }

    public ListNode reverseList(ListNode head) {
        ListNode cur = head;
        ListNode pre = null;
        while (cur != null) {
            ListNode tmp = cur.next;
            cur.next = pre;
            pre = cur;
            cur = tmp;
        }
        return pre;
    }


}
