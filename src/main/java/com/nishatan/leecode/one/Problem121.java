package com.nishatan.leecode.one;

public class Problem121 {
    public static void main(String[] args) {

    }

    public int maxProfit(int[] prices) {
        int resOne = 0;
        int oneMin = prices[0];
        for (int i = 1; i < prices.length; i++) {
            if (prices[i]<oneMin){
                oneMin=prices[i];
            }else {
                resOne = Math.max(resOne, prices[i]-oneMin);
            }
        }
        return resOne;

    }

}
