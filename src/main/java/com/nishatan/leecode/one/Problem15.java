package com.nishatan.leecode.one;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Problem15 {
    public static void main(String[] args) {
        new Problem15().threeSum(new int[]{-1,0,1,2,-1,-4}).forEach(System.out::println);
    }

    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        ArrayList<List<Integer>> lists = new ArrayList<>();
        for (int i = 0; i < nums.length-2; i++) {
            if(nums[i] > 0) break;
            if (i>0&&nums[i]==nums[i-1]){
                continue;
            }
            int j = i+1;
            int k = nums.length-1;
            while (j<k) {
                int sum = nums[i] + nums[j] + nums[k];
                if (sum<0){
                    while (j<k&&nums[j]==nums[++j]);
                }else if (sum>0){
                    while (j<k&&nums[k]==nums[--k]);
                }else {
                    lists.add(new ArrayList<Integer>(Arrays.asList(nums[k], nums[i], nums[j])));
                    while (j<k&&nums[j]==nums[++j]);
                    while (j<k&&nums[k]==nums[--k]);
                }
            }
        }
        return lists;
    }

}
