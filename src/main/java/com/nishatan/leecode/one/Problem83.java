package com.nishatan.leecode.one;

public class Problem83 {
    public static void main(String[] args) {
//        ListNode node5 = new ListNode(3);
//        ListNode node4 = new ListNode(3,node5);
        ListNode node3 = new ListNode(1);
        ListNode node2 = new ListNode(1,node3);
        ListNode node1 = new ListNode(1,node2);

        new Problem83().deleteDuplicates(node1);
    }

    public ListNode deleteDuplicates(ListNode head) {
        if (head==null){
            return null;
        }
        ListNode res = head;
        ListNode pre = head;
        head=head.next;
        while (pre!=null&&head!=null){
            while (pre!=null&&head!=null&& pre.val== head.val){
                pre.next=head.next;
                head=head.next;
            }
            if (head!=null){
                pre=head;
                head=head.next;
            }
        }
        return res;
    }

}
