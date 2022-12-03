package com.nishatan.leecode.one;

import java.math.BigDecimal;

public class Problem43 {
    public static void main(String[] args) {
        System.out.println(new Problem43().multiply("123", "456"));
    }

    public String multiply(String num1, String num2) {
        if (num1.length()==1&&num1.charAt(0)=='0'){
            return "0";
        }
        if (num2.length()==1&&num2.charAt(0)=='0'){
            return "0";
        }
        String res = "0";
        for (int i = num1.length()-1; i >= 0; i--) {
            StringBuilder sb = new StringBuilder();
            for (int i1 = 0; i1 < num1.length() - 1 - i; i1++) {
                sb.append('0');
            }
            int last = 0;
            for (int j = num2.length()-1; j >= 0; j--) {
                int temp = (num2.charAt(j) - '0') * (num1.charAt(i) - '0');
                int a = temp/10;
                int b = temp%10;
                int x = last + b;
                sb.append((char)(x%10+'0'));
                last = x>9?a+1:a;
            }
            if (last>0){
                sb.append((char)(last+'0'));
            }
           res = addStrings(sb.reverse().toString(), res);
        }
        return res;
    }

    public String addStrings(String num1, String num2) {
        StringBuilder builder = new StringBuilder();
        int carry = 0;
        for (int i = num1.length() - 1, j = num2.length() - 1;
             i >= 0 || j >= 0 || carry != 0;
             i--, j--) {
            int x = i < 0 ? 0 : num1.charAt(i) - '0';
            int y = j < 0 ? 0 : num2.charAt(j) - '0';
            int sum = (x + y + carry) % 10;
            builder.append(sum);
            carry = (x + y + carry) / 10;
        }
        return builder.reverse().toString();
    }

}
