package org.mnr.leet;

public class MinimumSizeSubarraySum {
    public static void main(String[] args) {
        System.out.println(minSubArrayLen(7, new int[] {2,3,1,2,4,3}));
        System.out.println(minSubArrayLen(4, new int[] {1,4,4}));
        System.out.println(minSubArrayLen(11, new int[] {1,1,1,1,1,1,1,1}));
    }

    public static int minSubArrayLen(int target, int[] nums) {
        int windowStart=0, windowSum=0, minLength=Integer.MAX_VALUE;

        for(int i=0; i<nums.length;i++){
            windowSum += nums[i];
            while(windowSum>=target){
                minLength = Math.min(minLength, i-windowStart+1 );
                windowSum -= nums[windowStart];
                windowStart++;
            }

        }

        return minLength==Integer.MAX_VALUE? 0: minLength;

    }
}
