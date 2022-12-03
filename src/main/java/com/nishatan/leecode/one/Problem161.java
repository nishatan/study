package com.nishatan.leecode.one;

public class Problem161 {
    public static void main(String[] args) {
        System.out.println(new Problem161().findPeakElement(new int[]{1, 2, 3,1}));
    }

    public int findPeakElement(int[] nums) {
        if (nums.length==1){
            return 0;
        }
      return   search(nums, 0 , nums.length-1);
    }

    private int search(int[] nums, int l, int r) {
        if (r-l==0){
            return l;
        }
        if (r-l==1){
            return nums[l]>nums[r]?l:r;
        }
        int mid = (l+r)/2;
        if (nums[mid-1]<nums[mid]){
            return search(nums, mid, r);
        }else {
            return search(nums, l ,mid-1);
        }

    }

}
