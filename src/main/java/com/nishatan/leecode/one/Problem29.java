package com.nishatan.leecode.one;

public class Problem29 {
    public static void main(String[] args) {
        System.out.println(new Problem29().divide(-2147483648, 2));
    }

    public int divide(int dividend, int divisor) {
        if (dividend==Integer.MIN_VALUE){
            if (divisor==-1){
                return Integer.MAX_VALUE;
            }else if (divisor==1){
                return Integer.MIN_VALUE;
            }
        }
        if (divisor==Integer.MIN_VALUE){
            return dividend==Integer.MIN_VALUE? 1:0;
        }
        if (dividend==0){
            return 0;
        }
        if (dividend>0&&divisor<0){
            return -subDiv(dividend, (long)divisor-divisor-divisor);
        }
        if (dividend<0&&divisor>0){
            return -subDiv((long)dividend-dividend-dividend, divisor);
        }
        if (dividend<0&&divisor<0){
            return subDiv((long)dividend-dividend-dividend, (long)divisor-divisor-divisor);
        }
        return subDiv(dividend,divisor);
    }

    public int subDiv(long dividend, long divisor) {
        if (dividend<divisor){
            return 0;
        }
        long div = 1;
        while ((dividend>>div)>=divisor){
            div++;
        }
        long res = div-1;
        long left = dividend - (divisor<<res);
        return (1<<res) + subDiv(left, divisor);
    }

}
