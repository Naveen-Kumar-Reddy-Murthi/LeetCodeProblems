package org.mnr.leet;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Panagram {

    public static void main(String[] args) {
        String str = "The quick brown fox jumps over the lazy dog";
       // System.out.println(isPanagram1(str));
        int A = 'A';
        int Z = 'Z';
        int a = 'a';
        int z = 'z';

        System.out.println(A);
        System.out.println(Z);
        System.out.println(a);
        System.out.println(z);

    }

    private static boolean isPanagram1(String sentence){
        boolean[] letters  = new boolean[26];

        for(char c : sentence.toCharArray()) {
            letters[c - 'a'] = true;
        }

        //find any letter that not exist
        for(boolean existLetter : letters) {
            if(!existLetter) return false;
        }

        return true;

    }

    private static boolean isPanagram(String str){
        boolean[] mark = new boolean[26];
        int index=0;
        for (int i = 0; i < str.length(); i++) {
            // If uppercase character, subtract 'A'
            // to find index.
            char currentChar = str.charAt(i);
            if ('A' <= currentChar && currentChar <= 'Z')
                index = str.charAt(i) - 'A';

                // If lowercase character, subtract 'a'
                // to find index.
            else if ('a' <= currentChar && currentChar <= 'z')

                index = str.charAt(i) - 'a';

                // If this character is other than english
                // lowercase and uppercase characters.
            else
                continue;
            mark[index] = true;
        }

        // Return false if any character is unmarked
        for (int i = 0; i <= 25; i++)
            if (mark[i] == false)
                return (false);

        // If all characters were present
        return (true);

    }
}
