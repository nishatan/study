package com.nishatan.leecode.one;

import java.util.Arrays;
import java.util.Comparator;
import java.util.function.BinaryOperator;

public class Problem179 {
    public static void main(String[] args) {

    }

    public String largestNumber(int[] nums) {
        StringBuilder sb = new StringBuilder();
        Arrays.stream(nums).boxed().map(String::valueOf).sorted(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                String s1 = o1 + o2;
                String s2 = o2 + o1;
                return s2.compareTo(s1);
            }
        }).forEach(s -> sb.append(s));
        int idx = 0;
        while (idx < sb.length()-1&&sb.charAt(idx)=='0'){
            idx++;
        }

        return sb.substring(idx);
    }

}
