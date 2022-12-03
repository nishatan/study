package com.nishatan.leecode.one;

import java.util.Arrays;

public class Problem16 {
    public static void main(String[] args) {
        System.out.println(new Problem16().threeSumClosest(new int[]{1,1,1,1}, 0));
    }

    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int min = Integer.MAX_VALUE;
        int minSum = Integer.MAX_VALUE;
        for (int i = 0; i < nums.length-2; i++) {
            if (i>0&&nums[i]==nums[i-1]){
                continue;
            }
            int j = i+1;
            int k = nums.length-1;
            while (j<k) {
                int sum = nums[i] + nums[j] + nums[k];
                if (sum<target){
                    int tp = target - sum;
                    if (tp <min) {
                        min = tp;
                        minSum = sum;
                    }
                    while (j<k&&nums[j]==nums[++j]);
                }else if (sum>target){
                    int tp = sum - target;
                    if (tp <min) {
                        min = tp;
                        minSum = sum;
                    }
                    while (j<k&&nums[k]==nums[--k]);
                }else {
                    return target;
                }
            }
        }
        return minSum;
    }


}
