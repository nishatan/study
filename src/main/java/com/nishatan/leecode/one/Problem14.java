package com.nishatan.leecode.one;

public class Problem14 {
    public static void main(String[] args) {
        String[] ss = {"flower","flow","flight"};
        System.out.println(new Problem14().longestCommonPrefix(ss));
    }
    public String longestCommonPrefix(String[] strs) {
        int idx = -1;
        for (int i = 0; i < strs[0].length(); i++) {
            char key = strs[0].charAt(i);
            boolean same=true;
            for (int j = 1; j < strs.length; j++) {
                if (strs[j].length()<=i || strs[j].charAt(i)!=key){
                    same=false;
                    break;
                }
            }
            if (same){
                idx = i;
            }else {
                break;
            }
        }
        if (idx==-1){
            return "";
        }
        return strs[0].substring(0,idx+1);

    }
}
