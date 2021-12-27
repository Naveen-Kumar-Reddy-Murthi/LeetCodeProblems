package org.mnr.algos;

import java.util.NoSuchElementException;

public class Queue {

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

    private Node head;// remove from head
    private Node tail;// add here

    public boolean isEmpty(){
        return head == null;
    }

    public int peek(){
        if( head == null) {
            throw new NoSuchElementException("Head is null");
        }
        return head.data;
    }

    public void add(int data){
        Node node = new Node(data);
        if(tail != null){
            tail.next = node;
        }
        tail = node;
        if(head == null){
            head = node;
        }

    }

    public int remove(){
        int data = head.data;
        head = head.next;
        if(head == null){
            tail = null;
        }
        return data;
    }

    public static void main(String[] args) {
        Queue queue = new Queue();


    }
}
