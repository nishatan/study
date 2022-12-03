package com.nishatan.leecode.one;

import java.util.HashMap;

public class Problem1 {
    public static void main(String[] args) {
        Problem1 problem1 = new Problem1();
        int[] a = {2,7,11,15};
        for (int i : problem1.twoSum(a, 9)) {
            System.out.println(i);
        }
    }
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(nums[i])){
                Integer integer = map.get(nums[i]);
                int[] res = {integer, i};
                return res;
            }else{
                map.put(target-nums[i],i);
            }
        }
        return null;
    }
}
