package org.mnr.algos;

public class Tree {
    private static  class Node {
        Node left,right;
        int data;
        public Node(int data){
            this.data = data;
        }

        @Override
        public String toString() {
            return "Node{" +
                    "data=" + data +
                    ", left=" + left +
                    ", right=" + right +

                    '}';
        }
    }

    public void insert(int data){

    }
}
