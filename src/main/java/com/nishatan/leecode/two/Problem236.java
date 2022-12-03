package com.nishatan.leecode.two;

import com.nishatan.leecode.one.TreeNode;

public class Problem236 {
    public static void main(String[] args) {
        TreeNode a = new TreeNode(2);
        TreeNode b = new TreeNode(5,null,a);
        TreeNode c = new TreeNode(1);
        TreeNode d = new TreeNode(3,b,c);
        System.out.println(new Problem236().lowestCommonAncestor(d, b, c).val);
    }

    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if (root==null||root==p||root==q){
            return root;
        }
        TreeNode left = lowestCommonAncestor(root.left, p, q);
        TreeNode right = lowestCommonAncestor(root.right, p, q);
        if (left!=null&&right!=null){
            return root;
        }
        if (left!=null){
            return left;
        }
        if (right!=null){
            return right;
        }
        return null;
    }


}
