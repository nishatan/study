package com.nishatan.leecode.two;

import java.util.Stack;

public class Problem232 {
    public static void main(String[] args) {

    }

    class MyQueue {
        Stack<Integer> in;
        Stack<Integer> out;

        public MyQueue() {
            in = new Stack<>();
            out = new Stack<>();
        }

        public void push(int x) {
            while (!out.isEmpty()){
                in.push(out.pop());
            }
            in.push(x);
            while (!in.empty()){
                out.push(in.pop());
            }
        }

        public int pop() {
          return   out.pop();
        }

        public int peek() {
            return out.peek();
        }

        public boolean empty() {
            return out.isEmpty();
        }
    }


}
