package com.nishatan.leecode.one;

import java.util.Stack;

public class Problem20 {
    public static void main(String[] args) {

    }

    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i)=='('||s.charAt(i)=='{'||s.charAt(i)=='['){
                stack.push(s.charAt(i));
            }else if (s.charAt(i)==')'||s.charAt(i)=='}'||s.charAt(i)==']'){
                if (stack.isEmpty()){
                    return false;
                }
                char aa = stack.peek();
                if (s.charAt(i)==')'&&aa=='('){
                    stack.pop();
                }else if (s.charAt(i)=='}'&&aa=='{'){
                    stack.pop();
                }else if (s.charAt(i)==']'&&aa=='['){
                    stack.pop();
                }else {
                    return false;
                }
            }
        }
        return stack.isEmpty()?true:false;
    }
}
