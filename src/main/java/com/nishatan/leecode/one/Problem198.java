package com.nishatan.leecode.one;

import com.sun.org.apache.xerces.internal.impl.dtd.models.CMAny;

import java.lang.invoke.LambdaConversionException;
import java.util.Arrays;

public class Problem198 {
    public static void main(String[] args) {
        System.out.println(new Problem198().rob(new int[]{2, 7, 9, 3, 1}));
    }

    public int rob(int[] nums) {
        int a = nums[0];
        if (nums.length==1){
            return a;
        }
        int b = nums[1];
        if (nums.length==2){
            return Math.max(a,b);
        }
        int c = nums[2];
        if (nums.length==3){
            return Math.max(a,Math.max(b,c));
        }
        int[] ints1 = new int[nums.length - 1];
        int[] ints2 = new int[nums.length - 1];
        for (int i = 1; i < nums.length-1; i++) {
            ints1[i]=nums[i];
            ints2[i-1]=nums[i];
        }
        ints1[0]=nums[0];
        ints2[nums.length-2]=nums[nums.length-1];
        return Math.max(robxx(ints1),robxx(ints2));
    }
    public int robxx(int[] nums) {
        int a = nums[0];
        if (nums.length==1){
            return a;
        }
        int b = nums[1];
        if (nums.length==2){
            return Math.max(a,b);
        }
        int c = Math.max(nums[0] + nums[2], nums[1]);
        if (nums.length==3){
            return c;
        }
        for (int i = 3; i < nums.length; i++) {
            int temp = Math.max(a, b)+nums[i];
            a=b;
            b=c;
            c=temp;
        }
        return Math.max(b,c);
    }

}
