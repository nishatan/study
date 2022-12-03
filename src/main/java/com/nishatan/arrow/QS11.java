package com.nishatan.arrow;

public class QS11 {
    public static void main(String[] args) {
        System.out.println(NumberOf1(2.2,3));
    }

    public static double NumberOf1(double base,int exp) {
        if (equal(base,0)){
            return 0;
        }
        if (exp==0){
            return 1;
        }
        double mul=1;
        if (exp>0){
            for (int i = 0; i < exp; i++) {
                mul*=base;
            }
        }else {
            for (int i = 0; i < exp; i++) {
                mul*=(1/base);
            }
        }
        return mul;
    }
    public static boolean equal(double a,double b) {
        if (a-b<0.000001&&a-b>-0.000001){
            return true;
        }
        return false;
    }
}
