package org.mnr.algos;

public class LinkedList {

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

    Node head;

    public void append(int data){

        if(head == null){
            head = new Node(data);
            return;
        }

        Node current = head;
        while(current.next != null){
            current = current.next;
        }
        current.next = new Node(data);

    }

    public void prepend(int data){
        Node newHead = new Node(data);
        newHead.next= head;
        head = newHead;

    }

    public void delete(int data){
        if(head == null){
            return;
        }
        if(head.data == data){
            head = head.next;
        }
        Node current = head;
        while(current.next != null){
            if(current.next.data == data){
                current.next = current.next.next;
                return;
            }
            current = current.next;
        }
    }

    @Override
    public String toString() {
        return "{" +
                "head=" + head +
                '}';
    }

    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.append(1);
        System.out.println(list);

        list.append(2);
        System.out.println(list);

        list.prepend(0);
        System.out.println(list);

        list.prepend(-1);
        System.out.println(list);

        list.append(10);
        System.out.println(list);

        list.append(11);
        System.out.println(list);

        list.delete(-1);
        System.out.println(list);
    }

}
