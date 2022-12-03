package com.nishatan.leecode.one;

public class Problem27 {
    public static void main(String[] args) {

    }

    public int removeElement(int[] nums, int val) {
        if (nums.length==0){
            return 0;
        }
        if (nums.length==1){
            if (nums[0]==val) {
                return 0;
            }else {
                return 1;
            }
        }
        int idx;
        if (nums[0]==val) {
            idx = 0;
        }else {
            idx = 1;
        }
        for (int i = 1; i < nums.length; i++) {
            if (nums[i]!=val){
                nums[idx]=nums[i];
                idx++;
            }
        }
        return idx;
    }

}
