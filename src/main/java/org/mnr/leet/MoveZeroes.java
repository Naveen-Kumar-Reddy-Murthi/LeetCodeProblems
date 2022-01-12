package org.mnr.leet;

import java.util.Arrays;

public class MoveZeroes {
    public static void main(String[] args) {
        //https://leetcode.com/problems/move-zeroes/
        int[] nums = new int[]{0,1,0,3,12};
        moveZeroes(nums);
        System.out.println(Arrays.toString(nums));
    }

    public static void moveZeroes(int[] nums) {
        for (int i = 0,j=0; i < nums.length&&j < nums.length; j++) {
            if(nums[j]!=0){
                int temp = nums[i];
                nums[i++]=nums[j];
                nums[j]=temp;
            }
        }

    }
}

