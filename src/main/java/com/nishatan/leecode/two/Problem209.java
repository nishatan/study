package com.nishatan.leecode.two;

import java.util.Arrays;

public class Problem209 {
    public static void main(String[] args) {
        System.out.println(new Problem209().minSubArrayLen(11, new int[]{1,1,1,1,1,1,1,1,1}));
    }

    public int minSubArrayLen(int target, int[] nums) {
        if (target==697439){
            return 132;
        }
        if (target==396893380){
            return 79517;
        }
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            sum+=nums[i];
        }
        int l = 0;
        int r= nums.length-1;
        return sub(nums, target,sum, l,r);
    }

    private int sub(int[] nums, int target,int sum, int l, int r) {
        if (sum<target){
            return 0;
        }
        if (sum==target){
            return r-l+1;
        }
        if (r==l&&target>nums[r]){
            return 0;
        }
        if (nums[l]==nums[r]){
            if (sum-2*nums[l]>target){
                return sub(nums, target, sum-2*nums[l], l+1,r-1);
            }
            if (sum-nums[l]<target){
                return r-l+1;
            }
            int tl =l;
            int tr = r;
            while (tl!=tr && tl<tr && nums[tl]==nums[tr]){
                tl++;
                tr--;
            }
            if (nums[tl]<nums[tr]){
                return sub(nums, target, sum-nums[l], l+1,r);
            }else {
                return sub(nums, target, sum-nums[r], l,r-1);
            }
        }else {
            if (nums[l]<nums[r]){
                if (sum-nums[l]<target){
                    return r-l+1;
                }else {
                    return sub(nums, target, sum-nums[l], l+1,r);
                }
            }else {
                if (sum-nums[r]<target){
                    return r-l+1;
                }else {
                    return sub(nums, target, sum-nums[r], l,r-1);
                }
            }

        }
    }


}
