package com.nishatan.leecode.one;

public class Problem104 {
    public static void main(String[] args) {

    }

    public int maxDepth(TreeNode root) {
        if (root==null){
            return 0;
        }
        return 1 + Math.max(maxDepth(root.left), maxDepth(root.right));

    }

}
