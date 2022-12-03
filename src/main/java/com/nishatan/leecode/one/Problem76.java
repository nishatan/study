package com.nishatan.leecode.one;

import java.time.chrono.IsoChronology;
import java.util.HashMap;
import java.util.Map;

public class Problem76 {
    public static void main(String[] args) {
        System.out.println(new Problem76().minWindow("cabwefgewcwaefgcf","cae"));
    }

    public String minWindow(String s, String t) {
        HashMap<Character, Integer> map = new HashMap<>();
        HashMap<Character, Integer> search = new HashMap<>();
        for (int i = 0; i < t.length(); i++) {
            if (map.containsKey(t.charAt(i))){
                map.put(t.charAt(i), map.get(t.charAt(i))+1);
            }else {
                map.put(t.charAt(i),1);
            }
        }
        for (int i = 0; i < s.length(); i++) {
            if (search.containsKey(s.charAt(i))){
                search.put(s.charAt(i), search.get(s.charAt(i))+1);
            }else {
                if (map.containsKey(s.charAt(i))){
                    search.put(s.charAt(i),1);
                }
            }
        }
        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            Integer integer = search.get(entry.getKey());
            if (integer==null||integer<entry.getValue()){
                return "";
            }else {
                search.put(entry.getKey(),integer-entry.getValue());
            }
        }
        int l = 0;
        int r=s.length()-1;
        while (l<=r){
            if (!search.containsKey(s.charAt(r))){
                r--;
                continue;
            }
            if (!search.containsKey(s.charAt(l))){
                l++;
                continue;
            }
            if (search.get(s.charAt(r))>0){
                search.put(s.charAt(r), search.get(s.charAt(r))-1);
                r--;
                continue;
            }
            if (search.get(s.charAt(l))>0){
                search.put(s.charAt(l), search.get(s.charAt(l))-1);
                l++;
                continue;
            }
            break;
        }
        if (l>r){
            return "";
        }

//        int ll = 0;
//        int rr=s.length()-1;
//        while (ll<=rr){
//            if (!search.containsKey(s.charAt(ll))){
//                ll++;
//                continue;
//            }
//            if (!search.containsKey(s.charAt(rr))){
//                rr--;
//                continue;
//            }
//            if (search.get(s.charAt(ll))>0){
//              search.put(s.charAt(ll), search.get(s.charAt(ll))-1);
//                ll++;
//                continue;
//            }
//            if (search.get(s.charAt(rr))>0){
//              search.put(s.charAt(rr), search.get(s.charAt(rr))-1);
//                rr--;
//                continue;
//            }
//            break;
//        }
//        if (ll>rr){
//            return "";
//        }
       return s.substring(l,r+1);

    }

}
