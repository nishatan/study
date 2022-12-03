package com.nishatan.leecode.one;

import javax.lang.model.element.VariableElement;
import java.lang.reflect.ParameterizedType;
import java.util.ArrayDeque;
import java.util.Arrays;

public class Problem85 {
    public static void main(String[] args) {
        char[] c1 = {'1','0','1','0','0'};
        char[] c2 = {'1','0','1','1','1'};
        char[] c3 = {'1','1','1','1','1'};
        char[] c4 = {'1','0','0','1','0'};
        char[][] chars = new char[4][5];
        chars[0]=c1;
        chars[1]=c2;
        chars[2]=c3;
        chars[3]=c4;
        System.out.println(new Problem85().maximalRectangle(chars));
    }

    public int maximalRectangle(char[][] matrix) {
        int[][] param = new int[matrix.length][matrix[0].length + 1];
        for (int j = 0; j < matrix[0].length; j++) {
            param[0][j]=matrix[0][j]-'0';
        }
        int res = largestRectangleArea(param[0]);
        for (int i = 1; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                param[i][j]=matrix[i][j]-'0';
                if (param[i][j]!=0){
                    param[i][j]+=param[i-1][j];
                }
            }
            res=Math.max(res, largestRectangleArea(param[i]));
        }
        return res;
    }

    public int largestRectangleArea(int[] newNums) {
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
