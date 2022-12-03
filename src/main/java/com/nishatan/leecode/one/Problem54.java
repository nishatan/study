package com.nishatan.leecode.one;

import java.util.ArrayList;
import java.util.List;

public class Problem54 {
    public static void main(String[] args) {
        int[][] ints = new int[1][3];
        ints[0]=new int[]{6,9,7};
        new Problem54().spiralOrder(ints).forEach(System.out::print);

    }
    public List<Integer> spiralOrder(int[][] matrix) {
        int x1 = 0;
        int x2 = matrix.length-1;
        int y1 = 0;
        int y2 = matrix[0].length-1;
        List<Integer> res = new ArrayList<>();
        while (x1<=x2&&y1<=y2){
            if (x1==x2){
                for (int i = y1; i <= y2; i++) {
                    res.add(matrix[x1][i]);
                }
                break;
            }
            if (y1==y2){
                for (int i = x1; i <= x2; i++) {
                    res.add(matrix[i][y1]);
                }
                break;
            }
            for (int i = y1; i < y2; i++) {
                res.add(matrix[x1][i]);
            }
            for (int i = x1; i < x2; i++) {
                res.add(matrix[i][y2]);
            }
            if (x2>x1){
                for (int i = y2; i > y1; i--) {
                    res.add(matrix[x2][i]);
                }
            }
            if (y2>y1){
                for (int i = x2; i > x1; i--) {
                    res.add(matrix[i][y1]);
                }
            }
            x1++;
            y1++;
            x2--;
            y2--;
        }
        return res;
    }

}
