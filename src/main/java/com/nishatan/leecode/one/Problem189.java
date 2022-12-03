package com.nishatan.leecode.one;

public class Problem189 {
    public static void main(String[] args) {
        new Problem189().rotate(new int[]{1,2,3,4,5,6,7},3);
    }

    public void rotate(int[] nums, int k) {
        int length = nums.length;
        k = k% length;
        for (int i = 0; i < length /2; i++) {
            int temp = nums[i];
            nums[i] = nums[length-i-1];
            nums[length-i-1]=temp;
        }
        for (int i = 0; i < k /2; i++) {
            int temp = nums[i];
            nums[i] = nums[k-i-1];
            nums[k-i-1]=temp;
        }
        for (int i = 0; i <(length- k) /2; i++) {
            int temp = nums[length-1-i];
            nums[length-1-i] = nums[i+k];
            nums[i+k]=temp;
        }
    }

}
