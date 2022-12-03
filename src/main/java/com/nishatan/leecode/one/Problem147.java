package com.nishatan.leecode.one;

public class Problem147 {
    public static void main(String[] args) {
        ListNode node4 = new ListNode(3);
        ListNode node3 = new ListNode(1,node4);
        ListNode node2 = new ListNode(2,node3);
        ListNode node1 = new ListNode(4,node2);
        ListNode listNode = new Problem147().sortList(node1);
        System.out.println(listNode);
    }

    public ListNode sortList(ListNode head) {
        if (head==null){
            return null;
        }
        if (head.next==null){
            return head;
        }
        ListNode top  = new ListNode();
        int count = 0;
        ListNode tem = head;
        while (tem!=null){
            tem=tem.next;
            count++;
        }
        tem = head;
        for (int i = 1; i < count / 2; i++) {
            tem=tem.next;
        }
        ListNode head2 = tem.next;
        tem.next=null;
        ListNode listNode1 = sortList(head);
        ListNode listNode2 = sortList(head2);
        ListNode pre = top;
        while (listNode1!=null||listNode2!=null){
            if (listNode1!=null&&listNode2!=null){
                if (listNode1.val< listNode2.val){
                    pre.next=listNode1;
                    pre=pre.next;
                    listNode1=listNode1.next;
                }else {
                    pre.next=listNode2;
                    pre=pre.next;
                    listNode2=listNode2.next;
                }
            }else if (listNode1!=null){
                pre.next=listNode1;
                pre=pre.next;
                listNode1=listNode1.next;
            }else {
                pre.next=listNode2;
                pre=pre.next;
                listNode2=listNode2.next;
            }
        }
        return top.next;
    }

}
