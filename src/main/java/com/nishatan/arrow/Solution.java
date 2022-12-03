package com.nishatan.arrow;

import java.util.*;

class Solution {
    public List<String> res = new LinkedList<>();


    public static void main(String[] args) {
        Solution solution = new Solution();
        ArrayList<String> abc = solution.Permutation("abcd");
        abc.forEach(System.out::println);

    }

    public ArrayList<String> Permutation(String str) {
        ArrayList<String> res = new ArrayList<>();
        if (str == null || str.length() == 0) {
            return res;
        }
        helper(res, 0, str.toCharArray());
        // 符合结果的输出顺序
        Collections.sort(res);
        return res;
    }
    private void helper(ArrayList<String> res, int index, char[] s) {
        if (index == s.length - 1) {
            res.add(String.valueOf(s));
            return;
        }
        for (int i = index; i < s.length; i++) {
            if (i == index || s[index] != s[i]) {
                swap(s, index, i);
                helper(res, index + 1, s);
                swap(s, index, i);
            }
        }
    }
    public void swap(char[] c, int a,int b) {
        char temp = c[a];
        c[a] = c[b];
        c[b] = temp;
    }

}
