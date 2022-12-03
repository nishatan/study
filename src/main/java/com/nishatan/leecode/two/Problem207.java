package com.nishatan.leecode.two;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Problem207 {
    public static void main(String[] args) {

    }

    public boolean canFinish(int numCourses, int[][] prerequisites) {
        HashMap<Integer, List<Integer>> map = new HashMap<>();
        for (int i = 0; i < prerequisites.length; i++) {
            if (map.containsKey(prerequisites[i][0])){
                map.get(prerequisites[i][0]).add(prerequisites[i][1]);
            }else {
                List<Integer> integers = new ArrayList<>();
                integers.add(prerequisites[i][1]);
                map.put(prerequisites[i][0], integers);
            }
        }
        return false;

    }


}
