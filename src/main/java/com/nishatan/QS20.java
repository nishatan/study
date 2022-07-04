package com.nishatan;


public class QS20 {
    public static void main(String[] args) {
        int[][] arr = {{1,2,3},{4,5,6}};
        spiralPrint(arr);
    }

    public static void spiralPrint(int[][] matrix) {
        int r1=0;
        int r2=matrix.length-1;
        int c1=0;
        int c2=matrix[0].length-1;
        while (c1<=c2&&r1<=r2){
            for (int i = c1; i <= c2; i++) {
                System.out.println(matrix[r1][i]);
            }
            for (int i = r1+1; i <= r2; i++) {
                System.out.println(matrix[i][c2]);
            }
            if (c2>c1){
                for (int i = c2-1; i >= c1; i--) {
                    System.out.println(matrix[r2][i]);
                }
            }
            if (r2>r1){
                for (int i = r2-1; i > r1; i--) {
                    System.out.println(matrix[i][c1]);
                }
            }
            r1++;
            r2--;
            c1++;
            c2--;
        }

    }

}
