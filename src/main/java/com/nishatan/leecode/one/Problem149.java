package com.nishatan.leecode.one;

public class Problem149 {
    public static void main(String[] args) {

    }
    public int maxPoints(int[][] points) {
        if(points.length<3){return points.length;}
        int ans=2;
        for(int i=0;i<points.length;i++){
            for(int j=i+1;j<points.length;j++){
                int count=2;
                for (int k = j + 1; k < points.length; k++) {
                    if ((points[j][0] - points[i][0]) * (points[k][1] - points[j][1]) == (points[j][1] - points[i][1]) * (points[k][0] - points[j][0])) {
                        count++;
                    }
                }
                ans=Math.max(ans,count);
            }
        }
        return ans;
    }
}
