package com.nishatan;

public class QS10 {
    public static void main(String[] args) {
        System.out.println(NumberOf1(-15));
    }

    public static int NumberOf1(int n) {
        int count = 0;
        while (n!=0){
            n=n&(n-1);
            count++;
        }
        return count;
    }
}
