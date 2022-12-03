package com.nishatan.leecode.one;

import javax.naming.spi.ResolveResult;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Problem46 {
    public static void main(String[] args) {
        new Problem46().permute(new int[]{1,2,3}).forEach(System.out::println);
    }

    public List<List<Integer>> permute(int[] nums) {
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
            bls[i]=true;
            temp.add(nums[i]);
            recursive(res,nums, bls, temp);
            bls[i]=false;
            temp.removeLast();
        }
    }

}
