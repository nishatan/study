package com.nishatan.arrow;

public class TreePrint {
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
        node3.left=node6;
        node3.right=node7;
        node4.left=node8;
        prePrint(node1);
    }

    public static void prePrint(TreeNode tree) {
        System.out.println(tree.val);
        if (tree.left!=null){
            prePrint(tree.left);
        }
        if (tree.right!=null){
            prePrint(tree.right);
        }
    }

    public static void midPrint(TreeNode tree) {
        if (tree.left!=null){
            midPrint(tree.left);
        }
        System.out.println(tree.val);
        if (tree.right!=null){
            midPrint(tree.right);
        }
    }

    public static void postPrint(TreeNode tree) {
        if (tree.left!=null){
            postPrint(tree.left);
        }
        if (tree.right!=null){
            postPrint(tree.right);
        }
        System.out.println(tree.val);
    }
}
