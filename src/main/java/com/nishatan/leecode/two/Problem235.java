package com.nishatan.leecode.two;

import com.nishatan.leecode.one.TreeNode;

public class Problem235 {
    public static void main(String[] args) {

    }

    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if (root!=null&& p.val>root.val&&q.val>root.val){
            return lowestCommonAncestor(root.right, p, q);
        }
        if (root!=null && p.val<root.val&&q.val<root.val){
            return lowestCommonAncestor(root.right, p, q);
        }
        return root;

    }


}
