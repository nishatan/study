package com.nishatan.leecode.two;

import com.nishatan.leecode.one.ListNode;

public class Problem237 {
    public static void main(String[] args) {

    }

    public void deleteNode(ListNode node) {
        if (node.next==null){
            node=null;
        }
        node.val= node.next.val;
        node.next=node.next.next;
    }


}
