package com.nishatan.leecode.one;

public class Problem66 {
    public static void main(String[] args) {


    }
    public int[] plusOne(int[] digits) {
        int plus=1;
        int temp=0;
        for (int i = digits.length; i > 0; i--) {
            temp=digits[i]+plus;
            digits[i]=temp%10;
            if (temp/10>0){
                plus=1;
            }else {
                plus=0;
            }
        }
        if (plus>0){
            int[] ints = new int[digits.length + 1];
            ints[0]=1;
            for (int i = 0; i < digits.length; i++) {
                ints[i+1]=digits[i];
            }
            return ints;
        }else {
            return digits;
        }

    }
}
