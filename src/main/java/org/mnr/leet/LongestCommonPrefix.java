package org.mnr.leet;

public class LongestCommonPrefix {
    public static void main(String[] args) {
        System.out.println(findLongestCommonPrefix( new String[] {"flower","flow","flight"}));
        System.out.println(findLongestCommonPrefix(new String[] {"dog","racecar","car"}));
        System.out.println(findLongestCommonPrefix(new String[] {"abcdefghi","abcdefgh","abcdefg","abcdef","abcde"}));

    }

    private static String findLongestCommonPrefix(String[] strs){
        String result = "";

        for(int i=0; i< strs[0].length(); i++){
           for(String currentString : strs){
               if( i == currentString.length() || currentString.charAt(i) != strs[0].charAt(i) ){
                   return result;
               }
           }
            result = result+strs[0].charAt(i);
        }
        return result;

    }
}
