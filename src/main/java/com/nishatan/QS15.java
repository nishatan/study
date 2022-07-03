package com.nishatan;

public class QS15 {
    public static void main(String[] args) {
        ListNode l1 = new ListNode(1);
        l1.next = new ListNode(2);
        l1.next.next = new ListNode(3);
        l1.next.next.next = new ListNode(4);
        ListNode tailK = getTailK(l1, 2);
        System.out.println(tailK.val);
    }

    public static ListNode getTailK(ListNode head,int k){
        ListNode tail = head;
        for (int i = 1; i < k; i++) {
            tail=tail.next;
        }
        while (tail.next!=null){
            head=head.next;
            tail=tail.next;
        }
        return head;
    }
}
