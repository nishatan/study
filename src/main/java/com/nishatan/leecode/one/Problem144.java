package com.nishatan.leecode.one;

import java.util.ArrayList;
import java.util.List;

public class Problem144 {
    public static void main(String[] args) {

    }

    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> res = new ArrayList<Integer>();
        preorder(root, res);
        return res;
    }

    public void preorder(TreeNode root, List<Integer> res) {
        if (root == null) {
            return;
        }
        preorder(root.left, res);
        preorder(root.right, res);
        res.add(root.val);
    }

}
