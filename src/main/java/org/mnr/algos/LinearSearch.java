package org.mnr.algos;

public class LinearSearch {

    public static void main(String[] args) {

        System.out.println(findValueUsingLinearSearch(new int[]{1,2,3,4},4));
        System.out.println(findValueUsingLinearSearch(new int[]{1,2,3,4},-1));
        System.out.println(findValueUsingLinearSearch(new int[]{1,2,3,4},1));
    }

    private static int findValueUsingLinearSearch(int[] nums, int target){
        for(int i=0;i<nums.length;i++){
            if(nums[i] == target) {
                return i;
            }
        }
        return -1;
    }
}
