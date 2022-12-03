package com.nishatan.leecode.one;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class Problem39 {
    public static void main(String[] args) {
        new Problem39().combinationSum(new int[]{2},1).forEach(System.out::println);

    }

    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        Arrays.sort(candidates);
        List<List<Integer>> res = new ArrayList<>();
        for (int i = 0; i < candidates.length; i++) {
            if (target-candidates[i]>=0){
                LinkedList<Integer> temp = new LinkedList<>();
                temp.add(candidates[i]);
                find(candidates,i, target-candidates[i], temp, res);
            }
        }
        return res;
    }

    private void find(int[] candidates,int idx, int target, LinkedList<Integer> temp, List<List<Integer>> res) {
        if (target==0){
            List<Integer> integers = new ArrayList<>();
            integers.addAll(temp);
            res.add(integers);
        }
        for (int i = idx; i < candidates.length; i++) {
            if (target-candidates[i]>=0){
                temp.add(candidates[i]);
                find(candidates,i ,target-candidates[i], temp, res);
                temp.removeLast();
            }else {
                break;
            }
        }
    }

}
