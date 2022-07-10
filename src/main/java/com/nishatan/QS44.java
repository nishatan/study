package com.nishatan;

import java.util.Arrays;

public class QS44 {
    public static void main(String[] args) {
        int[] a = {1,2,3,0,6};
        System.out.println(isMonotonous(a));
    }

    private static boolean isMonotonous(int[] data) {
        Arrays.sort(data);
        int zCount=0;
        for (int datum : data) {
            if (datum==0){
                zCount++;
            }
        }
        for (int i = zCount; i < data.length-1; i++) {
            zCount=zCount- data[i+1]+data[i]+1;
        }
        if (zCount>=0){
            return true;
        }else {
            return false;
        }
    }


}
