package com.nishatan.leecode.one;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class Problem40 {
    public static void main(String[] args) {
        new Problem40().combinationSum2(new int[]{2,5,2,1,2},5).forEach(System.out::println);

    }

    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        Arrays.sort(candidates);
        List<List<Integer>> res = new ArrayList<>();
        find(candidates, 0,target,new LinkedList<>(), res);
        return res;
    }

    private void find(int[] candidates,int idx, int target, LinkedList<Integer> temp, List<List<Integer>> res) {
        if (target==0){
            List<Integer> integers = new ArrayList<>();
            integers.addAll(temp);
            res.add(integers);
            return;
        }
        for (int i = idx; i < candidates.length; i++) {
            if (target-candidates[i]>=0){
                temp.add(candidates[i]);
                find(candidates,i+1 ,target-candidates[i], temp, res);
                Integer last = temp.removeLast();
                while (i+1< candidates.length && candidates[i+1]==last){
                    i++;
                }
            }else {
                break;
            }
        }
    }

}
