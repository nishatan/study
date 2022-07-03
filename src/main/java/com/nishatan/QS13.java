package com.nishatan;

public class QS13 {
    public static void main(String[] args) {
        ListNode l1 = new ListNode(1);
        l1.next = new ListNode(2);
        l1.next.next = new ListNode(3);
        l1.next.next.next = new ListNode(4);
        ListNode listNode = delSpeNode(l1, l1.next.next.next);
        while (listNode!=null){
            System.out.println(listNode.val);
            listNode=listNode.next;
        }
    }

    public static ListNode delSpeNode(ListNode head,ListNode node){
        if (head==null&&node==null){
            return null;
        }
        if (head==node){
            return null;
        }else {
            if (node.next==null){
                node.val=head.val;
                head=head.next;
            }else {
                node.val = node.next.val;
                node.next = node.next.next;
            }
            return head;
        }
    }


}
