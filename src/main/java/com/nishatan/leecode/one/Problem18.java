package com.nishatan.leecode.one;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Problem18 {
    public static void main(String[] args) {
        new Problem18().fourSum(new int[]{1000000000,1000000000,1000000000,1000000000}, -294967296).forEach(System.out::println);
    }

    public List<List<Integer>> fourSum(int[] nums, int target) {
        List<List<Integer>> res = new ArrayList<>();
        if (nums.length<4){
            return res;
        }
        Arrays.sort(nums);
        for (int i = 0; i < nums.length-3; i++) {
            if(target>=0 && nums[i] > target) break;
            if(target<0 && nums[i] > 0) break;
            if (i>0&&nums[i]==nums[i-1]){
                continue;
            }
            subFourSum(nums, i+1, target-nums[i],res);
        }
        return res;
    }

    private void subFourSum(int[] nums, int start, int target, List<List<Integer>> res) {
        for (int i = start; i < nums.length-2; i++) {
            if(target>=0 && nums[i] > target) break;
            if(target<0 && nums[i] > 0) break;
            if (i>start&&nums[i]==nums[i-1]){
                continue;
            }
            int j = i+1;
            int k = nums.length-1;
            while (j<k) {
                long sum = (long) nums[i] + nums[j] + nums[k];
                if (sum<target){
                    while (j<k&&nums[j]==nums[++j]);
                }else if (sum>target){
                    while (j<k&&nums[k]==nums[--k]);
                }else {
                    res.add(new ArrayList<Integer>(Arrays.asList(nums[start-1], nums[k], nums[i], nums[j])));
                    while (j<k&&nums[j]==nums[++j]);
                    while (j<k&&nums[k]==nums[--k]);
                }
            }
        }
    }

}
