package com.nishatan;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Stack;

public class QS8 {
    public static void main(String[] args) {
        int[] a = {1,2,3,4,5};
        int[] b = {2,1,4,3,5};
        System.out.println(IsPopOrder(a, b));
        new LinkedList<String>();
    }

    public static boolean IsPopOrder(int [] pushA,int [] popA) {
        if (pushA == null || popA == null) {
            return false;
        }
        Stack<Integer> stack = new Stack<>();
        int index = 0;
        for (int i = 0; i < pushA.length; i++) {
            stack.push(pushA[i]);
            while (!stack.isEmpty() && stack.peek() == popA[index]) {
                stack.pop();
                index++;
            }
        }return stack.isEmpty();
    }
}
