package com.nishatan.leecode.one;

public class Problem151 {
    public static void main(String[] args) {
        System.out.println(new Problem151().reverseWords("a good   example"));

    }
    public String reverseWords(String s) {
        String[] split = s.split(" ");
        StringBuilder sb = new StringBuilder();
        for (int i = split.length - 1; i >= 0; i--) {
            if (split[i].equals("")||split.equals(" ")){
                continue;
            }
            sb.append(" ").append(split[i]);
        }
        return  sb.substring(1);
    }

}
