package com.nishatan.leecode.one;

import java.util.BitSet;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeSet;

public class Problem128 {
    public static void main(String[] args) {

    }

    public int longestConsecutive(int[] nums) {
        if (nums.length==0){
            return 0;
        }
        TreeSet<Integer> set = new TreeSet<>();
        for (int i = 0; i < nums.length; i++) {
           set.add(nums[i]);
        }
        HashMap<Integer, Integer> map = new HashMap<>();
        for (Integer it : set) {
            if (map.containsKey(it-1)){
                map.put(it, map.get(it-1)+1);
                map.remove(it-1);
            }else {
                map.put(it,1);
            }
        }
        int res = 0;
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            res = Math.max(res, entry.getValue());
        }
        return res;
    }

}
