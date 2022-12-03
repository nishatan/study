package com.nishatan.leecode.one;

public class Problem112 {
    public static void main(String[] args) {

    }
    public boolean hasPathSum(TreeNode root, int targetSum) {
        if (root==null){
            return false;
        }
       return hasPathSumSub(root, targetSum);
    }

    public boolean hasPathSumSub(TreeNode root, int targetSum) {
        if (root.left!=null&&root.right!=null){
            return hasPathSumSub(root.left, targetSum- root.val)||hasPathSumSub(root.right, targetSum-root.val);
        }
        if (root.left!=null){
            return hasPathSumSub(root.left, targetSum- root.val);
        }
        if (root.right!=null){
            return hasPathSumSub(root.right, targetSum-root.val);
        }
        return targetSum == root.val;
    }

}
