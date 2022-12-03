package com.nishatan.leecode.one;

import java.sql.Ref;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Problem139 {
    public static void main(String[] args) {
        System.out.println(new Problem139().wordBreak("aaaaaaaa",Arrays.asList("aaaa","aaa","aa")));
    }

    public boolean wordBreak(String s, List<String> wordDict) {
        HashSet<String> sets = new HashSet<>();
        TreeSet<Integer> lengths = new TreeSet<>();
        for (String ss : wordDict) {
            sets.add(ss);
            lengths.add(ss.length());
        }
        HashSet<String> cache = new HashSet<>();
        return dfs(s,0,sets, lengths,cache);
    }

    private  boolean  dfs(String s, int idx, HashSet<String> sets, TreeSet<Integer> lengths, HashSet<String> cache){
        if (idx==s.length()){
            return true;
        }
        if (cache.contains(s.substring(idx))){
            return true;
        }
        for (Integer length : lengths) {
            if (idx+length>s.length()){
                continue;
            }
            String substring = s.substring(idx, idx + length);
            if (sets.contains(substring)){
                cache.add(s.substring(0,idx+length));
                if (dfs(s, idx+length, sets, lengths, cache)){
                    return true;
                }
            }
        }
        return false;
    }

}
