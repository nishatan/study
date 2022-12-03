package com.nishatan.leecode.one;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

public class Problem107 {
    public static void main(String[] args) {

    }

    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        LinkedList<TreeNode> quene = new LinkedList<>();
        if (root==null){
            return new ArrayList<>(0);
        }
        quene.push(root);
        LinkedList<List<Integer>> res = new LinkedList<>();
        levelTraverse(res,quene);
        return  res;
    }

    private void  levelTraverse(LinkedList<List<Integer>> res, LinkedList<TreeNode> quene){
        List<Integer> temp = new ArrayList<>();
        int size = quene.size();
        for (int i = 0; i < size; i++) {
            TreeNode node = quene.pollLast();
            temp.add(node.val);
            if (node.left!=null){
                quene.push(node.left);
            }
            if (node.right!=null){
                quene.push(node.right);
            }
        }
        res.addFirst(temp);
        if (!quene.isEmpty()){
            levelTraverse(res, quene);
        }
    }

}
