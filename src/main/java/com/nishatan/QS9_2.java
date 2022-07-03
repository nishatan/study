package com.nishatan;

public class QS9_2 {
    public static void main(String[] args) {
        System.out.println(fibN2(3));
    }

    public static int fibN2(int n) {
        if (n<=2){
            return n;
        }
        int pre1 = 2;
        int pre2 = 1;
        int cur = 0;
        for (int i = 3; i <= n; i++) {
         cur = pre1+pre2;
         pre2=pre1;
         pre1=cur;
        }
        return cur;
    }
}
