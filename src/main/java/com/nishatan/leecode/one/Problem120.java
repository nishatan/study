package com.nishatan.leecode.one;

import java.util.List;

public class Problem120 {
    public static void main(String[] args) {

    }

    public int minimumTotal(List<List<Integer>> triangle) {
        for (int i = triangle.size()-2; i >= 0; i--) {
            for (int j = i; j >= 0; j--) {
                triangle.get(i).set(j,triangle.get(i).get(j)+Math.min(triangle.get(i+1).get(j),triangle.get(i+1).get(j+1)));
            }
        }
        return triangle.get(0).get(0);
    }

}
