package com.nishatan.leecode.one;

public class Problem67 {
    public static void main(String[] args) {
        System.out.println(new Problem67().addBinary("11", "1"));
    }

    public String addBinary(String a, String b) {
        int plus = 0;
        StringBuilder sb = new StringBuilder();
        for (int i = 1, j = 1; i <= a.length() || j<=b.length(); i++,j++) {
            int m = i>a.length()?0 : a.charAt(a.length() - i) - '0';
            int n = j>b.length()?0 : b.charAt(b.length() - j) - '0';
            sb.append((char) ((m+n+plus)%2+'0'));
            plus = (m+n+plus)/2;
        }
        if (plus>0) sb.append('1');
       return sb.reverse().toString();
    }
}
