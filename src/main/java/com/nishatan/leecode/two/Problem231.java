package com.nishatan.leecode.two;

public class Problem231 {
    public static void main(String[] args) {

    }
    public boolean isPowerOfTwo(int n) {
        if (n<=0){
            return false;
        }
        while (n%2==0){
            n/=2;
        }
        return n==1?true:false;
    }


}
