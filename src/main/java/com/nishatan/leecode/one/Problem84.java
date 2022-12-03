package com.nishatan.leecode.one;

import java.util.ArrayDeque;
import java.util.Arrays;

public class Problem84 {
    public static void main(String[] args) {
        System.out.println(new Problem84().largestRectangleArea(new int[]{1,1}));
    }

    public int largestRectangleArea(int[] heights) {
        int[] newNums = Arrays.copyOf(heights, heights.length + 1);
        newNums[heights.length]=0;
        ArrayDeque<Integer> stack = new ArrayDeque<>();
        stack.push(0);
        int res = newNums[0];
        for (int i = 1; i < newNums.length; i++) {
            if (newNums[i]>= newNums[stack.peek()]){
                stack.push(i);
            }else {
                while (!stack.isEmpty() && newNums[stack.peek()]>=newNums[i]){
                    Integer pop = stack.pop();
                    int temp = 0;
                    if (!stack.isEmpty()){
                       temp  = newNums[pop] * (i - stack.peek()-1);
                    }else {
                        temp  = newNums[pop] * (i);
                    }
                    res=Math.max(res, temp);
                }
                stack.push(i);
            }
        }
        return res;
    }

}
