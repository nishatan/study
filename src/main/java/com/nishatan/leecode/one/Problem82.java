package com.nishatan.leecode.one;

public class Problem82 {
    public static void main(String[] args) {

    }

    public ListNode deleteDuplicates(ListNode head) {
        ListNode res=new ListNode(Integer.MIN_VALUE, head);
        ListNode pre = res;
        boolean duply = false;
        while (head!=null && head.next!=null){
            while (head!=null && head.next!=null && head.val==head.next.val){
                head.next=head.next.next;
                duply=true;
            }
            if (duply){
                pre.next=head.next;
                duply=false;
            }else {
                pre=head;
            }
            head=pre.next;
        }
        return res.next;
    }

}
