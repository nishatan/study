package com.nishatan.leecode.two;

public class Problem268 {
    public static void main(String[] args) {

    }

    public int missingNumber(int[] nums) {
        int sum = nums.length;
        for(int i = 0;i < nums.length;i ++)
            sum = sum ^ i ^ nums[i];
        return sum;
    }


}
