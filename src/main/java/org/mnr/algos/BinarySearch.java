package org.mnr.algos;

public class BinarySearch {
    public static void main(String[] args) {
        System.out.println(binarySearch(new int[]{1,2,3,4},4));
        System.out.println(binarySearch(new int[]{1,2,3,4},-1));
        System.out.println(binarySearch(new int[]{1,2,3,4},1));
    }
    private static int binarySearch(int[] nums, int target){
        int first=0,last=nums.length-1,mid=0;
        if(last == 0)
            return -1;
        while(first<=last){
            mid = (first+last)/2;
            if(nums[mid] == target){
                return mid;
            }else if(nums[mid] < target){
                first = mid+1;
            } else{
                last = mid-1;
            }
        }
     return -1;
    }
}
