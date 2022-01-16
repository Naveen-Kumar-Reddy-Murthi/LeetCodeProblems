package org.mnr.leet;

import java.util.Arrays;

public class RansomeNote {
    public static void main(String[] args) {
        System.out.println(canConstruct("a","b"));
        System.out.println(canConstruct("aa","ab"));
        System.out.println(canConstruct("aa","aab"));
        int a = 'a';
        int z = 'z';
        System.out.println(a);
        System.out.println(z);
    }

    public static boolean canConstruct(String ransomNote, String magazine) {
        /*int[] counts = new int[26];
        magazine.chars().forEach(c -> counts[c-'a']++);
        System.out.println(Arrays.toString(counts));
        return ransomNote.chars().allMatch(c -> counts[c-'a']-- > 0);*/
        int[] hash = new int[26];
        for (char c : magazine.toCharArray())
            ++hash[c-'a'];
        System.out.println(Arrays.toString(hash));
        for (char c : ransomNote.toCharArray())
            if (--hash[c-'a'] < 0)
                return false;
        return true;
    }
}
