package com.nishatan;


import java.util.Objects;

public class QS18 {
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
        TreeNode treeB = new TreeNode(4);
        treeB.left=node7;

        System.out.println(process(node1, node1));
    }

    public static boolean process(TreeNode a,TreeNode b) {
        if (a==null&&b==null){
            return true;
        }
        if (a==null&&b!=null){
            return false;
        }
        if (a!=null&&b==null){
            return true;
        }
        if (a.val==b.val){
            return containTree(a.left,b.left)&&containTree(a.right,b.right);
        } else {
            return process(a.left,b)||process(a.right,b);
        }
    }

    public static boolean containTree(TreeNode a,TreeNode b) {
        if (a==null&&b==null){
            return true;
        }
        if (a==null&&b!=null){
            return false;
        }
        if (a!=null&&b==null){
            return true;
        }
        return a.val==b.val&&containTree(a.left,b.left)&&containTree(a.right,b.right);
    }

}
