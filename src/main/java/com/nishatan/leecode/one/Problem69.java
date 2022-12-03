package com.nishatan.leecode.one;

public class Problem69 {
    public static void main(String[] args) {

    }
    public int climbStairs(int n) {
        if (n==1||n==2){
            return n;
        }
        int a = 1;
        int b = 2;
        int res = 0;
        for (int i = 3; i <= n; i++) {
            res=a+b;
            a=b;
            b=res;
        }
        return res;
    }


}
