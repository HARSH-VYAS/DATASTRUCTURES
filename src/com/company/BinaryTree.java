package com.company;

/**
 * Created by Harsh P Vyas on 3/24/2016.
 */
public class BinaryTree {
    Node root;

    BinaryTree(Node root){
        this.root=root;
    }
    public void insert(int dataIn){
        root = insert(root, dataIn);
    }

    private Node insert(Node nodeIn, int dataIn){

        if(nodeIn==null){
            nodeIn = new Node(dataIn);
        }
        else{
            if(nodeIn.getLeft()!=null && dataIn <= nodeIn.getLeft().getData()){
                nodeIn.setLeft(insert(nodeIn.getLeft(), dataIn));
            }else{
                nodeIn.setRight(insert(nodeIn.getRight(), dataIn));
            }
        }
        return nodeIn;
    }


    private class Node{
        int data;
        Node left;
        Node right;

        Node(int data){
            this.data=data;
            left=right=null;
        }

        public int getData() {
            return data;
        }

        public void setData(int data) {
            this.data = data;
        }

        public Node getLeft() {
            return left;
        }

        public void setLeft(Node left) {
            this.left = left;
        }

        public Node getRight() {
            return right;
        }

        public void setRight(Node right) {
            this.right = right;
        }




    }
}
