package com.nishatan.leecode.two;

import com.nishatan.leecode.one.TreeNode;

public class Problem230 {
    public static void main(String[] args) {
        TreeNode a = new TreeNode(2);
        TreeNode b = new TreeNode(1,null,a);
        TreeNode c = new TreeNode(1);
        TreeNode d = new TreeNode(1,b,c);

        System.out.println(new Problem230().kthSmallest(d, 1));
    }
    int res = -1;

    public int kthSmallest(TreeNode root, int k) {
        recursive(root, k);
        return res;
    }

    private int recursive(TreeNode root, int k) {
        if (res!=-1){
            return 0;
        }
        int cnt=0;
        if (root.left!=null){
           cnt =  recursive(root.left, k);
        }
        cnt++;
        if (cnt==k){
            res = root.val;
            return cnt;
        }
        if (root.right!=null){
            cnt+=recursive(root.right, k);
        }
        return cnt;
    }


}
