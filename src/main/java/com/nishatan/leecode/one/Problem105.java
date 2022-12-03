package com.nishatan.leecode.one;

import java.util.HashMap;
import java.util.Map;

public class Problem105 {
    public static void main(String[] args) {

    }
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        int n = preorder.length;
        Map<Integer, Integer> indexMap = new HashMap<Integer, Integer>();
        for (int i = 0; i < n; i++) {
            indexMap.put(inorder[i], i);
        }
        return buildSub(preorder, indexMap, 0, n - 1, 0, n - 1);
    }

    public TreeNode buildSub(int[] preorder, Map<Integer, Integer> indexMap, int preorder_left, int preorder_right, int inorder_left, int inorder_right) {
        if (preorder_left > preorder_right) {
            return null;
        }
        int preorder_root = preorder_left;
        int idx = indexMap.get(preorder[preorder_root]);
        TreeNode root = new TreeNode(preorder[preorder_root]);
        root.left = buildSub(preorder, indexMap, preorder_left + 1, preorder_left + idx-inorder_left, inorder_left, idx - 1);
        root.right = buildSub(preorder, indexMap, preorder_left + idx-inorder_left + 1, preorder_right, idx + 1, inorder_right);
        return root;
    }
 }
