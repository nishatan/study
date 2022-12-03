package com.nishatan.arrow;

import java.util.Stack;

public class QS9_1 {
    public static void main(String[] args) {
        System.out.println(fibN(6));
        System.out.println(fibN2(7));
    }

    public static int fibN(int n) {
        if (n==0||n==1){
            return n;
        }
        return fibN(n-1)+fibN(n-2);
    }

    public static int fibN2(int n) {
        if (n==0||n==1){
            return n;
        }
        int pre1 = 1;
        int pre2 = 0;
        int cur = 0;
        for (int i = 2; i <= n; i++) {
         cur = pre1+pre2;
         pre2=pre1;
         pre1=cur;
        }
        return cur;
    }
}
