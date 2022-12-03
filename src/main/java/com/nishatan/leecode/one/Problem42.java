package com.nishatan.leecode.one;

public class Problem42 {
    public static void main(String[] args) {
        System.out.println(new Problem42().trap(new int[]{4,2,0,3,2,5}));
    }

    public int trap(int[] height) {
        int l = 0;
        int r = height.length-1;
        while (l<r&&height[l]<=height[l+1]){
            l++;
        }
        while (l<r&&height[r]<=height[r-1]){
            r--;
        }
        int lr = l+1;
        int rl = r-1;
        int sum = 0;
        while (l<r){
            if (r-l<=1){
                break;
            }
            if (height[l]<height[r]){
                while (lr<r&&height[lr]<height[l]){
                    sum+=height[l]-height[lr];
                    lr++;
                }
                l=lr++;
            }else {
                while (l<rl&&height[rl]<height[r]){
                    sum+=height[r]-height[rl];
                    rl--;
                }
                r=rl--;
            }
        }
        return sum;
    }

}
