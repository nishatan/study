package com.nishatan.arrow;

public class study {
    public static void main(String[] args) {

    }

    public static void mergeSort(int[] array,int left,int right,int[] tempArray) {
        int mid = (left + right) / 2;
        mergeSort(array, left,mid,tempArray);
        mergeSort(array, mid+1,right,tempArray);

    }

    public static void sort(int[] array,int left,int right,int[] tempArray) {

    }
}
