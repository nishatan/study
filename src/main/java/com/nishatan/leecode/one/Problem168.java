package com.nishatan.leecode.one;

public class Problem168 {
    public static void main(String[] args) {
        System.out.println(new Problem168().convertToTitle(52));
    }
    public String convertToTitle(int columnNumber) {
        StringBuilder sb = new StringBuilder();
        while (columnNumber!=0){
            columnNumber--;
            sb.append((char) ('A' + columnNumber % 26));
             columnNumber /= 26;
        }
        return sb.reverse().toString();

    }


}
