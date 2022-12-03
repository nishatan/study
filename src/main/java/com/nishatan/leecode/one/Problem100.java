package com.nishatan.leecode.one;

public class Problem100 {
    public static void main(String[] args) {

    }

    public boolean isSameTree(TreeNode p, TreeNode q) {
        if (p==null&&q==null){
            return true;
        }
        if (p!=null&&q!=null&&p.val==q.val&&isSameTree(p.left,q.left)&&isSameTree(p.right,q.right)){
            return true;
        }
        return false;
    }

}
