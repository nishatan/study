package com.nishatan;

import java.util.Arrays;
import java.util.ResourceBundle;

public class QS45 {
    public static void main(String[] args) {
        int[] a = {1,2,3,0,6};
        System.out.println(lastRemain(3,1));
    }

    private static int lastRemain(int n, int m) {
        if (n<1||m<1){
            return -1;
        }
        int res=0;
        for (int i = 2; i <= n; i++) {
            res=(res+m)%n;
        }
        return res;
    }


}
