package org.mnr.leet;

public class PermutationString {

    public static void main(String[] args) {
        System.out.println(checkInclusion( "ab","eidbaooo"));
         //System.out.println(checkInclusion( "ab","eidboaoo"));
    }

    public static boolean checkInclusion(String s1, String s2) {
        if(s1.length()==0){
            return false;
        }
        int ref[]=new int[26];

        for(int i=0;i<s1.length();i++){
            ref[s1.charAt(i)-'a']++;
        }

        int curr[]=new int[26];
        int total=0,l=0;

        for(int i=0;i<s2.length();i++){
            char c=s2.charAt(i);
            curr[c-'a']++;
            total++;
            while(curr[c-'a']>ref[c-'a']){
                curr[s2.charAt(l)-'a']--;
                l++;total--;
            }
            if(total==s1.length()){return true;}
        }
        return false;
    }
}
