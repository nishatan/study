package com.nishatan.arrow;

import java.util.Arrays;

public class QS54 {
    public static void main(String[] args) {
        int[] data = {2,3,4,5,6,7,8,9,10,11};
        System.out.println(Arrays.toString(getArrayB(data)));
    }

    public static int[] getArrayB(int[] a){
        int len = a.length;
        int[] b=new int[len];
        b[0]=1;
        int tem=1;
        for (int i = 1; i < len; i++) {
            b[i]=b[i-1]*a[i-1];
        }
        for (int i = len-2; i >= 0; i--) {
            tem*=a[i+1];
            b[i]=b[i]*tem;
        }
        return b;
    }
}
