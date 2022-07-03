package com.nishatan;

import java.util.Stack;

public class QS5 {
    public static void main(String[] args) {
        ListNode l1 = new ListNode(1);
        l1.next = new ListNode(2);
        l1.next.next = new ListNode(3);
        replace2(l1);
    }

    public static void replace (ListNode ss) {
        while (ss.next != null){
            replace(ss.next);
            System.out.println(ss.val);
            return;
        }
        System.out.println(ss.val);
    }

    public static void replace2 (ListNode ss) {
        Stack<Integer> stack = new Stack<>();
        ListNode tem=ss;
        while (tem.next != null){
            stack.push(tem.val);
            tem=tem.next;
        }
        stack.push(tem.val);
        while (!stack.isEmpty()){
            System.out.println(stack.pop());
        }
    }
}
