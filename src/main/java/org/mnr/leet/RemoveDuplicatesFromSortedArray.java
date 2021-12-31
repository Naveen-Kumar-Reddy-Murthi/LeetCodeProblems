package org.mnr.leet;

import java.util.Arrays;

public class RemoveDuplicatesFromSortedArray {

    /**
     * https://leetcode.com/problems/remove-duplicates-from-sorted-array/
     */
    public static void main(String[] args) {

        System.out.println(removeDuplicates(new int[]{1, 1, 2}));
        System.out.println(removeDuplicates(new int[]{0, 0, 1, 1, 1, 2, 2, 3, 3, 4}));
    }

    private static int removeDuplicates(int[] nums) {
        if (null == nums || nums.length == 0) {
            return 0;
        }
        int lefCounter = 1;
        for (int rightCounter = 1; rightCounter < nums.length; rightCounter++) {
            if (nums[rightCounter] != nums[rightCounter - 1]) {
                nums[lefCounter] = nums[rightCounter];
                lefCounter ++;
            }
        }
        System.out.println(Arrays.toString(nums));
        return lefCounter;
    }
}
