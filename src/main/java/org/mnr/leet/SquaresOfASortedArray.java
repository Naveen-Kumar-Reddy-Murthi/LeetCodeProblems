package org.mnr.leet;

import java.util.Arrays;

public class SquaresOfASortedArray {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(sortedSquares(new int[]{-4,-1,0,3,10})));
        System.out.println(Arrays.toString(sortedSquares(new int[]{-7,-3,2,3,11})));
    }

    public static int[] sortedSquares(int[] nums) {
        /*for(int i=0; i<nums.length; i++){
            nums[i]=nums[i]*nums[i];
        }
        Arrays.sort(nums);
        return nums;*/
        //result array
        int[] result = new int[nums.length];
        //pointers for left and right
        int low = 0; int high = nums.length - 1;
        //iterate from n to 0
        for (int i = nums.length - 1; i >= 0; i--) {
            //check if abs left is less than or equal to abs right
            if (Math.abs(nums[low]) >= Math.abs(nums[high])) {
                //add left squared to result array
                result[i] = nums[low] * nums[low];
                //increment left pointer
                low++;
            } else {
                //add right squared to result array
                result[i] = nums[high] * nums[high];
                //decrement right pointer
                high--;
            }
        }
        //result
        return result;
    }

}
