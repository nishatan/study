package com.nishatan.arrow;

public class QS9_3 {
    public static void main(String[] args) {
        System.out.println(fibN2(8));
        System.out.println(Fibonaccik(8));
    }

    public static int fibN2(int n) {
        if (n<=2){
            return n;
        }
        int pre1 = 2;
        int pre2 = 1;
        int cur = 0;
        for (int i = 3; i <= n; i++) {
            cur = pre1+pre2;
            pre2=pre1;
            pre1=cur;
        }
        return cur;
    }

    public static int Fibonaccik(int n) {
        int number = 1;
        int sum = 1;
        if (n <= 0)
            return 0;
        if (n == 1 ) {
            return 1;
        }
        while (n-- >= 2) {
            sum += number;
            number = sum - number;
        }return sum;
    }
}
