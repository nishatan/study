package com.nishatan.leecode.one;

public class Problem48 {
    public static void main(String[] args) {

    }

    public void rotate(int[][] matrix) {
        int midr = (matrix.length-1) / 2;
        int temp;
        for (int i = 0; i <= midr; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                temp = matrix[i][j];
                matrix[i][j]=matrix[matrix.length-1-i][j];
                matrix[matrix.length-1-i][j] = temp;
            }
        }
        for (int i = 0; i < matrix.length; i++) {
            for (int j = i+1; j < matrix.length; j++) {
                temp = matrix[i][j];
                matrix[i][j]=matrix[j][i];
                matrix[j][i] = temp;
            }
        }
    }

}
