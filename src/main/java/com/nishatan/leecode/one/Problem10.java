package com.nishatan.leecode.one;

public class Problem10 {
    public static void main(String[] args) {
        System.out.println(new Problem10().isMatch("aa", "a*"));
    }

    public boolean isMatch(String s, String p) {
        return s.matches(p);
    }
}
