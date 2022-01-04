package org.mnr.leet;

public class SearchInsertPosition {
    //https://leetcode.com/problems/search-insert-position/
    public static void main(String[] args) {
        //System.out.println(searchInsert( new int[] {1,3,5,6},5));
        System.out.println(searchInsert( new int[] {1,3,5,6},2));
        //System.out.println(searchInsert( new int[] {1,3,5,6},7));
    }

    public static int searchInsert(int[] nums, int target) {

        int first=0,last=nums.length-1,mid=0, result= -1;

        while(first<=last){
            mid = (first+last)/2;

            if(nums[mid]> target){
                last = mid-1;
            } else if(nums[mid]<target){
                first = mid+1;
            } else{
                return mid;
            }
        }
        return first;

    }

}
