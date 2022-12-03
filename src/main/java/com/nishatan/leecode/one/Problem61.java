package com.nishatan.leecode.one;

public class Problem61 {
    public static void main(String[] args) {
        ListNode n5 = new ListNode(2);
        ListNode res = new Problem61().rotateRight(n5, 4);
        while (res!=null){
            System.out.println(res.val);
            res=res.next;
        }
    }

    public ListNode rotateRight(ListNode head, int k) {
        if (head==null){
            return null;
        }
        ListNode right = head;
        ListNode left = head;
        while (k!=0){
            if (right.next==null){
                right=head;
            }else {
                right=right.next;
            }
            k--;
        }
        while (right.next!=null){
            right=right.next;
            left=left.next;
        }
        right.next=head;
        head= left.next;
        left.next=null;
        return head;

    }

}
