package com.nishatan.leecode.one;

public class Problem97 {
    public static void main(String[] args) {
        System.out.println(new Problem97().isInterleave("", "", "a"));
    }

    public boolean isInterleave(String s1, String s2, String s3) {
        if (s1.length()+s2.length()!=s3.length()){
            return false;
        }
        boolean[][] dp = new boolean[s1.length() + 1][s2.length() + 1];
        dp[0][0]=true;
        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i)!=s3.charAt(i)){
                break;
            }
            dp[i+1][0]=true;
        }
        for (int i = 0; i < s2.length(); i++) {
            if (s2.charAt(i)!=s3.charAt(i)){
                break;
            }
            dp[0][i+1]=true;
        }
        for (int i = 1; i < s1.length() + 1; i++) {
            for (int j = 1; j < s2.length() + 1; j++) {
                dp[i][j]=(dp[i-1][j]&&s1.charAt(i-1)==s3.charAt(i+j-1))||(dp[i][j-1]&&s2.charAt(j-1)==s3.charAt(i+j-1));
            }
        }
        return dp[s1.length()][s2.length()];
    }
}
