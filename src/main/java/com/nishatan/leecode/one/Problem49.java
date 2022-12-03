package com.nishatan.leecode.one;

import java.util.*;

public class Problem49 {
    public static void main(String[] args) {
        new Problem49().groupAnagrams(new String[]{"huh", "tit"}).forEach(System.out::println);

    }

    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap<>();
        for (int i = 0; i < strs.length; i++) {
            String key = null;
            for (int j = 0; j < strs[i].length(); j++) {
                char[] temps = strs[i].toCharArray();
                Arrays.sort(temps);
              key =  new String(temps);
            }
            if (map.containsKey(key)) {
                map.get(key).add(strs[i]);
            }else {
                List<String> re = new ArrayList<>();
                re.add(strs[i]);
                map.put(key,re);
            }
        }
        List<List<String>> res = new ArrayList<>();
        res.addAll(map.values());
        return res;
    }

}
