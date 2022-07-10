package com.nishatan;

public class QS40 {
    public static void main(String[] args) {
        int[] a = {1,2,3,4,5,1,2,5};
        System.out.println(findOneceNum(a));

    }

    private static String findOneceNum(int[] a) {
        int temp=a[0];
        for (int i = 1; i < a.length; i++) {
            temp=temp^a[i];
        }
        int idx=0;
        while ((temp&1)==0){
            temp=temp>>1;
            idx++;
        }
        int ra=0;
        int rb=0;
        for (int i : a) {
            if ((i>>idx&1)==1){
                ra=ra^i;
            }else {
                rb=rb^i;
            }
        }
        return ra+","+rb;
    }


}
