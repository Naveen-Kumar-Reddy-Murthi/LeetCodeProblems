package org.mnr.leet;

import java.util.Arrays;

public class MergeSortedArrays {
    public static void main(String[] args) {
        //https://leetcode.com/problems/merge-sorted-array/
        int[] nums1 = new int[]{2,2,3,0,0,0};
        int[] nums2 = new int[]{1,5,6};
        int[] nums3 = new int[]{1};
        int[] nums4 = new int[]{};

        merge(nums1,3, nums2,3);
        //merge(nums3,1, nums4,0);

        System.out.println(Arrays.toString(nums1));
        System.out.println(Arrays.toString(nums3));
    }

    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        int last = m+n-1;

        while(m>0 && n>0){
            if(nums1[m-1]>nums2[n-1]){
                nums1[last] = nums1[m-1];
                m -=1;
            }else{
                nums1[last] = nums2[n-1];
                n -=1;
            }
            last -= 1;
        }
        while(n>0){
            nums1[last] = nums2[n-1];
            n -= 1;
            last -= 1;
        }

    }
}
