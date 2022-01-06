package org.mnr.leet;

import java.util.Arrays;


public class StringCompression {

    //https://leetcode.com/problems/string-compression/

    public static void main(String[] args) {

       // System.out.println(compress(new char[]{'a', 'a', 'b', 'b', 'c', 'c', 'c' }));
        System.out.println(compress(new char[]{'a','b','b','b','b','b','b','b','b','b','b','b','b' }));
    }

    public static int compress(char[] chars) {
        if(chars.length==1)
            return 1;
        int charCount = 0;
        StringBuilder output = new StringBuilder().append(chars[0]);
        int count = 1;
        for(int i=1; i<chars.length; i++){
            char curr = chars[i];
            char prev = chars[i-1];
            if(curr == prev){
                count++;
            } else{
                if(count>1){
                    output.append(count);
                    charCount += count;
                    count = 1;
                }
                    output.append(curr);
            }

        }
        if(count>1){
            output.append(count);
        }
        chars = output.toString().toCharArray();
        System.out.println(Arrays.toString(chars));
        return chars.length;
    }

}
