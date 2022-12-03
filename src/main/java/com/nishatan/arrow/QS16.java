package com.nishatan.arrow;

public class QS16 {
    public static void main(String[] args) {
        ListNode l1 = new ListNode(1);
        l1.next = new ListNode(2);
        l1.next.next = new ListNode(3);
        l1.next.next.next = new ListNode(4);
        ListNode listNode = reverList(l1);
        while (listNode!=null){
            System.out.println(listNode.val);
            listNode=listNode.next;
        }
    }

    public static ListNode reverList(ListNode head) {
        ListNode cur = head;
        ListNode pre = null;
        while (cur!=null){
            ListNode temp = cur.next;
            cur.next=pre;
            pre = cur;
            cur=temp;
        }
        return pre;
    }
}
