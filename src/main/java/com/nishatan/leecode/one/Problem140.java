package com.nishatan.leecode.one;

import java.util.*;
import java.util.stream.Collectors;

public class Problem140 {
    public static void main(String[] args) {
        new Problem140().wordBreak("catsandog", Arrays.asList("cat","cats","and","sand","dog")).forEach(System.out::println);
    }

    public List<String> wordBreak(String s, List<String> wordDict) {
        Set<String> sets = new HashSet<>(wordDict);
        boolean[] dp = new boolean[s.length() + 1];
        List<List<String>> res = new ArrayList<>(s.length() + 1);
        res.add(Arrays.asList(""));
        dp[0]=true;
        for (int i = 1; i < s.length()+1; i++) {
            res.add(new ArrayList<>());
            for (int j = 0; j < i; j++) {
                String substr = s.substring(j, i);
                if (dp[j] && sets.contains(substr)){
                    int finalI = i;
                    res.get(i).addAll(res.get(j).stream().map(str -> {
                         if (finalI == s.length()) {
                             return str + substr;
                         }else {
                             return str + substr + " ";
                         }
                         }).collect(Collectors.toList()));
                    dp[i]=true;
                }
            }
        }
        return res.get(s.length());
    }

}
