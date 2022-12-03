package com.nishatan.leecode.one;

public class Problem23 {
    public static void main(String[] args) {

    }

    public ListNode mergeKLists(ListNode[] lists) {
        if (lists.length==0){
            return null;
        }
        if (lists.length==1){
            return lists[0];
        }
      return   div(lists, 0, lists.length-1);
    }

    public ListNode div(ListNode[] lists, int from , int to) {
        if (from==to){
            return lists[from];
        }
        int mid = (to + from) / 2;
        ListNode l = div(lists, from, mid);
        ListNode r = div(lists, mid+1, to);
       return mergeTwoLists(l,r);
    }

    private ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        if (list1==null){
            return list2;
        }
        if (list2==null){
            return list1;
        }
        ListNode head;
        if (list1.val< list2.val){
            head=list1;
            list1=list1.next;
        }else {
            head = list2;
            list2=list2.next;
        }
        ListNode cur=head;
        while (list1!=null&&list2!=null){
            if (list1.val< list2.val){
                cur.next=list1;
                list1=list1.next;
            }else {
                cur.next = list2;
                list2=list2.next;
            }
            cur=cur.next;
        }
        if (list1==null){
            cur.next = list2;
        }
        if (list2==null){
            cur.next = list1;
        }
        return head;
    }

}
