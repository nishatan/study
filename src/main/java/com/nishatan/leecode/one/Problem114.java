package com.nishatan.leecode.one;

public class Problem114 {
    public static void main(String[] args) {

    }

    public void flatten(TreeNode root) {
        if (root==null){
            return;
        }
        if (root.left!=null){
            flatten(root.left);
        }
        if (root.right!=null){
            flatten(root.right);
        }
        if (root.left==null){
            return;
        }
        TreeNode temp =  root.left;
        while (temp.right!=null){
            temp=temp.right;
        }
        temp.right= root.right;
        root.right=root.left;
        root.left=null;
    }

}
