package com.nishatan.leecode.one;

public class Problem9 {
    public static void main(String[] args) {
        System.out.println(new Problem9().isPalindrome(121));
    }

    public boolean isPalindrome(int x) {
        if (x<0){
            return false;
        }
        if (x==0){
            return true;
        }
        int num = x;
        long res=0;
        while (x!=0){
            res= res*10 + x%10;
            x/=10;
        }
        if (num==res){
            return true;
        }else {
            return false;
        }
    }

}
