package com.nishatan.leecode.one;

public class Problem19 {
    public static void main(String[] args) {
//        ListNode e = new ListNode(5);
//        ListNode d = new ListNode(4,e);
//        ListNode c = new ListNode(3,d);
        ListNode b = new ListNode(2);
        ListNode a = new ListNode(1,b);
        ListNode res = new Problem19().removeNthFromEnd(a, 1);
        while (res!=null){
            System.out.println(res.val);
            res=res.next;
        }
    }

    public ListNode removeNthFromEnd(ListNode head, int n) {
        if (head.next==null){
            return null;
        }
        ListNode a = head;
        ListNode b = head;
        for (int i = 0; i < n; i++) {
            b = b.next;
        }
        if (b==null){
            return a.next;
        }
        while (b.next!=null){
            a= a.next;
            b= b.next;
        }
        a.next=a.next.next;
        return head;
    }

}
