package com.nishatan.arrow;

public class QS3 {
    public static void main(String[] args) {
        int[][] arr = {{1,2,3},{4,5,6},{7,8,9}};
        System.out.println(findTarget(arr, 20));
    }

    public static boolean findTarget (int[][] array,int target) {
        if (array.length==0){
            return false;
        }
        int l = 0;
        int length = array[0].length;
        int r = array.length * length - 1;
        while (l <= r) {
            int mid = (l + r) / 2;
            int midVal = array[mid / length][mid % length];
            if (midVal==target){
                return true;
            }
            if (midVal>target){
                r=mid-1;
            }else {
                l=mid+1;
            }
        }
        return false;
    }
}
