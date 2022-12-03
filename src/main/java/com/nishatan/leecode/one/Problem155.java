package com.nishatan.leecode.one;

import java.util.Stack;

public class Problem155 {
    public static void main(String[] args) {

    }

    class MinStack {
        Stack<Integer> stack;
        Stack<Integer> ministack;
        public MinStack() {
            stack = new Stack<>();
            ministack = new Stack<>();
        }

        public void push(int val) {
            stack.push(val);
            if(ministack.isEmpty()||ministack.peek()>=val){
                ministack.push(val);
            }
        }

        public void pop() {
            int temp = stack.pop();
            if(ministack.peek()==temp){
                ministack.pop();
            }
        }

        public int top() {
            return stack.peek();
        }

        public int getMin() {
            return ministack.peek();
        }
    }


}
