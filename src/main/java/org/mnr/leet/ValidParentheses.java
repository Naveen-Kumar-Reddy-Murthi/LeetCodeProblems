package org.mnr.leet;

import java.util.Stack;

public class ValidParentheses {
    public static void main(String[] args) {
        //System.out.println(isValid("()"));
        //System.out.println(isValid("()[]{}"));
        System.out.println(isValid("(((())))"));
    }

    private static boolean isValid(String input){
        Stack<Character> stack = new Stack<>();

        for(char c : input.toCharArray()){
            switch(c){
                case ']': if(stack.isEmpty() || stack.pop()!='[') return false; break;
                case ')': if(stack.isEmpty() || stack.pop()!='(') return false; break;
                case '}': if(stack.isEmpty() || stack.pop()!='{') return false; break;
                default: stack.push(c);
            }
        }
        return stack.isEmpty();
    }
}
