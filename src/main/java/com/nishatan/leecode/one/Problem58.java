package com.nishatan.leecode.one;

public class Problem58 {
    public static void main(String[] args) {

    }

    public int lengthOfLastWord(String s) {
        int res = 0;
        for (int i = s.length(); i > 0; i--) {
            if (s.charAt(i)==' '){
                if (res==0){
                    continue;
                }else {
                    break;
                }
            }else {
                res++;
            }
        }
        return  res;
    }

}
