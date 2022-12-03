package com.nishatan.leecode.one;

public class Problem101 {
    public static void main(String[] args) {

    }

    public boolean isSymmetric(TreeNode root) {
      return   isSameTree(root,root);
    }

    public boolean isSameTree(TreeNode p, TreeNode q) {
        if (p==null&&q==null){
            return true;
        }
        if (p!=null&&q!=null&&p.val==q.val&&isSameTree(p.left,q.right)&&isSameTree(p.right,q.left)){
            return true;
        }
        return false;
    }

}
