package com.company;

import java.util.Stack;

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
        else
        {
            if(dataIn<=nodeIn.getData())
                nodeIn.setLeft(insert(nodeIn.getLeft(), dataIn));
            else
                nodeIn.setRight(insert(nodeIn.getRight(),dataIn));

        }
        return nodeIn;
    }


    public void inOrder(Node root){
        if(root == null)
                return;

        inOrder(root.left);
        System.out.println(root.getData());
        inOrder(root.right);

    }

    public void inOrderWithStackRecur(Node root){

        Stack<Node> stack = new Stack<Node>();
        Node node;

        if(root == null)
            return;
        while(root!=null){
            stack.push(root);
            root=root.left;
        }

        while(stack.size()>0)
        {
            node = stack.pop();
            System.out.println(node.getData());

            if(node.right!=null) {
                node = node.right;
                while (node != null) {
                    stack.push(node);
                    node = node.left;
                }
            }
        }
    }


    public static class Node{
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

    public static void main(String [] args){

        Node root = new Node(1);
        BinaryTree binaryTree = new BinaryTree(root);
        binaryTree.insert(2);
        binaryTree.insert(3);
        binaryTree.insert(9);
        binaryTree.insert(5);
        binaryTree.insert(4);
        binaryTree.insert(5);
        binaryTree.insert(6);
        binaryTree.insert(10);
        binaryTree.insert(11);
        binaryTree.insert(6);
        binaryTree.insert(7);

        System.out.println("In order traversal starts from here.");
        binaryTree.inOrder(root);
        System.out.println("In order traversal starts from here.1111111111111111");
        binaryTree.inOrderWithStackRecur(root);

    }

}
