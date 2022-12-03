package com.nishatan.arrow;

public class QS46 {
    public static void main(String[] args) {
        int[] a = {1,2,3,0,6};
        System.out.println(sumN(4));
    }

    private static int sumN(int n) {
        return n==0?0:n+sumN(--n);
    }


}
