package com.nishatan.leecode.two;

import java.util.HashMap;
import java.util.HashSet;

public class Problem205 {
    public static void main(String[] args) {
        System.out.println(new Problem205().isIsomorphic("paper", "title"));
    }

    public boolean isIsomorphic(String s, String t) {
        HashMap<Character, Character> map = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            if (map.containsKey(s.charAt(i))){
                if (t.charAt(i)==map.get(s.charAt(i))){
                    continue;
                }else {
                    return false;
                }
            }else {
                if (map.containsValue(t.charAt(i))){
                    return false;
                }else {
                    map.put(s.charAt(i),t.charAt(i));
                }
            }
        }
        return true;
    }


}
