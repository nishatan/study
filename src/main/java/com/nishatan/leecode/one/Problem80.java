package com.nishatan.leecode.one;

import javax.sound.midi.Soundbank;
import java.util.Arrays;

public class Problem80 {
    public static void main(String[] args) {
        int[] nums = {0,0,1,1,1,1,2,3,3};
        System.out.println(new Problem80().removeDuplicates(nums));
        System.out.println(Arrays.toString(nums));
    }

    public int removeDuplicates(int[] nums) {
        int idx = 1;
        int count = 1;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i]==nums[i-1]){
                if (count<2){
                    count++;
                    nums[idx++]=nums[i];
                }
            }else {
                nums[idx++]=nums[i];
                count=1;
            }
        }
        return idx;
    }
}
