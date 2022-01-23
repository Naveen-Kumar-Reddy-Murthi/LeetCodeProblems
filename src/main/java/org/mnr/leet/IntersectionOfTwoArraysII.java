package org.mnr.leet;

import java.util.*;

public class IntersectionOfTwoArraysII {
    public static void main(String[] args) {
        //https://leetcode.com/problems/intersection-of-tw.o-arrays-ii/
        int[] nums1 = new int[]{1,2,2,1};
        int[] nums2 = new int[]{2,2};
        int[] nums3 = new int[]{4,9,5};
        int[] nums4 = new int[]{9,4,9,8,4};
        System.out.println(Arrays.toString(intersect(nums1,nums2)));
        System.out.println(Arrays.toString(intersect(nums3,nums4)));
    }
    public static int[] intersect(int[] nums1, int[] nums2) {
        Map<Integer, Integer> map= new HashMap<>();
         for(int n : nums1){
             map.put(n,map.getOrDefault(n,0)+1);
         }
        List<Integer> num2List = new ArrayList<>();
         for(int n: nums2){
           int count = map.getOrDefault(n,0);
             if(count>0) {
                 num2List.add(n);
                 map.put(n,count-1);
             }
         }
        int[] res = new int[num2List.size()];
         int i = 0;
        for (int j:num2List) {
            res[i++]=j;
        }
        return res;

    }

}
