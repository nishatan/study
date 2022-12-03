package com.nishatan.leecode.one;

import java.util.concurrent.ForkJoinPool;

public class Problem109 {
    public static void main(String[] args) {
        ListNode node5 = new ListNode(9);
        ListNode node4 = new ListNode(5,node5);
        ListNode node3 = new ListNode(0,node4);
        ListNode node2 = new ListNode(-3,node3);
        ListNode node1 = new ListNode(-10,node2);
        TreeNode treeNode = new Problem109().sortedListToBST(node1);
    }

    public TreeNode sortedListToBST(ListNode head) {
        if (head==null){
            return null;
        }
        if (head.next==null){
            return new TreeNode(head.val);
        }
        ListNode pre = new ListNode(0);
        pre.next=head;
        ListNode temp = head;
        int count = 0;
        while (temp!=null){
            count++;
            temp=temp.next;
        }
        int len = count / 2;
        temp=head;
        for (int i = 0; i < len; i++) {
            pre = pre.next;
            temp= temp.next;
        }
        pre.next=null;
        TreeNode treeNode = new TreeNode(temp.val);
        treeNode.left = sortedListToBST(head);
        treeNode.right = sortedListToBST(temp.next);
        return treeNode;
    }

}
