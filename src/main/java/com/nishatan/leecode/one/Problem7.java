package com.nishatan.leecode.one;

public class Problem7 {
    public static void main(String[] args) {
        System.out.println(new Problem7().reverse(1534236469));
    }

    public int reverse(int x) {
        if (x==Integer.MIN_VALUE){
            return 0;
        }
        //int k = x<0?-1:1;
        long res=0;
        while (x!=0){
            res= res*10 + x%10;
            x/=10;
        }
        if (res>Integer.MAX_VALUE||res<Integer.MIN_VALUE){
            return 0;
        }
        return (int)res;
    }

}
