package com.nishatan.leecode.one;

public class Problem73 {
    public static void main(String[] args) {

    }

    public void setZeroes(int[][] matrix) {
        boolean isn0 = false;
        boolean ism0 = false;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (matrix[i][j]==0){
                    if (i==0){
                        isn0=true;
                    }
                    if (j==0){
                        ism0=true;
                    }
                    matrix[i][0]=0;
                    matrix[0][j]=0;
                }
            }
        }

        for (int i = 1; i < matrix.length; i++) {
            if (matrix[i][0]==0){
                for (int j = 0; j < matrix[0].length; j++) {
                    matrix[i][j]=0;
                }
            }
        }
        for (int j = 1; j < matrix[0].length; j++) {
            if (matrix[0][j]==0){
                for (int i = 0; i < matrix.length; i++) {
                    matrix[i][j]=0;
                }
            }
        }
        if (isn0){
            for (int i = 0; i < matrix[0].length; i++) {
                matrix[0][i]=0;
            }
        }
        if (ism0){
            for (int i = 0; i < matrix.length; i++) {
                matrix[i][0]=0;
            }
        }


    }

}
