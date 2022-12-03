package com.nishatan.leecode.one;

public class Problem200 {
    public static void main(String[] args) {

    }

    public int numIslands(char[][] grid) {
        int res = 0;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if (grid[i][j]=='1'){
                    res++;
                    grid[i][j]='2';
                    bfs(grid, i, j);
                }
            }
        }
        return res;
    }

    private void bfs(char[][] grid, int i, int j) {
        if (i+1<grid.length&& grid[i+1][j]=='1'){
            grid[i+1][j]='2';
            bfs(grid, i+1, j);
        }
        if (j+1<grid[0].length&& grid[i][j+1]=='1'){
            grid[i][j+1]='2';
            bfs(grid, i, j+1);
        }
        if (i-1>=0&& grid[i-1][j]=='1'){
            grid[i-1][j]='2';
            bfs(grid, i-1, j);
        }
        if (j-1>=0 && grid[i][j-1]=='1'){
            grid[i][j-1]='2';
            bfs(grid, i, j-1);
        }
    }


}
