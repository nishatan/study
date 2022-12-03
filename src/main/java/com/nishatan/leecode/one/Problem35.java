package com.nishatan.leecode.one;

public class Problem35 {
    public static void main(String[] args) {
        System.out.println(new Problem35().searchInsert(new int[]{1, 2, 3, 5, 6}, 0));
    }

    public int searchInsert(int[] nums, int target) {
        int low = 0;
        int high = nums.length - 1;

        while (low <= high) {
            int mid = (low + high) >>> 1;
            int midVal = nums[mid];

            if (midVal < target)
                low = mid + 1;
            else if (midVal > target)
                high = mid - 1;
            else
                return mid; // key found
        }
        if (high<low){
            return high+1;
        }else {
            return 0;
        }
    }

}
