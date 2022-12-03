package com.nishatan.leecode.one;

import java.util.ArrayList;
import java.util.List;

public class Problem94 {
    public static void main(String[] args) {

    }

    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> res = new ArrayList<>();
        recursive(root, res);
        return  res;
    }

    private void recursive(TreeNode root, List<Integer> res) {
        if (root==null){
            return;
        }
        recursive(root.left,res);
        res.add(root.val);
        recursive(root.right,res);
    }

}
