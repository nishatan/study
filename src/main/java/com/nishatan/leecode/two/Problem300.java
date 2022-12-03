package com.nishatan.leecode.two;

import java.util.Arrays;
import java.util.Stack;

public class Problem300 {
    public static void main(String[] args) {
        System.out.println(new Problem300().lengthOfLIS(new int[]{7, 7, 7, 7, 7, 7, 7}));
    }

    public int lengthOfLIS(int[] nums) {
        Stack<Integer> stack = new Stack<>();
        stack.push(nums[0]);
        int res = 0;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i]>stack.peek()){
                stack.push(nums[i]);
            }else {
                int temp = 0;
                while (!stack.isEmpty()&&stack.peek()>nums[i]){
                    stack.pop();
                    temp++;
                }
                res=Math.max(res, temp);
                if (stack.isEmpty()||stack.peek()<nums[i]){
                    stack.push(nums[i]);
                }
            }
        }
        Arrays.sort(new int[]{123456});
        int temp = 0;
        while (!stack.isEmpty()){
            stack.pop();
            temp++;
        }
        res=Math.max(res, temp);
        return res;
    }


}
