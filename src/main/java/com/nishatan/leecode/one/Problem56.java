package com.nishatan.leecode.one;

import java.util.Arrays;

public class Problem56 {
    public static void main(String[] args) {

    }

    public int[][] merge(int[][] intervals) {
        int[] from = new int[intervals.length];
        int[] to = new int[intervals.length];
        for (int i = 0; i < intervals.length; i++) {
            from[i]=intervals[i][0];
            to[i]=intervals[i][1];
        }
        Arrays.sort(from);
        Arrays.sort(to);
        int[] res = new int[intervals.length*2];
        int length = 0;
        int f = from[0];
        for (int i = 1; i < from.length; i++) {
            if (from[i]<=to[i-1]){
                continue;
            }
            res[length*2]=f;
            res[length*2+1]=to[i-1];
            f=from[i];
            length++;
        }
        res[length*2]=f;
        res[length*2+1]=to[intervals.length-1];
        int[][] ints = new int[length + 1][2];
        for (int i = 0; i <= length; i++) {
            ints[i]=new int[]{res[i*2],res[i*2+1]};
        }
        return ints;
    }

}
