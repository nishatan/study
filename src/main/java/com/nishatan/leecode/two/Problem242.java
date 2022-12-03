package com.nishatan.leecode.two;

import java.util.Arrays;

public class Problem242 {
    public static void main(String[] args) {

    }

    public boolean isAnagram(String s, String t) {
        char[] sChars = s.toCharArray();
        char[] tChars = t.toCharArray();
        Arrays.sort(sChars);
        Arrays.sort(tChars);
        return Arrays.equals(sChars, tChars);
    }


}
