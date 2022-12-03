package com.nishatan.leecode.one;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Problem119 {
    public static void main(String[] args) {

    }

    public List<Integer> getRow(int rowIndex) {
        List<Integer> res = new ArrayList<>();
        res.add(1);
        if (rowIndex==0){
            return res;
        }
        res.add(1);
        if (rowIndex==1){
            return res;
        }
        for (int i = 3; i <= rowIndex+1; i++) {
            Integer[] temp = new Integer[i];
            temp[0]=1;
            temp[i-1]=1;
            for (int j = 1; j < i-1; j++) {
                temp[j]=res.get(j-1)+res.get(j);
            }
            res.clear();
            res.addAll(Arrays.asList(temp));
        }
        return res;
    }

    

}
