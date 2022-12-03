package com.nishatan.leecode.one;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Problem96 {
    public static void main(String[] args) {
        System.out.println(new Problem96().numTrees(18));
    }

    public int numTrees(int n) {
        if (n==0){
            return 0;
        }
        int[][] dp = new int[n + 2][n + 2];
        return generateTreesSub(1,n,dp);
    }

    private int generateTreesSub(int i, int n, int[][] dp) {
        if (i>n){
            dp[i][n]=1;
            return 1;
        }
        int res = 0;
        for (int x = i; x <= n; x++) {
            int left = dp[i][x-1]==0?generateTreesSub(i, x-1,dp):dp[i][x-1];
            int right =dp[x+1][n]==0? generateTreesSub(x+1, n,dp):dp[x+1][n];
            res+=(left*right);
        }
        dp[i][n]=res;
        return res;
    }

}
