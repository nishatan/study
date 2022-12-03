package com.nishatan.leecode.one;

public class Problem191 {
    public static void main(String[] args) {

    }

    public int hammingWeight(int n) {
        int cnt = 0;
        while (n!=0){
            n=n^(n-1);
            cnt++;
        }
        return cnt;

    }

}
