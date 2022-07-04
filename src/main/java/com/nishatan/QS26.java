package com.nishatan;


public class QS26 {
    public static void main(String[] args) {
        RandomListNode node1 = new RandomListNode(1);
        RandomListNode node2 = new RandomListNode(2);
        RandomListNode node3 = new RandomListNode(3);
        RandomListNode node4 = new RandomListNode(4);
        RandomListNode node5 = new RandomListNode(5);
        node1.next=node2;
        node1.random=node3;
        node2.next=node3;
        node2.random=node4;
        node3.next=node4;
        node3.random=node5;
        node4.next=node5;
        node4.random=node1;
        RandomListNode res = copyList(node1);
        while (res!=null){
            System.out.println(res.random.val);
            res=res.next;
        }
    }

    public static RandomListNode copyList(RandomListNode listNode) {
        RandomListNode cur = listNode;
        while (cur!=null){
            RandomListNode temp = new RandomListNode(cur.val);
            temp.next=cur.next;
            cur.next=temp;
            cur=cur.next.next;
        }
        cur=listNode;
        while (cur!=null){
            if (cur.random!=null){
                cur.next.random=cur.random.next;
            }
            cur=cur.next.next;
        }
        cur=listNode;
        RandomListNode res=cur.next;
        RandomListNode cur2=res;
        while (cur2.next!=null){
            cur.next=cur2.next;
            cur2.next=cur2.next.next;
            cur=cur.next;
            cur2=cur2.next;
        }
        return res;

    }

}
