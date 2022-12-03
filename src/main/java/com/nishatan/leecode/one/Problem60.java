package com.nishatan.leecode.one;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Problem60 {
    public static void main(String[] args) {
        System.out.println(new Problem60().getPermutation(3, 3));

    }
    static Integer kk = 0;

    public String getPermutation(int n, int k) {
        int[] nums = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i]=i+1;
        }
        kk=0;
        String res = null;
        boolean[] bls = new boolean[nums.length];
        LinkedList<Integer> temp = new LinkedList<>();
       return recursive(res , nums , bls, temp, k);
    }

    private String recursive(String res, int[] nums, boolean[] bls, LinkedList<Integer> temp, int k) {
        if (temp.size()== nums.length){
            if (kk==k-1){
                StringBuilder sb = new StringBuilder();
                temp.forEach(ii->sb.append((char)(ii+'0')));
                res=sb.toString();
                return res;
            }else {
                kk++;
                return null;
            }
        }
        for (int i = 0; i < nums.length; i++) {
            if (bls[i]){
                continue;
            }
            bls[i]=true;
            temp.add(nums[i]);
            String recursive = recursive(res, nums, bls, temp, k);
            if (recursive!=null){
                return recursive;
            }
            bls[i]=false;
            temp.removeLast();
        }
        return null;
    }

}
