package com.nishatan.arrow;


import java.util.Arrays;

public class QS30 {
    public static void main(String[] args) {
        int[] data = {7,8,9,10,11,1,2,3,4,5,6};
        int[] smallk = Arrays.copyOfRange(data, 0, 6);
        buildHeap(smallk);
        for (int i = 6; i < data.length; i++) {
            if (data[i]<smallk[0]){
                smallk[0]=data[i];
                maxHeap(smallk,0);
            }
        }
        System.out.println(Arrays.toString(smallk));
    }

    public static void buildHeap(int[] data) {
        for (int i = data.length/2-1; i >= 0 ; i--) {
            maxHeap(data,i);
        }

    }

    public static void maxHeap(int[] data, int a) {
        int left= 2*a+1;
        int right= 2*a+2;
        int larger = 0;
        if (left<data.length&&data[a]<data[left]){
            larger=left;
        }else {
            larger=a;
        }
        if (right<data.length&&data[larger]<data[right]){
            larger=right;
        }
        if (larger!=a){
            int temp = data[a];
            data[a]=data[larger];
            data[larger]=temp;
            maxHeap(data,larger);
        }
    }

}
