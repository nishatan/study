package com.nishatan;

public class QS38 {
    public static void main(String[] args) {
        int[] data = {1,2,3,3,4,5,6,7,8};
        System.out.println(getNumCount(data, 8, 0, data.length - 1));
    }

    public static int getNumCount(int[] data,int k,int start,int end){
        if (data==null){
            return -1;
        }
        if (start==end&&data[start]!=k){
            return 0;
        }
        int count = 0;
        int mid = (start+end)/2;
        if(data[mid]==k){
            int temp = mid;
            while (temp>=start&&data[temp--]==k){
                count++;
            }
            temp=mid+1;
            while (temp<=end&&data[temp++]==k){
                count++;
            }
            return count;
        }
        if (k<data[mid]){
           return getNumCount(data,k,start,mid-1);
        } else {
           return getNumCount(data,k,mid+1,end);
        }
    }
}
