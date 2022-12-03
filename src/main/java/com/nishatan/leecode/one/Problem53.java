package com.nishatan.leecode.one;

public class Problem53 {
    public static void main(String[] args) {
        System.out.println(new Problem53().maxSubArray(new int[]{-2,-1}));
    }
    public int maxSubArray(int[] nums) {
        int max = nums[0];
        int last = nums[0];
        int cur = nums[0];
        for (int i = 1; i < nums.length; i++) {
            if (nums[i]>=0){
                if (last>=0&&nums[i]+last>=0){
                    cur=nums[i]+last;
                }else {
                    cur=nums[i];
                }
            }else {
                if (last>0){
                    cur=nums[i]+last;
                }else{
                    cur=nums[i];
                }
            }
            last = cur;
            if (cur>max){
                max=cur;
            }
        }
        return max;
    }


}
