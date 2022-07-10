package com.nishatan;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class QS41_1 {
    public static void main(String[] args) {
        List<List<Integer>> sumEqS = findSumEqS(9);
        for (List<Integer> sumEq : sumEqS) {
            for (Integer integer : sumEq) {
                System.out.print(integer);
            }
            System.out.println();
        }

    }

    private static List<List<Integer>> findSumEqS(int s) {
        int a=0;
        int b=0;
        List<List<Integer>> res = new ArrayList<>();
        for (int i = 1; i <= s; i++) {
            List<Integer> stack = new ArrayList<>();
            int left=s;
            for (int j = i; j <= s; j++) {
                left=left-j;
                if(left>0){
                    stack.add(j);
                }else if (left<0){
                    stack.clear();
                    break;
                }else{
                    stack.add(j);
                    if (!stack.isEmpty()){
                        res.add(stack);
                    }
                    break;
                }
            }
        }

        return res;
    }


}
