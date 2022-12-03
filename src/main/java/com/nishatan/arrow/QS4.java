package com.nishatan.arrow;

public class QS4 {
    public static void main(String[] args) {
        String ss = "We Are Happy";
        System.out.println(replace(ss, "%20"));
    }

    public static String replace (String ss,String placer) {
        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < ss.length(); i++) {
            char c = ss.charAt(i);
            if (c==' '){
                sb.append(placer);
            }else {
                sb.append(c);
            }
        }
        return sb.toString();

    }
}
