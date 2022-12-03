package com.nishatan.leecode.one;

public class Problem3 {
    public static void main(String[] args) {
        System.out.println(new Problem3().lengthOfLongestSubstring2("abba"));
    }

    public int lengthOfLongestSubstring(String s) {
        int len = s.length();
        if (len==0){
            return 0;
        }
        if (len==1){
            return 1;
        }
        int max = 1;
        int l = 0;
        int r = 1;
        while (r<len&&len-l+1>max){
            boolean tb = false;
            for (int i = r-1; i >= l; i--) {
                if (s.charAt(i)==s.charAt(r)){
                    tb = true;
                    l=i+1;
                    if (l==r){
                        r++;
                    }
                    break;
                }
            }
            if (!tb){
                if (r-l+1>max) {
                    max = r-l+1;
                }
                r++;
            }

        }
        return max;
    }

    public int lengthOfLongestSubstring2(String s) {
        // 记录字符上一次出现的位置
        int[] last = new int[128];
         for(int i = 0; i < 128; i++) {
            last[i] = -1;
        }
        int n = s.length();

        int res = 0;
         int start = 0; // 窗口开始位置
        for(int i = 0; i < n; i++) {
            int index = s.charAt(i);
            start = Math.max(start, last[index] + 1);
            res   = Math.max(res, i - start + 1);
            last[index] = i;
        }

        return res;
    }
}
