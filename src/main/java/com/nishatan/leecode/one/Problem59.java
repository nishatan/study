package com.nishatan.leecode.one;

import java.util.ArrayList;
import java.util.List;

public class Problem59 {
    public static void main(String[] args) {

    }

    public int[][] generateMatrix(int n) {
        int[][] matrix = new int[n][n];
        int x1 = 0;
        int x2 = n-1;
        int y1 = 0;
        int y2 = n-1;
        int k = 1;
        while (x1<=x2&&y1<=y2){
            if (x1==x2){
                for (int i = y1; i <= y2; i++) {
                    matrix[x1][i]=k++;
                }
                break;
            }
            if (y1==y2){
                for (int i = x1; i <= x2; i++) {
                    matrix[i][y1]=k++;
                }
                break;
            }
            for (int i = y1; i < y2; i++) {
                matrix[x1][i]=k++;
            }
            for (int i = x1; i < x2; i++) {
                matrix[i][y2]=k++;
            }
            if (x2>x1){
                for (int i = y2; i > y1; i--) {
                    matrix[x2][i]=k++;
                }
            }
            if (y2>y1){
                for (int i = x2; i > x1; i--) {
                    matrix[i][y1]=k++;
                }
            }
            x1++;
            y1++;
            x2--;
            y2--;
        }
        return matrix;
    }

}
