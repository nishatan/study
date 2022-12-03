package com.nishatan.leecode.one;

import java.util.ArrayList;
import java.util.List;

public class Problem17 {
    public static void main(String[] args) {
        new Problem17().letterCombinations("23").forEach(System.out::println);
    }

    static String[] map = {"abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};

    public List<String> letterCombinations(String digits) {
        char[] chars = new char[digits.length()];
        List<String> res = new ArrayList<>();
        if (digits.equals("")){
            return res;
        }
        rec(digits, 0, chars, res);
        return res;
    }

    private void rec(String digits, int i, char[] chars, List<String> res) {
        if (i==digits.length()){
            res.add(new String(chars));
            return;
        }
        String s = map[digits.charAt(i) - '0' - 2];
        for (int k = 0; k < s.length(); k++) {
            chars[i]=s.charAt(k);
            rec(digits, i+1, chars, res);
        }
    }


}
