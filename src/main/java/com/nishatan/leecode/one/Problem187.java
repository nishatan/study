package com.nishatan.leecode.one;

import java.util.*;

public class Problem187 {
    public static void main(String[] args) {
        new Problem187().findRepeatedDnaSequences("AAAAAAAAAAA");
    }

    public List<String> findRepeatedDnaSequences(String s) {
        Set<String> res = new HashSet<>();
        if (s.length()<=10){
            return new ArrayList<>();
        }
        HashSet<String> set = new HashSet<>();
        for (int i = 10; i <= s.length(); i++) {
            String substring = s.substring(i - 10, i);
            if (set.contains(substring)){
                res.add(substring);
            }else {
                set.add(substring);
            }
        }
        return new ArrayList<>(res);
    }

}
