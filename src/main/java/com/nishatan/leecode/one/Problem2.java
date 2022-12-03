package com.nishatan.leecode.one;

public class Problem2 {
    public static void main(String[] args) {
        ListNode node3 = new ListNode(3);
        ListNode node2 = new ListNode(4,node3);
        ListNode node1 = new ListNode(2,node2);

        ListNode node33 = new ListNode(4);
        ListNode node22 = new ListNode(6,node33);
        ListNode node11 = new ListNode(5,node22);

        ListNode listNode = new Problem2().addTwoNumbers(node1, node11);
        while (listNode!=null){
            System.out.println(listNode.val);
            listNode=listNode.next;
        }

    }

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode res = null;
        ListNode pre = null;
        boolean plus = false;
        while (true){
            if (l1==null&&l2==null){
                if (plus){
                    pre.next=new ListNode(1);
                }
                break;
            }
            ListNode cur = new ListNode();
            if (l1==null){
                cur.val = l2.val+(plus?1:0);
                l2=l2.next;
            }else if (l2==null){
                cur.val = l1.val+(plus?1:0);
                l1 = l1.next;
            }else {
                cur.val= l1.val+ l2.val+(plus?1:0);
                l1=l1.next;
                l2=l2.next;
            }
            if (cur.val>=10){
                cur.val%=10;
                plus = true;
            }else {
                plus=false;
            }
            if (res==null){
                res=cur;
                pre=cur;
            }else {
                pre.next=cur;
                pre=pre.next;
            }
        }
        return res;
    }
}
