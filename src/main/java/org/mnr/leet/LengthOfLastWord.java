package org.mnr.leet;

public class LengthOfLastWord {
    public static void main(String[] args) {
        //https://leetcode.com/problems/length-of-last-word/
        System.out.println(lengthOfLastWord("Hello World"));
        System.out.println(lengthOfLastWord("   fly me   to   the moon  "));
        System.out.println(lengthOfLastWord("luffy is still joyboy"));
    }

    private static int lengthOfLastWord(String s) {

        s = s.trim();
        return s.substring(s.lastIndexOf(" ")+1).length();

    }
}
