package com.nishatan.leecode.one;

public class Problem153 {
    public static void main(String[] args) {
        System.out.println(new Problem153().findMin(new int[]{1}));
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
        int mid = (l+r)/2;
        if (nums[l]>nums[mid]){
            return findMin(nums, l, mid);
        }
        if (nums[mid]>nums[r]){
            return findMin(nums, mid+1, r);
        }
        return Math.min(nums[l],nums[mid+1] );
    }

}
