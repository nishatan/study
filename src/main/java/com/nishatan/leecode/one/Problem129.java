package com.nishatan.leecode.one;

import java.util.LinkedList;

public class Problem129 {
    public static void main(String[] args) {

    }

    int res = 0;
    public int sumNumbers(TreeNode root) {
        sumNumbers(root, 0);
        return res;
    }
    public void sumNumbers(TreeNode root, int temp) {
        int va = temp * 10 + root.val;
        if (root.left==null&&root.right==null){
            res+=va;
            return;
        }
        if (root.left!=null){
            sumNumbers(root.left, va);
        }
        if (root.right!=null){
            sumNumbers(root.right, va);
        }
    }

}
