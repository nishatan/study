package com.nishatan.arrow;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class QS41_2 {
    public static void main(String[] args) {
        int[] a = {0,1,2,3,4,5,6,7,8,9};
        List<List<Integer>> sumEqS = FindNumbersWithSum(a,9);
        for (List<Integer> sumEq : sumEqS) {
            for (Integer integer : sumEq) {
                System.out.print(integer);
            }
            System.out.println();
        }

    }

    private static List<List<Integer>> FindNumbersWithSum(int[] data, int s) {
        int start=0;
        int end=data.length-1;
        List<List<Integer>> res = new ArrayList<>();
        while (start<end){
            if (data[start]+data[end]==s){
                res.add(Arrays.asList(data[start],data[end]));
                start++;
                end--;
            }else if (data[start]+data[end]<s){
                start++;
            }else {
                end--;
            }
        }
        return res;
    }


}
