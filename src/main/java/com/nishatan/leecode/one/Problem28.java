package com.nishatan.leecode.one;

public class Problem28 {
    public static void main(String[] args) {
        System.out.println(new Problem28().strStr("sadbutsad", "butt"));
    }

    public int strStr(String haystack, String needle) {
        int res = -1;
        for (int i = 0; i < haystack.length()-needle.length()+1; i++) {
            int temp = i;
            for (int j = 0; j < needle.length(); j++) {
                if (haystack.charAt(temp)!=needle.charAt(j)){
                    res=-1;
                    break;
                }else {
                    if (res==-1){
                        res=temp;
                    }
                    temp++;
                }
            }
            if (res!=-1){
                return res;
            }
        }
        return res;
    }
}
