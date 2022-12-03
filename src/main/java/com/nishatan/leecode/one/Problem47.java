package com.nishatan.leecode.one;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class Problem47 {
    public static void main(String[] args) {
        new Problem47().permuteUnique(new int[]{1,2,3}).forEach(System.out::println);
    }

    public List<List<Integer>> permuteUnique(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> res = new ArrayList<>();
        boolean[] bls = new boolean[nums.length];
        LinkedList<Integer> temp = new LinkedList<>();
        recursive(res , nums , bls, temp);
        return res;
    }

    private void recursive(List<List<Integer>> res, int[] nums, boolean[] bls, LinkedList<Integer> temp) {
        if (temp.size()== nums.length){
            List<Integer> re = new ArrayList<>();
            re.addAll(temp);
            res.add(re);
        }
        for (int i = 0; i < nums.length; i++) {
            if (bls[i]){
                continue;
            }
            if (i>0&&nums[i]==nums[i-1]&&bls[i-1]!=true){
                continue;
            }
            bls[i]=true;
            temp.add(nums[i]);
            recursive(res,nums, bls, temp);
            bls[i]=false;
            temp.removeLast();
        }
    }

}
