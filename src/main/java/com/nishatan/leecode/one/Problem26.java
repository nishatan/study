package com.nishatan.leecode.one;

public class Problem26 {
    public static void main(String[] args) {
        System.out.println(new Problem26().removeDuplicates(new int[]{1,1,2}));
    }

    public int removeDuplicates(int[] nums) {
        if (nums.length==1){
            return 1;
        }
        int idx = 1;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i]!=nums[i-1]){
                nums[idx]=nums[i];
                idx++;
            }
        }
        return idx;
    }
}
