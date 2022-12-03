package com.nishatan.leecode.two;

import com.nishatan.leecode.one.ListNode;

public class Problem203 {
    public static void main(String[] args) {

    }

    public ListNode removeElements(ListNode head, int val) {
        ListNode header = new ListNode(-1);
        header.next = head;
        ListNode cur = header;
        while(cur.next != null){
            if(cur.next.val == val ){
                cur.next = cur.next.next;
            }else{
                cur = cur.next;
            }
        }
        return header.next;
    }


}
