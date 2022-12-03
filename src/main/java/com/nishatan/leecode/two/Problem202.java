package com.nishatan.leecode.two;

import java.util.BitSet;
import java.util.HashMap;
import java.util.HashSet;

public class Problem202 {
    public static void main(String[] args) {
        System.out.println(new Problem202().isHappy(2));
    }

    public boolean isHappy(int n) {
        HashSet bitSet = new HashSet<Integer>();
        while (!bitSet.contains(n)){
            bitSet.add(n);
            if (n==1){
                return true;
            }
            int tt = 0;
            while (n!=0){
                int k = n % 10;
                tt = tt+ k*k;
                n/=10;
            }
            if (tt!=0){
                n=tt;
            }else {
                return false;
            }
        }
        return false;
    }


}
