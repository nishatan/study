package com.nishatan.leecode.one;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Problem113 {
    public static void main(String[] args) {

    }

    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        LinkedList<Integer> temp = new LinkedList<>();
        List<List<Integer>> res = new ArrayList<>();
        if (root==null){
            return res;
        }
        hasPathSumSub(root, targetSum, res, temp);
        return res;
    }

    public void hasPathSumSub(TreeNode root, int targetSum, List<List<Integer>> res, LinkedList<Integer> temp) {
        if (root.left!=null){
            temp.add(root.val);
            hasPathSumSub(root.left, targetSum- root.val, res, temp);
            temp.removeLast();
        }
        if (root.right!=null){
            temp.add(root.val);
            hasPathSumSub(root.right, targetSum-root.val, res, temp);
            temp.removeLast();
        }
        if (root.left==null&& root.right==null&&root.val==targetSum){
            temp.add(root.val);
            res.add(new ArrayList<>(temp));
            temp.removeLast();
        }
    }

}
