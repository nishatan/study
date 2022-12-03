package com.nishatan.leecode.two;

import com.nishatan.leecode.one.TreeNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Problem222 {
    public static void main(String[] args) {

    }

    public int countNodes(TreeNode root) {
        LinkedList<TreeNode> quene = new LinkedList<>();
        if (root==null){
            return 0;
        }
        quene.push(root);
        return  levelTraverse(quene);
    }

    private int  levelTraverse(LinkedList<TreeNode> quene){
        int size = quene.size();
        for (int i = 0; i < size; i++) {
            TreeNode node = quene.pollLast();
            if (node.left!=null){
                quene.push(node.left);
            }
            if (node.right!=null){
                quene.push(node.right);
            }
        }
        if (!quene.isEmpty()){
          return size+  levelTraverse(quene);
        }
        return size;
    }


}
