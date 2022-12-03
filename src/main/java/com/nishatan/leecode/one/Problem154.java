package com.nishatan.leecode.one;

public class Problem154 {
    public static void main(String[] args) {
        System.out.println(new Problem154().findMin(new int[]{1,3,5}));
    }

    public int findMin(int[] nums) {
        return findMin(nums, 0, nums.length - 1);
    }

    private int findMin(int[] nums, int l, int r) {
        if (l>r){
            return Integer.MAX_VALUE;
        }
        if (l==r){
            return nums[l];
        }
        int midl = (l+r)/2+1;
        int midr = midl;
        while (midr+1<=r&&midr+1<=r&&nums[midr]==nums[midr+1]){
            midr++;
        }
        while (midl-1>=l&&midl-1<=r&&nums[midl]==nums[midl-1]){
            midl--;
        }
        if (midl-1>=l&&nums[l]>nums[midl-1]){
            return findMin(nums, l, midl-1);
        }
        if (midr!=r&&nums[midr]>=nums[r]){
            return findMin(nums, midr, r);
        }
        return Math.min(nums[l],nums[midr] );
    }

}
