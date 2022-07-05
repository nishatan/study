package com.nishatan;


public class QS32 {
    public static void main(String[] args) {
        System.out.println(NumberOf1Between1AndN_Solution(99));
    }

    public static int NumberOf1Between1AndN_Solution(int n){
        int count=0;
        for(int i = 1; i <= n; i *= 10){
            int a = n / i; // 高位
            int b = n % i; // 低位
            count += (a+8) / 10 * i;
            if(a % 10 == 1){
                count += b + 1;
            }
        }
        return count; }
}
