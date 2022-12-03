package com.nishatan.leecode.one;

import java.util.*;

public class Problem30 {
    public static void main(String[] args) {
        new Problem30().findSubstring("wordgoodgoodgoodbestwordword", new String[]{"word","good","best","word"}).forEach(System.out::println);
    }

    public List<Integer> findSubstring(String s, String[] words) {
        List<Integer> res = new ArrayList<>();
        boolean[] bls = new boolean[words.length];
        Arrays.fill(bls,true);
        Map<String,List<Integer>> map = new HashMap<>();
        for (int i = 0; i < words.length; i++) {
            if (map.containsKey(words[i])){
                map.get(words[i]).add(i);
            }else {
                List<Integer> integers = new ArrayList<>();
                integers.add(i);
                map.put(words[i], integers);
            }
        }
        int wLen = words[0].length();
        for (int i = 0; i < s.length()- words.length* wLen +1; i++) {
            for (int j = 0; j < words.length; j++) {
                int beginIndex = i + j * wLen;
                String key = s.substring(beginIndex, beginIndex + wLen);
                boolean ck = map.containsKey(key);
                if (ck&&!map.get(key).isEmpty()){
                    List<Integer> integers = map.get(key);
                    for (Integer integer : integers) {
                        if (bls[integer]){
                            bls[integer]=false;
                            break;
                        }
                    }
                }else {
                    break;
                }
            }
            boolean done = true;
            for (boolean bl : bls) {
                if (bl){
                    done=false;
                    break;
                }
            }
            if (done){
                res.add(i);
            }
            Arrays.fill(bls, true);
        }
        return res;
    }

}
