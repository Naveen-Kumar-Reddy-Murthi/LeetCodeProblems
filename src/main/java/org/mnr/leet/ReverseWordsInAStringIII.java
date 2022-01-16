package org.mnr.leet;

public class ReverseWordsInAStringIII {
    public static void main(String[] args) {
        System.out.println(reverseWords("Let's take LeetCode contest"));//s'teL ekat edoCteeL tsetnoc
        System.out.println(reverseWords("God Ding"));//doG gniD
        int a = 'a';
        int b = 'b';
        System.out.println(a);
        System.out.println(b);
    }

    public static String reverseWords(String s) {
            StringBuilder sb = new StringBuilder(s.length());
            String[] strings = s.split(" ");
        for (int i = 0 ; i < strings.length; i++) {
            sb.append(reverse(strings[i]));
            if(i!=strings.length-1)
            sb.append(" ");
        }

    return sb.toString();
    }
    
    private static String reverse(String s){
        char [] chars = s.toCharArray();
        int first=0,last=chars.length-1;
        while(first<last){
            char temp = chars[first];
            chars[first++]=chars[last];
            chars[last--]=temp;
        }
      return String.valueOf(chars);
    }
}
