package com.nishatan;

import jdk.nashorn.internal.ir.WhileNode;

public class QS47 {
    public static void main(String[] args) {
        System.out.println(plusNum(4,2));
    }

    private static int plusNum(int num1, int num2) {
        int temp;
        while (num2!=0){
            temp=num1^num2;
            num2=(num1&num2)<<1;
            num1=temp;
        }
        return num1;
    }


}
