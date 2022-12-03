package com.nishatan.leecode.one;

import sun.java2d.opengl.WGLSurfaceData;

import java.util.*;

public class Problem118 {
    public static void main(String[] args) {

    }


    public List<List<Integer>> generate(int numRows) {
        LinkedList<List<Integer>> res = new LinkedList<>();
        res.add(Arrays.asList(1));
        if (numRows==1){
            return res;
        }
        res.add(Arrays.asList(1,1));
        if (numRows==2){
            return res;
        }
        for (int i = 3; i <= numRows; i++) {
            Integer[] temp = new Integer[i];
            temp[0]=1;
            temp[i-1]=1;
            for (int j = 1; j < i-1; j++) {
                temp[j]=res.getLast().get(j-1)+res.getLast().get(j);
            }
            res.add(Arrays.asList(temp));
        }
        return res;
    }

}
