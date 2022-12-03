package com.nishatan.leecode.one;

public class Problem141 {
    public static void main(String[] args) {

    }
    public boolean hasCycle(ListNode head) {
        if (head==null){
            return false;
        }
        ListNode two = head;
        while (two.next!=null&&two.next.next!=null){
            head = head.next;
            two = two.next.next;
            if (head==two){
                return  true;
            }
        }
        return false;

    }


}
