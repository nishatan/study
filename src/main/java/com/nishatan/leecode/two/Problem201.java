package com.nishatan.leecode.two;

import com.nishatan.leecode.one.TreeNode;

public class Problem201 {
    public static void main(String[] args) {
        System.out.println(new Problem201().rangeBitwiseAnd(0, 0));
    }

    public int rangeBitwiseAnd(int left, int right) {
        int i=0;
        while (i<32){
            if (left==right){
                return left<<i;
            }else {
               left= left>>1;
               right= right>>1;
               i++;
            }
        }
        return -1;
    }




}
