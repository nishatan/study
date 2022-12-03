package com.nishatan.leecode.one;

import java.util.ArrayList;
import java.util.List;

public class Problem22 {
    public static void main(String[] args) {

    }

    public List<String> generateParenthesis(int n) {
        List<String> res = new ArrayList<>();
        dfs(res, "", n, n);
        return  res;
    }

    private void dfs(List<String> res, String cur , int a, int b){
        if (a==0&&b==0){
            res.add(cur);
        }
        if (a>0){
            dfs(res, cur+"(", a-1,b);
        }
        if (b>0&&b>a){
            dfs(res,cur+")", a, b-1);
        }
    }
}
