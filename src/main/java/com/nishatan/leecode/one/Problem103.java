package com.nishatan.leecode.one;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

public class Problem103 {
    public static void main(String[] args) {
        TreeNode node3 = new TreeNode(3);
        TreeNode node2 = new TreeNode(2);
        TreeNode node1 = new TreeNode(1,node2, node3);
        new Problem103().zigzagLevelOrder(node1);
    }

    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        LinkedList<TreeNode> quene = new LinkedList<>();
        if (root==null){
            return new ArrayList<>(0);
        }
        quene.push(root);
        List<List<Integer>> res = new ArrayList<>();
        levelTraverse(res,quene,1);
        return  res;
    }

    private void  levelTraverse(List<List<Integer>> res, LinkedList<TreeNode> quene, int level){
        List<Integer> temp = new ArrayList<>();
        int size = quene.size();
        for (int i = 0; i < size; i++) {
            TreeNode node;
            if (level%2==1){
                node = quene.pollLast();
                if (node.left!=null){
                    quene.push(node.left);
                }
                if (node.right!=null){
                    quene.push(node.right);
                }
            }else {
                node = quene.pollFirst();
                if (node.right!=null){
                    quene.addLast(node.right);
                }
                if (node.left!=null){
                    quene.addLast(node.left);
                }
            }
            temp.add(node.val);

        }
        res.add(temp);
        if (!quene.isEmpty()){
            levelTraverse(res, quene, level+1);
        }
    }

}
