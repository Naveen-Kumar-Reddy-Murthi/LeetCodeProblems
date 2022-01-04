package org.mnr.leet;

public class NeedleInAHayStack {
    public static void main(String[] args) {

        System.out.println(strStr("hello", "ll"));
        System.out.println(strStr("aaaaa", "bba"));
        System.out.println(strStr("", ""));

    }

    private static int strStr(String haystack, String needle){
       return haystack.indexOf(needle);
    }
}
