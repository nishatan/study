package com.nishatan.leecode.one;

import java.util.ArrayList;
import java.util.List;

public class Problem98 {
    public static void main(String[] args) {

    }

    public boolean isValidBST(TreeNode root) {
        List<Integer> temp = new ArrayList<>();
        boolean b2 = isValidBSTSub(root, temp);
        if (b2){
            for (int i = 1; i < temp.size(); i++) {
                if (temp.get(i)<=temp.get(i-1)){
                    return false;
                }
            }
        }
        return b2;
    }

    public boolean isValidBSTSub(TreeNode root, List<Integer> temp) {
        if (root==null){
            return true;
        }
        if (root.left!=null&&root.left.val>=root.val){
            return false;
        }
        if (root.right!=null&&root.right.val<=root.val){
            return false;
        }
        boolean b1 = isValidBSTSub(root.left, temp);
        temp.add(root.val);
        boolean b2 = isValidBSTSub(root.right, temp);
        return b1 && b2;
    }

}
