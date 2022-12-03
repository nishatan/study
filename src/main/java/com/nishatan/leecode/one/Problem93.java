package com.nishatan.leecode.one;

import java.util.ArrayList;
import java.util.List;

public class Problem93 {
    public static void main(String[] args) {
        new Problem93().restoreIpAddresses("172162541").forEach(System.out::println);
    }

    public List<String> restoreIpAddresses(String s) {
        List<String> res = new ArrayList<>();
        recursive(res, "", s, 0, 4);
        return  res;
    }

    private void recursive(List<String> res, String temp, String s, int idx, int k) {
        if (k==0){
            if (idx==s.length()){
                res.add(temp.substring(0,temp.length()-1));
            }
            return;
        }
        for (int i = 1; i <= 3; i++) {
            if (s.charAt(idx)=='0'&&i>1){
                break;
            }
            if (s.length()-idx-i<k-1) {
                break;
            }
            if (s.length()-idx-i>(k-1)*3) {
                continue;
            }
            String subs = s.substring(idx, idx + i);
            if (Integer.parseInt(subs)<256) {
                recursive(res, temp+ subs +".",s,idx+i, k-1);
            }
        }
    }

}
