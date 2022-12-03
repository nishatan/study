package com.nishatan.leecode.one;

public class Problem86 {
    public static void main(String[] args) {
        ListNode node7 = new ListNode(2);
        ListNode node6 = new ListNode(5, node7);
        ListNode node5 = new ListNode(2, node6);
        ListNode node4 = new ListNode(0,node5);
        ListNode node3 = new ListNode(3,node4);
        ListNode node2 = new ListNode(4,node3);
        ListNode node1 = new ListNode(1,node2);
        ListNode partition = new Problem86().partition(node1, 3);
    }

    public ListNode partition(ListNode head, int x) {
        ListNode res = new ListNode(Integer.MIN_VALUE, head);
        ListNode pre = res;
        while (pre.next!=null && pre.next.val<x){
            pre=pre.next;
        }
        if (pre.next==null){
            return res.next;
        }
        ListNode cur = pre;
        while (cur.next!=null){
            if (cur.next.val<x){
                ListNode temp = cur.next;
                cur.next = cur.next.next;
                temp.next = pre.next;
                pre.next = temp;
                pre = pre.next;
                if (cur==null){
                    return res.next;
                }
            }else {
                cur=cur.next;
            }
        }
        return res.next;
    }

}
