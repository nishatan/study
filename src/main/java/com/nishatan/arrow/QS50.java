package com.nishatan.arrow;

public class QS50 {
    public static void main(String[] args) {
        TreeNode node1 = new TreeNode(1);
        TreeNode node2 = new TreeNode(2);
        TreeNode node3 = new TreeNode(3);
        TreeNode node4 = new TreeNode(4);
        TreeNode node5 = new TreeNode(5);
        TreeNode node6 = new TreeNode(6);
        TreeNode node7 = new TreeNode(7);
        TreeNode node8 = new TreeNode(8);
        TreeNode node9 = new TreeNode(9);
        TreeNode node10 = new TreeNode(10);
        node7.left=node3;
        node7.right=node9;
        node3.left=node1;
        node3.right=node4;
        node9.left=node8;
        node9.right=node10;
        node1.right=node2;
        node4.right=node5;
        System.out.println(lowestConParent(node7, node2, node10).val);
    }

    private static TreeNode lowestConParent(TreeNode root, TreeNode a, TreeNode b) {
        if (root==null||a==null||b==null){
            return null;
        }
        if (a.val< root.val&&b.val< root.val){
            return lowestConParent(root.left,a,b);
        }else if (a.val> root.val&&b.val> root.val){
             return  lowestConParent(root.right,a,b);
        }else {
            return root;
        }
    }






}
