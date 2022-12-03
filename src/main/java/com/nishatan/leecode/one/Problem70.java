package com.nishatan.leecode.one;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Stack;

public class Problem70 {
    public static void main(String[] args) {
        System.out.println(new Problem70().simplifyPath("/...len"));
    }

    public String simplifyPath(String path) {
        Deque<String> stack = new ArrayDeque<String>();
        for (int i = 0; i < path.length();) {
            int cnt1 = 0;
            while (i<path.length()&&path.charAt(i)=='/'){
                cnt1++;
                i++;
            }
            if (cnt1>0){
                if (!stack.isEmpty()&&stack.peek().equals("/")){
                }else {
                    stack.push("/");
                }
                cnt1=0;
            }

            StringBuilder sb = new StringBuilder();
            while (i<path.length()&&path.charAt(i)!='/'){
                sb.append(path.charAt(i));
                cnt1++;
                i++;
            }
            if (sb.length()==0){
                continue;
            }else if (sb.length()==1&&sb.charAt(0)=='.'){
                if (!stack.isEmpty()&&stack.size()>1){
                    stack.pop();
                }
            }else if (sb.length()==2&&sb.charAt(0)=='.'&&sb.charAt(1)=='.'){
                if (!stack.isEmpty()&&stack.size()>1){
                    for (int i1 = 0; i1 < 3; i1++) {
                        if (!stack.isEmpty()&&stack.size()>1){
                            stack.pop();
                        }
                    }
                }
            }else {
                stack.push(sb.toString());
            }
        }

        if (stack.size()>1 && stack.peek().equals("/")){
            stack.pop();
        }
        StringBuilder res = new StringBuilder();
        int size = stack.size();
        for (int i = 0; i < size; i++) {
           res.append(stack.pollLast());
        }
        return res.toString();
    }

}
