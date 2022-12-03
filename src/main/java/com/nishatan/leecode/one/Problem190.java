package com.nishatan.leecode.one;

public class Problem190 {
    public static void main(String[] args) {
        System.out.println(new Problem190().reverseBits(964176192));
    }

    public int reverseBits(int n) {
        int res  = 0;
        for (int i = 0; i < 32; i++) {
            res+=(((n>>i)&1)<<(31-i));
        }
        return res;
    }

}
