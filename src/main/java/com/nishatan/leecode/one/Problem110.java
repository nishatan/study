package com.nishatan.leecode.one;

import java.awt.geom.Area;

public class Problem110 {
    public static void main(String[] args) {

    }

    public boolean isBalanced(TreeNode root) {
        if (root==null){
            return true;
        }
        boolean bl = isBalanced(root.left);
        boolean br = isBalanced(root.right);
        return Math.abs( treeLen(root.left)-treeLen(root.right))<=1&&bl&&br;
    }

    private int treeLen(TreeNode root){
        if (root==null){
            return 0;
        }
        return Math.min(treeLen(root.left), treeLen(root.right))+1;
    }

}
