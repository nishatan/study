package com.nishatan.leecode.one;

public class Problem36 {
    public static void main(String[] args) {
        char[] a1 =new char[]{'5','3','.','.','7','.','.','.','.'};
        char[] a2 =new char[]{'6','.','.','1','9','5','.','.','.'};
        char[] a3 =new char[]{'.','9','8','.','.','.','.','6','.'};
        char[] a4 =new char[]{'8','.','.','.','6','.','.','.','3'};
        char[] a5 =new char[]{'4','.','.','8','.','3','.','.','1'};
        char[] a6 =new char[]{'7','.','.','.','2','.','.','.','6'};
        char[] a7 =new char[]{'.','6','.','.','.','.','2','8','.'};
        char[] a8 =new char[]{'.','.','.','4','1','9','.','.','5'};
        char[] a9 =new char[]{'.','.','.','.','8','.','.','7','9'};
        char[][] sodu = new char[9][9];
        sodu[0]= a1;
        sodu[1]= a2;
        sodu[2]= a3;
        sodu[3]= a4;
        sodu[4]= a5;
        sodu[5]= a6;
        sodu[6]= a7;
        sodu[7]= a8;
        sodu[8]= a9;
        System.out.println(new Problem36().isValidSudoku(sodu));


    }

    public boolean isValidSudoku(char[][] board) {
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                if (board[i][j]=='.'){
                    continue;
                }
                char k = board[i][j];
                for (int r = 0; r < 9; r++) {
                    if (r!=j && board[i][r]==k){
                        return false;
                    }
                }
                for (int r = 0; r < 9; r++) {
                    if (r!=i&&board[r][j]==k){
                        return false;
                    }
                }
                int r = i / 3 * 3;
                int c = j / 3 * 3;
                for (int i1 = r; i1 < r+3; i1++) {
                    for (int i2 = c; i2 < c+3; i2++) {
                        if (i1!=i&&i2!=j&&board[i1][i2]==k){
                            return false;
                        }
                    }
                }
            }
        }
        return true;
    }

    private boolean isProperNum(char[][] board, int i, int j, char k) {
        for (int r = 0; r < 9; r++) {
            if (r!=j && board[i][r]==k){
                return false;
            }
        }
        for (int r = 0; r < 9; r++) {
            if (r!=i&&board[r][j]==k){
                return false;
            }
        }
        int r = i / 3 * 3;
        int c = j / 3 * 3;
        for (int i1 = r; i1 < r+3; i1++) {
            for (int i2 = c; i2 < c+3; i2++) {
                if (i1!=i&&i2!=j&&board[i1][i2]==k){
                    return false;
                }
            }
        }
        return true;
    }


}
