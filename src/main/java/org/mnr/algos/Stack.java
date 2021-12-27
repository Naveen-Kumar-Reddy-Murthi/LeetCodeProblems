package org.mnr.algos;

import java.util.NoSuchElementException;

public class Stack {
    private static  class Node {
        Node next;
        int data;
        public Node(int data){
            this.data = data;
        }

        @Override
        public String toString() {
            return "{" +
                    "data=" + data +
                    ", next=" + next +
                    '}';
        }
    }

    private Node top;

    public boolean isEmpty(){
        return top == null;
    }
    public int peek(){
        if( top == null) {
            throw new NoSuchElementException("top is null");
        }
        return top.data;
    }
    public void push(int data){
       Node node = new Node(data);
       node.next = top;
       top = node;

    }
    public int pop(){
        int data = top.data;
         top = top.next;
         return data;
    }

    public static void main(String[] args) {

    }

}
