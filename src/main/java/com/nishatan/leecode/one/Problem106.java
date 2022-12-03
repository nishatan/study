package com.nishatan.leecode.one;

import java.util.HashMap;
import java.util.Map;

public class Problem106 {
    public static void main(String[] args) {
        new Problem106().buildTree(new int[]{9,3,15,20,7}, new int[]{9,15,7,20,3});

    }

    public TreeNode buildTree(int[] inorder, int[] postorder) {
        int n = postorder.length;
        Map<Integer, Integer> indexMap = new HashMap<Integer, Integer>();
        for (int i = 0; i < n; i++) {
            indexMap.put(inorder[i], i);
        }
        return buildSub(postorder, indexMap, 0, n - 1, 0, n - 1);
    }

    public TreeNode buildSub(int[] postorder, Map<Integer, Integer> indexMap, int postorder_left, int postorder_right, int inorder_left, int inorder_right) {
        if (postorder_left > postorder_right) {
            return null;
        }
        int postorder_root = postorder_right;
        int idx = indexMap.get(postorder[postorder_root]);
        TreeNode root = new TreeNode(postorder[postorder_root]);
        root.right = buildSub(postorder, indexMap, postorder_right- inorder_right+idx, postorder_right-1, idx+1, inorder_right);
        root.left  = buildSub(postorder, indexMap, postorder_left, postorder_left + idx-inorder_left-1, inorder_left, idx-1);
        return root;
    }

}
