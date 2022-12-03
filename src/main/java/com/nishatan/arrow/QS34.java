package com.nishatan.arrow;


import java.util.Arrays;

public class QS34 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(getUglyNum(9)));
    }

    public static int[] getUglyNum(int n){
        int[] nums = new int[n];
        nums[0]=1;
        int num2=0;
        int num3=0;
        int num5=0;
        for (int i = 1; i < nums.length; i++) {
            int min = Math.min(nums[num2]*2, Math.min(nums[num3]*3, nums[num5]*5));
            nums[i]=min;
            if (nums[num2]*2==min){
                num2++;
            }
            if (nums[num3]*3==min){
                num3++;
            }
            if (nums[num5]*5==min){
                num5++;
            }

        }
        return nums;
    }
}
