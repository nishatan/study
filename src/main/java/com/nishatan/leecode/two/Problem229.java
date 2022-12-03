package com.nishatan.leecode.two;

import java.util.ArrayList;
import java.util.List;

public class Problem229 {
    public static void main(String[] args) {

    }

    public List<Integer> majorityElement(int[] nums) {
        int a =Integer.MIN_VALUE;
        int b =Integer.MIN_VALUE;
        int counta = 0;
        int countb = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i]==a){
                counta++;
            }else if (nums[i]==b){
                countb++;
            }else {
                if (counta==0){
                    a =nums[i];
                    counta++;
                }else if (countb==0){
                    b=nums[i];
                    countb++;
                } else  {
                    counta--;
                    countb--;
                }
            }
        }
        counta = 0;
        countb = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i]==a){
                counta++;
            }else if (nums[i]==b){
                countb++;
            }
        }
        int k = nums.length / 3;
        List<Integer> integers = new ArrayList<>();
        if (counta> k){
            integers.add(a);
        }
        if ( countb>b){
            integers.add(b);
        }
        return integers;
    }


}
