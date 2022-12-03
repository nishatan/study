package com.nishatan.leecode.one;

public class Problem167 {
    public static void main(String[] args) {

    }

    public int[] twoSum(int[] numbers, int target) {
        int l = 0;
        int r = numbers.length-1;
        while (numbers[l]+numbers[r]!=target){
            if (numbers[l]+numbers[r]>target){
                r--;
            }else if (numbers[l]+numbers[r]<target){
                l++;
            }
        }
        return new int[]{l+1,r+1};

    }

}
