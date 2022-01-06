package org.mnr.leet;

public class MaxSubArray {
    //https://leetcode.com/problems/maximum-subarray/
    public static void main(String[] args) {
        System.out.println(maxSubArray(new int[]{-2,1,-3,4,-1,2,1,-5,4}));
       // System.out.println(maxSubArray(new int[]{1}));
        //System.out.println(maxSubArray(new int[]{5,4,-1,7,8}));
    }

    public static int maxSubArray(int[] nums) {
        int maxSub = nums[0];
        int curSum = 0;
        for(int n : nums){
            if(curSum<0){
                curSum =0;
            }
            curSum +=n;
            maxSub = Math.max(maxSub, curSum);
        }
    return maxSub;
    }
}
