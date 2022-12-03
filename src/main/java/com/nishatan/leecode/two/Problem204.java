package com.nishatan.leecode.two;

import java.util.BitSet;
import java.util.HashSet;

public class Problem204 {
    public static void main(String[] args) {
        System.out.println(new Problem204().countPrimes(1));
    }

    public int countPrimes(int n) {
        int res = 0;
        boolean[] bls = new boolean[n];
        for (int i = 2; i < n; i++) {
            if (bls[i]){
                continue;
            }
            if (isPrime(i)){
                res++;
                int tem = i;
                for (int j = 2; tem*j<n; j++) {
                  bls[tem*j]=true;
                }
            }

        }
        return res;
    }

    private  boolean isPrime(int n){
        int sqrt = (int) Math.sqrt(n);
        for (int i = 2; i < sqrt; i++) {
            if (n%i==0) {
                return false;
            }
        }
        return true;
    }


}
