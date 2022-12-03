package com.nishatan.leecode.one;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Problem79 {
    public static void main(String[] args) {
        char[] chars1 = { 'A','B','C','E'};
        char[] chars2 = { 'S','F','C','S'};
        char[] chars3 = { 'A','D','E','E'};
        char[][] board = new char[3][4];
        board[0]=chars1;
        board[1]=chars2;
        board[2]=chars3;
        System.out.println(new Problem79().exist(board, "SEE"));
    }

    public boolean exist(char[][] board, String word) {
        boolean[][] bls = new boolean[board.length][board[0].length];
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                boolean recursive = recursive(board, bls, i, j, word, 0);
                if (recursive){
                    return true;
                }
            }
        }
      return  false ;
    }

    private boolean recursive(char[][] board, boolean[][] bls, int x, int y, String word, int idx) {
        boolean res = false;
        if (idx == word.length()) {
            return true;
        }
        if (x >= 0 && x < board.length && y >= 0 && y < board[0].length){
            if (bls[x][y]) {
                return false;
            }
            if (board[x][y] == word.charAt(idx)) {
                bls[x][y] = true;
                res = recursive(board, bls, x + 1, y, word, idx + 1) ||
                        recursive(board, bls, x - 1, y, word, idx + 1) ||
                        recursive(board, bls, x, y + 1, word, idx + 1) ||
                        recursive(board, bls, x, y - 1, word, idx + 1);
                if (res == false) {
                    bls[x][y] = false;
                }
            }
        }
        return res;
    }


}
