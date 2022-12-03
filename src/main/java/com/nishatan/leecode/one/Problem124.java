package com.nishatan.leecode.one;

import javax.management.MXBean;

public class Problem124 {
    public static void main(String[] args) {

    }
    int maxval = Integer.MIN_VALUE;


    public int maxPathSum(TreeNode root) {
        maxPathSumSub(root);
        return maxval;
    }

    public int maxPathSumSub(TreeNode root) {
        if (root==null){
            return 0;
        }
        int lv = Math.max(maxPathSumSub(root.left),0);
        int rv = Math.max( maxPathSumSub(root.right),0);
        maxval = Math.max(maxval, lv + rv +root.val);
        return Math.max(lv, rv)+root.val;

    }

}
