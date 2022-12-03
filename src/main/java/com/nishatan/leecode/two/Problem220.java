package com.nishatan.leecode.two;

import java.util.HashMap;

public class Problem220 {
    public static void main(String[] args) {
        System.out.println(new Problem220().containsNearbyAlmostDuplicate(new int[]{8, 7, 15, 1, 6, 1, 9, 15}, 1, 3));
    }

    public boolean containsNearbyAlmostDuplicate(int[] nums, int indexDiff, int valueDiff) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            for (int j = nums[i]-valueDiff; j <= nums[i]+valueDiff; j++) {
                if (map.get(j)!=null && map.get(j)-i>=(-indexDiff)){
                    return true;
                }else {
                    continue;
                }
            }
            map.put(nums[i], i );
        }
        return false;
    }


}
