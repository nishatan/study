package com.nishatan.leecode.one;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Problem135 {
    public static void main(String[] args) {

    }

    public int candy(int[] ratings) {
        int[] ints = new int[ratings.length];
        int[] ints2 = new int[ratings.length];
        Arrays.fill(ints,1);
        Arrays.fill(ints2,1);
        int res = 0 ;
        for (int i = 1; i < ratings.length; i++) {
            if (ratings[i]>ratings[i-1]){
                ints[i]=ints[i-1]+1;
            }
        }
        for (int i = ratings.length-2; i >= 0; i--) {
            if (ratings[i]>ratings[i+1]){
                ints2[i]= ints2[i+1]+1;
            }
        }
        for (int i = 0; i < ratings.length; i++) {
            res+=Math.max(ints[i],ints2[i]);
        }
        return res;
    }

}
