package com.nishatan.leecode.two;

public class Problem260 {
    public static void main(String[] args) {

    }

    public int[] singleNumber(int[] nums) {
        int res=0;
        for (int i = 0; i < nums.length; i++) {
            res^=nums[i];
        }
        res=res&(-res);
        int[] ints = new int[2];
        for (int i = 0; i < nums.length; i++) {
            if (res==(nums[i]&res)){
                ints[0]^=nums[i];
            }else {
                ints[1]^=nums[i];
            }
        }
        return  ints;
    }


}
