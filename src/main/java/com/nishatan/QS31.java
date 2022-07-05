package com.nishatan;


import java.util.Arrays;

public class QS31 {
    public static void main(String[] args) {
        int[] data = {1,2,-3,1,-5,2};
        int sum=0;
        int result=0;
        for (int a : data) {
            sum=sum+a>0?sum+a:0;
            result=Math.max(result,sum);
        }
        System.out.println(result);
    }
}
