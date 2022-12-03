package com.nishatan.leecode.one;

public class Problem11 {
    public static void main(String[] args) {
        int[] ints = {1, 8, 6, 2, 5, 4, 8, 3, 7};
        System.out.println(new Problem11().maxArea(ints));
    }

    public int maxArea(int[] height) {
        int l = 0;
        int r = height.length-1;
        int max = 0;
        while (l<r){
            max= Math.max(max, Math.min(height[l],height[r])*(r-l));
            if (height[l]<height[r]){
                l++;
            }else {
                r--;
            }
        }
        return max;
    }

}
