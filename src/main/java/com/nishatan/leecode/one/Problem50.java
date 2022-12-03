package com.nishatan.leecode.one;

public class Problem50 {
    public static void main(String[] args) {
        System.out.println(new Problem50().myPow(2.00000, 10));
    }

    public double myPow(double x, int n) {
        if (n==0){
            return 1;
        }
        if (n==1){
            return x;
        }
        if (n==-1){
            return 1/x;
        }
        int min = n / 2;
        int remain = n % 2;
        double l = myPow(x, min);
        return remain ==0? l*l:remain==1?l*l*x:l*l/x;
    }

}
