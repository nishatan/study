package com.nishatan.leecode.one;

public class Problem108 {
    public static void main(String[] args) {

    }

    public TreeNode sortedArrayToBST(int[] nums) {
        return sortedArrayToBSTsub(nums, 0, nums.length - 1);
    }

    public TreeNode sortedArrayToBSTsub(int[] nums, int left, int right) {
        if (left>right){
            return null;
        }
        int mid  = (left+right)/2;
        TreeNode treeNode = new TreeNode(nums[mid]);
        treeNode.left = sortedArrayToBSTsub(nums, left, mid-1);
        treeNode.right = sortedArrayToBSTsub(nums, mid+1, right);
        return treeNode;
    }

}
