package com.nishatan.leecode.one;

import java.util.Arrays;

public class Problem45 {
    public static void main(String[] args) {
        System.out.println(new Problem45().jump(new int[]{2,3,0,1,4}));
    }

    public int jump(int[] nums) {
        if (nums.length==1){
            return 0;
        }
        int[] dp = new int[nums.length];
        Arrays.fill(dp, Integer.MAX_VALUE);
        dp[0]=0;
        for (int i = 0; i < nums.length-1; i++) {
            for (int j = 1;i+j< nums.length && j <= nums[i]; j++) {
                int k = dp[i] + 1;
                if (k <dp[i+j]){
                    dp[i+j]= k;
                }
            }
        }
        return dp[nums.length-1];
    }

}
