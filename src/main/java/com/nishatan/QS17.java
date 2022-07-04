package com.nishatan;

public class QS17 {
    public static void main(String[] args) {
        ListNode l1 = new ListNode(1);
        l1.next = new ListNode(3);
        l1.next.next = new ListNode(5);
        l1.next.next.next = new ListNode(7);
        ListNode l2 = new ListNode(2);
        l2.next = new ListNode(4);
        l2.next.next = new ListNode(6);
        l2.next.next.next = new ListNode(8);
        ListNode listNode = reverList(l2,l1);
        while (listNode!=null){
            System.out.println(listNode.val);
            listNode=listNode.next;
        }
    }

    public static ListNode reverList(ListNode list1,ListNode list2 ) {
        if (list1==null){
            return list2;
        }
        if (list2==null){
            return list1;
        }
        ListNode header;
        ListNode cur;
        ListNode l1 = list1;
        ListNode l2 = list2;
        if (l1.val<l2.val){
            header=l1;
            l1=l1.next;
        }else {
            header=l2;
            l2= l2.next;
        }
        cur=header;
        while (l1!=null&&l2!=null){
            if (l1.val<l2.val){
                cur.next=l1;
                cur=cur.next;
                l1=l1.next;
            }else {
                cur.next=l2;
                cur=cur.next;
                l2=l2.next;
            }
        }
        if (l1==null){
            while (l2!=null){
                cur.next=l2;
                cur=cur.next;
                l2=l2.next;
            }
        }
        if (l2==null){
            while (l1!=null){
                cur.next=l1;
                cur=cur.next;
                l1=l1.next;
            }
        }
        return header;
    }
}
