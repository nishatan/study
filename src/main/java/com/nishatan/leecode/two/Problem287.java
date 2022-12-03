package com.nishatan.leecode.two;

public class Problem287 {
    public static void main(String[] args) {

    }

    public int findDuplicate(int[] nums) {
        int res = nums[0];
        for (int i = 1; i < nums.length; i++) {
            res=res^nums[i]^i;
        }
        return res;

    }


}
