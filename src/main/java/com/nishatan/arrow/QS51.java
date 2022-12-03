package com.nishatan.arrow;

public class QS51 {
    public static void main(String[] args) {
        int[] a ={1,2,3,4,5,6,7,8,2,9};
        System.out.println(findDuplicate(a));
    }

    public static int findDuplicate(int []nums){
        int fast=0,low=0;
        //寻找链表中的环
        do{
            low=nums[low];
            fast=nums[nums[fast]];
        }while (fast!=low);

        //寻找链表中的入口节点
        int ptr1=0,ptr2=low;
        while (ptr1!=ptr2){
            ptr1=nums[ptr1];
            ptr2=nums[ptr2];
        }
        return ptr1;
    }





}
