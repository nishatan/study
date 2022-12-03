package com.nishatan.leecode.one;

public class Problem87 {
    public static void main(String[] args) {
        new Problem87().merge(new int[]{1,2,3,0,0,0},3, new int[]{2,5,6}, 3);
    }

    public void merge(int[] nums1, int m, int[] nums2, int n) {
        for (int i = m + n-1; i >= n; i--) {
            nums1[i]=nums1[i-n];
        }
        int x = n;
        int y = 0;
        for (int i = 0; i < m + n; i++) {
            if (x==m+n){
                while (y!=n){
                    nums1[i++]=nums2[y++];
                }
            }else if (y==n){
                while (x!=m+n){
                    nums1[i++]=nums1[x++];
                }
            }else if (nums1[x]>nums2[y]){
                nums1[i]=nums2[y++];
            }else {
                nums1[i]=nums1[x++];
            }
        }
    }


}
