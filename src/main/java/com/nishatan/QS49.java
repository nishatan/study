package com.nishatan;

public class QS49 {
    public static void main(String[] args) {

        System.out.println(tranStringToInt("-0234"));
    }

    private static int tranStringToInt(String data) {
        char[] chars = data.toCharArray();
        int flag = 1;
        int length = chars.length;
        int res=0;
        if (chars[0]=='-'){
            flag=-1;
            if (chars[1]==48){
                return -1;
            }

            for (int i = 1; i < length; i++) {
                if (chars[i]>57||chars[i]<48){
                    return -1;
                }
              res =res + (chars[i]-48)*(int)Math.pow(10,length-1-i);
            }
        }else {
            if (chars[0]==48){
                return -1;
            }
            for (int i = 0; i < length; i++) {
                if (chars[i]>57||chars[i]<48){
                    return -1;
                }
                res =res + (chars[i]-48)*(int)Math.pow(10,length-1-i);
            }
        }
        return res*flag;
    }


}
