package com.nishatan.leecode.two;

public class Problem223 {
    public static void main(String[] args) {

    }

    public int computeArea(int ax1, int ay1, int ax2, int ay2, int bx1, int by1, int bx2, int by2) {
        int s = (ax2-ax1)*(ay2-ay1)+(bx2-bx1)*(by2-by1);
        if (ax1 >= bx2 || bx1 >= ax2 || ay1 >= by2 || by1 >= ay2) {
            return  s;
        }

        return s - (Math.min(ax2, bx2)-Math.max(ax1, bx1))*(Math.min(ay2, by2)-Math.max(ay1, by1));
    }



}
