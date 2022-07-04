package com.nishatan;


import javax.lang.model.element.VariableElement;
import java.util.Date;

public class QS29 {
    public static void main(String[] args) {
        int[] data = {1,2,1,3,1,4,1,5,1};
        System.out.println(getGtHalf(data));
    }

    public static int getGtHalf(int[] data) {
        int candidate=0;
        int sum=0;
        for (int i = 0; i < data.length; i++) {
            if (sum==0){
                candidate= data[i];
            }
            sum += (candidate==data[i])?1:-1;
        }
        if (sum==0){
            return 0;
        }
        int count =0;
        for (int i = 0; i < data.length; i++) {
            count += candidate==data[i]?1:0;
        }
       return count>data.length/2?candidate:0;
    }

}
