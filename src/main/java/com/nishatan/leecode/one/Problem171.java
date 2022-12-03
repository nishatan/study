package com.nishatan.leecode.one;

public class Problem171 {
    public static void main(String[] args) {
        System.out.println(new Problem171().titleToNumber("A"));
    }

    public int titleToNumber(String columnTitle) {
        int res = 0;
        int length = columnTitle.length();
        for (int i = 0; i < length; i++) {
            int tp = columnTitle.charAt(length-1-i) + 1 - 'A';
            res = res+tp*(int)Math.pow(26,i);
        }
        return  res;
    }

}
