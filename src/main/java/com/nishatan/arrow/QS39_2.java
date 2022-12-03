package com.nishatan.arrow;

public class QS39_2 {
    public static void main(String[] args) {
        TreeNode node1 = new TreeNode(1);
        TreeNode node2 = new TreeNode(2);
        TreeNode node3 = new TreeNode(3);
        TreeNode node4 = new TreeNode(4);
        TreeNode node5 = new TreeNode(5);
        TreeNode node6 = new TreeNode(6);
        TreeNode node7 = new TreeNode(7);
        TreeNode node8 = new TreeNode(8);
        node1.left=node2;
        node1.right=node3;
        node2.left=node4;
        node2.right=node5;
//        node3.left=node6;
//        node3.right=node7;
        node4.left=node8;
        System.out.println(isBalanceTree(node1));
    }

    public static boolean isBalanceTree(TreeNode tree){
        if (tree==null){
            return true;
        }
//        boolean bb = isBalanceTree(tree.left)&&isBalanceTree(tree.right);
        if (Math.abs(getTreeDepth(tree.left)-getTreeDepth(tree.right))>1){
            return false;
        }
        return isBalanceTree(tree.left)&&isBalanceTree(tree.right);
    }

    public static int getTreeDepth(TreeNode tree){
        if (tree==null){
            return 0;
        }
        return 1+Math.max(getTreeDepth(tree.left),getTreeDepth(tree.right));
    }
}
