package com.nishatan.leecode.one;

public class Problem160 {
    public static void main(String[] args) {

    }

    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode tempA = headA;
        int lenA = 1;
        ListNode tempB = headB;
        int lenB = 1;
        while (tempA.next!=null){
            tempA= tempA.next;
            lenA++;
        }
        while (tempB.next!=null){
            tempB= tempB.next;
            lenB++;
        }
        if (tempA!=tempB){
            return null;
        }
        tempA=headA;
        tempB=headB;
        if (lenA>lenB){
            for (int i = 0; i < lenA - lenB; i++) {
                tempA=tempA.next;
            }
        }else {
            for (int i = 0; i < lenB - lenA; i++) {
                tempB=tempB.next;
            }
        }
        while (tempA!=null){
            if (tempA==tempB){
                return tempA;
            }else {
                tempA= tempA.next;
                tempB= tempB.next;
            }
        }
        return null;
    }

}
