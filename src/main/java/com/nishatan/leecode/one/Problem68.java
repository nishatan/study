package com.nishatan.leecode.one;

public class Problem68 {
    public static void main(String[] args) {
        System.out.println(new Problem68().mySqrt(Integer.MAX_VALUE));
    }

    public int mySqrt(int x) {
        int l = 0;
        int r = x;
        int mid = l;
        while (l<=r){
            mid = (l+r)/2;
            long squ = (long) mid * mid;
            if (squ ==x){
                return mid;
            }else if (squ >x){
                r=mid-1;
            }else if (squ <x){
                if ((mid+1)*(mid+1)>x){
                    return mid;
                }
                l = mid+1;
            }
        }
        return mid;
    }

}
