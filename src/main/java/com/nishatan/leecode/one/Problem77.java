package com.nishatan.leecode.one;

import javax.naming.spi.ResolveResult;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Problem77 {
    public static void main(String[] args) {
        new Problem77().combine(4,2);
    }

    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> res = new ArrayList<>();
        LinkedList<Integer> temp = new LinkedList<>();
        recursive(res,temp,n, 1, k);
        return res;
    }

    private void recursive(List<List<Integer>> res,LinkedList temp, int n,int idx, int k) {
        if (temp.size()==k){
            res.add(new ArrayList<>(temp));
            return;
        }
        for (int i = idx; i <= n; i++) {
            temp.add(i);
            recursive(res, temp, n, i+1, k);
            temp.removeLast();
        }
    }

}
