package org.mnr.leet;

import java.util.HashSet;
import java.util.Set;
import java.util.Arrays;

public class MissingNumber {
    public static void main(String[] args) {
        Set<Integer> set = new HashSet<>();
        System.out.println(set.add(1));
        System.out.println(set.add(1));
        System.out.println(set.add(2));
        System.out.println(set.add(2));
        System.out.println(set.add(null));

        System.out.println(findMissingNumber(new int[] {3,0,1}));
        System.out.println(findMissingNumber(new int[] {0,1}));
        System.out.println(findMissingNumber(new int[] {9,6,4,2,3,5,7,0,1}));
    }

    private static int findMissingNumber(int [] nums){

        int sum = Arrays.stream(nums).sum();
        return (nums.length * (nums.length + 1) )/ 2 - sum;

    }
}
