package com.nishatan.leecode.one;

public class Problem169 {
    public static void main(String[] args) {

    }

    public int majorityElement(int[] nums) {
        int i = nums[0];
        int count =1;
        for (int j = 1; j < nums.length; j++) {
            if (count==0){
                i=nums[j];
                count++;
            }else {
                if (nums[j]==i){
                    count++;
                }else {
                    count--;
                }
            }

        }
        return i;

    }

}
