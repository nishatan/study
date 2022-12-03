package com.nishatan.leecode.one;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Problem199 {
    public static void main(String[] args) {

    }

    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> res = new ArrayList<>();
        if (root==null){
            return res;
        }
        LinkedList<TreeNode> treeNodes = new LinkedList<>();
        treeNodes.push(root);
        res.add(root.val);
        while (true){
            ArrayList<TreeNode> temp = new ArrayList<>();
            while (!treeNodes.isEmpty()){
                TreeNode poll = treeNodes.poll();
                if (poll.left!=null){
                    temp.add(poll.left);
                }
                if (poll.right!=null){
                    temp.add(poll.right);
                }
            }
            if (temp.isEmpty()){
                break;
            }else {
                res.add(temp.get(temp.size()-1).val);
                treeNodes.addAll(temp);
            }
        }
        return res;
    }


}
