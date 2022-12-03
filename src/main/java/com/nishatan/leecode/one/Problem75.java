package com.nishatan.leecode.one;

public class Problem75 {
    public static void main(String[] args) {

    }
    public void sortColors(int[] nums) {
        int[] ints = new int[3];
        for (int i = 0; i < nums.length; i++) {
            ints[nums[i]]++;
        }
        int idx = 0;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < ints[i]; j++) {
                nums[idx++]=i;
            }
        }
    }

}
