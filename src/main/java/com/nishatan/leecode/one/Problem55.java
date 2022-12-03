package com.nishatan.leecode.one;

public class Problem55 {
    public static void main(String[] args) {
        System.out.println(new Problem55().canJump(new int[]{3, 2, 1, 1, 4}));
    }

    public boolean canJump(int[] nums) {
        int l = 0;
        int r = 0;

        while (l<=r&&r<nums.length){
            int max = r;
            for (int i = l; i <= r; i++) {
                max=Math.max(max,i+nums[i]);
            }
            l=r+1;
            r=max;
        }
        return r>= nums.length;

    }

}
