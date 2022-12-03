package com.nishatan.leecode.one;


import java.util.HashSet;
import java.util.LinkedList;
import java.util.Objects;
import java.util.Set;

public class Problem130 {
    public static void main(String[] args) {
        char[] c0 = {'O', 'X', 'O'};
        char[] c1 = {'X', 'O', 'X'};
        char[] c2 = {'O', 'X', 'O'};
        char[][] chars = {c0, c1, c2};
        new Problem130().solve(chars);

    }

    public void solve(char[][] board) {
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                if (board[i][j]!='O') {
                    continue;
                }else {
                    Node e = new Node(i, j);
                    queue.add(e);
                    set.add(e);
                    bfs(board);
                    if (isSide){
                        set.forEach(node -> board[node.x][node.y]='-');
                    }else {
                        set.forEach(node -> board[node.x][node.y]='X');
                    }
                    isSide = false;
                    set.clear();
                }
            }
        }

        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                if (board[i][j]=='-') {
                    board[i][j]='O';
                }
            }
        }


    }

    LinkedList<Node> queue = new LinkedList<>();
    Set<Node> set =  new HashSet<>();
    boolean isSide = false;

    private void bfs(char[][] board){
        int m = board.length;
        int n = board[0].length;
        while (!queue.isEmpty()){
            Node poll = queue.poll();
            if (poll.x==0||poll.x==m-1||poll.y==0||poll.y==n-1) isSide = true;
            if (poll.x<m-1 && 'O'==board[poll.x+1][poll.y]){
                Node e = new Node(poll.x + 1, poll.y);
                if (!set.contains(e)){
                    queue.add(e);
                    set.add(e);
                }
            }
            if (poll.x>0 && 'O'==board[poll.x-1][poll.y]){
                Node e = new Node(poll.x - 1, poll.y);
                if (!set.contains(e)){
                    queue.add(e);
                    set.add(e);
                }
            }
            if (poll.y<n-1 && 'O'==board[poll.x][poll.y+1]){
                Node e = new Node(poll.x, poll.y+1);
                if (!set.contains(e)){
                    queue.add(e);
                    set.add(e);
                }
            }
            if (poll.y>0 && 'O'==board[poll.x][poll.y-1]){
                Node e = new Node(poll.x, poll.y-1);
                if (!set.contains(e)){
                    queue.add(e);
                    set.add(e);
                }
            }
        }

    }

    private class Node{
        int x;
        int y;

        public Node(int x, int y) {
            this.x = x;
            this.y = y;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Node node = (Node) o;
            return x == node.x && y == node.y;
        }

        @Override
        public int hashCode() {
            return Objects.hash(x, y);
        }
    }

    

}
