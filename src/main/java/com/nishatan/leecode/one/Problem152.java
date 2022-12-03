package com.nishatan.leecode.one;

import com.sun.org.apache.bcel.internal.generic.IF_ACMPEQ;

public class Problem152 {
    public static void main(String[] args) {
        System.out.println(new Problem152().maxProduct(new int[]{-1,-2,-9,-6}));
    }



    public int maxProduct(int[] nums) {
        int res=nums[0];
        int max = nums[0];
        int min = nums[0];
        for (int i = 1; i < nums.length; i++) {
            int a = max * nums[i];
            int b = min * nums[i];
            max = Math.max(Math.max(a,b), nums[i]);
            min = Math.min(Math.min(a,b), nums[i]);
            res=Math.max(res,max);
        }
        return res;
    }

}
