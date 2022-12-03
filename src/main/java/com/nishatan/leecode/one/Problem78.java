package com.nishatan.leecode.one;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class Problem78 {
    public static void main(String[] args) {

    }

    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        LinkedList<Integer> temp = new LinkedList<>();
        res.add(new ArrayList<>());
        Arrays.sort(nums);
        for (int k = 1; k <= nums.length; k++) {
            recursive(res,temp, nums, 1, k);
        }
        return res;
    }

    private void recursive(List<List<Integer>> res,LinkedList temp, int[] nums,int idx, int k) {
        if (temp.size()==k){
            res.add(new ArrayList<>(temp));
            return;
        }
        for (int i = idx; i <= nums.length; i++) {
            temp.add(nums[i-1]);
            recursive(res, temp, nums, i+1, k);
            temp.removeLast();
        }
    }

}
