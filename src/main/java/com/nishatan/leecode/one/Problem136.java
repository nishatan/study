package com.nishatan.leecode.one;

public class Problem136 {
    public static void main(String[] args) {

    }

    public int singleNumber(int[] nums) {
        int res = 0;
        for (int num : nums) {
            res^=num;
        }
        return res;
    }

}
