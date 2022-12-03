package com.nishatan.leecode.one;

import java.util.Arrays;
import java.util.Comparator;
import java.util.TreeSet;

public class Problem123 {
    public static void main(String[] args) {
        System.out.println(new Problem123().maxProfit(new int[]{1,2,4,2,5,7,2,4,9,0}));
    }

    public int maxProfit(int[] prices) {
        int[] ppp = Arrays.copyOf(prices, prices.length + 1);
        int first = 0;
        int second = 0;
        int resOne = 0;
        int oneMin = ppp[0];
        int res = 0;
        int min = ppp[0];
        for (int i = 1; i < ppp.length; i++) {
            if (ppp[i]<oneMin){
                oneMin=ppp[i];
            }else {
                resOne = Math.max(resOne, ppp[i]-oneMin);
            }
            if (ppp[i]>min){
                res+=(ppp[i]-min);
            }else {
                if (first==0){
                    first=res;
                }else if (second==0){
                    if (first>=res){
                        second=res;
                    }else {
                        second=first;
                        first=res;
                    }
                }else {
                    if (res>first){
                        second=first;
                        first=res;
                    }else if (res>second){
                        second=res;
                    }
                }
                if (resOne>(first+second)){
                    first=resOne;
                    second=0;
                }
                res=0;
            }
            min=ppp[i];
        }
        return first+second;
    }

}
