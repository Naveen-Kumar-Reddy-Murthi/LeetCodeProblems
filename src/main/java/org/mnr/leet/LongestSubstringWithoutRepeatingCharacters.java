package org.mnr.leet;

import java.util.HashSet;
import java.util.Set;

public class LongestSubstringWithoutRepeatingCharacters {
    public static void main(String[] args) {
        //https://leetcode.com/problems/longest-substring-without-repeating-characters/
        System.out.println(lengthOfLongestSubstring("abcabcbb"));//3
        System.out.println(lengthOfLongestSubstring("bbbbb"));//1
        System.out.println(lengthOfLongestSubstring("pwwkew"));//3
    }

    public static int lengthOfLongestSubstring(String s) {
        int first=0,last=0;
        int max=0;
        Set<Character> charSet = new HashSet<>();
        while(last<s.length()){

            if(!charSet.contains(s.charAt(last))){
                charSet.add(s.charAt(last));
                last++;
                max= Math.max(charSet.size(),max);
            }else{
                charSet.remove(s.charAt(first));
                first++;
            }
        }
     return max;
    }
}
