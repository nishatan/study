package com.nishatan.leecode.one;

public class Problem37 {
    public static void main(String[] args) {

    }
    public void solveSudoku(char[][] board) {
        isValidSudoku(board);
    }

    public boolean isValidSudoku(char[][] board) {
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                if (board[i][j]!='.'){
                    continue;
                }
                for (int k = 1; k <= 9; k++) {
                    if (isProperNum(board, i, j, (char) (k+'0'))&&isValidSudoku(board)){
                        return true;
                    }else {
                        board[i][j]='.';
                    }
                }
                return false;

            }
        }
        return true;

    }

    private boolean isProperNum(char[][] board, int i, int j, char k) {
        for (int r = 0; r < 9; r++) {
            if (board[i][r]==k){
                return false;
            }
        }
        for (int r = 0; r < 9; r++) {
            if (board[r][j]==k){
                return false;
            }
        }
        int r = i / 3 * 3;
        int c = j / 3 * 3;
        for (int i1 = r; i1 < r+3; i1++) {
            for (int i2 = c; i2 < c+3; i2++) {
                if (board[i1][i2]==k){
                    return false;
                }
            }
        }
        board[i][j]=k;
        return true;
    }

}
