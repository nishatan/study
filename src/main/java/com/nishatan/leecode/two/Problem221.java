package com.nishatan.leecode.two;

public class Problem221 {
    public static void main(String[] args) {

    }

    public int maximalSquare(char[][] matrix) {
        int res = 0;
        int[][] dp = new int[matrix.length][matrix[0].length];
        for (int i = 0; i < matrix.length; i++) {
            if (matrix[i][0]=='1'){
                dp[i][0]=1;
                res=1;
            }
        }
        for (int i = 0; i < matrix[0].length; i++) {
            if (matrix[0][i]=='1'){
                dp[0][i]=1;
                res=1;
            }
        }
        for (int i = 1; i < matrix.length; i++) {
            for (int j = 1; j < matrix[0].length; j++) {
                if (matrix[i][j]=='1'){
                    dp[i][j]=Math.min(dp[i-1][j-1], Math.min(dp[i][j-1],dp[i-1][j]))+1;
                    res=Math.max(res, dp[i][j]);
                }
            }
        }
        return res*res;

    }


}
