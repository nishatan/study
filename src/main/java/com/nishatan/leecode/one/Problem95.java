package com.nishatan.leecode.one;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Problem95 {
    public static void main(String[] args) {
        System.out.println(new Problem95().generateTrees(3));
    }

    public List<TreeNode> generateTrees(int n) {
        if(n == 0)
            return new LinkedList<TreeNode>();
        return generateTreesSub(1,n);
    }

    private List<TreeNode> generateTreesSub(int i, int n) {
        List<TreeNode> res = new ArrayList<>();
        if (i<1||i>n){
            res.add(null);
            return res;
        }
        for (int x = i; x <= n; x++) {
            List<TreeNode> left = generateTreesSub(i, x-1);
            List<TreeNode> right = generateTreesSub(x+1, n);
            for (TreeNode rnode : right) {
                for (TreeNode lnode : left) {
                    TreeNode treeNode = new TreeNode(x);
                    treeNode.left=lnode;
                    treeNode.right=rnode;
                    res.add(treeNode);
                }
            }
        }
        return res;
    }
}
