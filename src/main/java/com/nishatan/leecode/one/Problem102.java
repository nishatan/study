package com.nishatan.leecode.one;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Problem102 {
    public static void main(String[] args) {

    }

    public List<List<Integer>> levelOrder(TreeNode root) {
        LinkedList<TreeNode> quene = new LinkedList<>();
        if (root==null){
            return new ArrayList<>(0);
        }
        quene.push(root);
        List<List<Integer>> res = new ArrayList<>();
        levelTraverse(res,quene);
        return  res;
    }

    private void  levelTraverse(List<List<Integer>> res, LinkedList<TreeNode> quene){
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
        res.add(temp);
        if (!quene.isEmpty()){
            levelTraverse(res, quene);
        }
    }

}
