package com.nishatan.leecode.one;

public class Problem8 {
    public static void main(String[] args) {
        System.out.println(new Problem8().myAtoi("4193 with words"));
    }

    public int myAtoi(String s) {
        StringBuffer stringBuffer = new StringBuffer();
        String strTrim = s.trim();//去字符前后空格
        if("".equals(strTrim)) return 0;//表示字符串为空或字符串全为空格的情况
        char first = strTrim.charAt(0);//取去掉字符串后的首字母
        if(first == '-' || first == '+' || (first >= '0' && first <= '9')){
            stringBuffer.append(first);//首字母为+ -,数字
        }else if(first < '0' || first > '9'){
            //字符串中的第一个非空格字符不是一个有效整数字符
            return 0;
        }
        for(int i = 1; i < strTrim.length(); i++){
            if(strTrim.charAt(i) < '0' || strTrim.charAt(i) > '9'){
                break;
            }
            stringBuffer.append(strTrim.charAt(i));
        }
        if(stringBuffer.toString().equals("+") || stringBuffer.toString().equals("-")){
            //如果该有效字符只为+，-
            return 0;
        }
        int number;
        try{
            number = Integer.parseInt(stringBuffer.toString());
            return number;
        }catch(Exception e){
            return strTrim.charAt(0) == '-' ? Integer.MIN_VALUE : Integer.MAX_VALUE;
        }
    }

}
