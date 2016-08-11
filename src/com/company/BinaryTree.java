package com.company;

import java.util.*;
import java.util.LinkedList;

/**
 * Created by Harsh P Vyas on 3/24/2016.
 */
public class BinaryTree {
    Node root;

    public Node getRoot() {
        return root;
    }

    public void setRoot(Node root) {
        this.root = root;
    }

    public static HashMap<Integer, List<Integer>> getHashMap() {
        return hashMap;
    }

    public static void setHashMap(HashMap<Integer, List<Integer>> hashMap) {
        BinaryTree.hashMap = hashMap;
    }

    public static HashMap<Integer, List<Integer>> hashMap= new HashMap<Integer, List<Integer>>();
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
        Node node=root;
        boolean flag = false;

        while(!flag){
            if(node!=null){
                stack.push(node);
                node= node.getLeft();
            }
            else{
                if(stack.isEmpty())
                    flag=true;
                else{
                    node = stack.pop();
                    System.out.println(node.getData()+"->");
                    node=node.getRight();
                    }
                }
            }

        }

    public void postOrder(Node root){
        if(root==null)
            return;
        else{
            postOrder(root.getLeft());
            postOrder(root.getRight());
            System.out.println(root.getData());
        }

    }

    public void postOrderWithStack(Node root){
        Stack<Node> stack = new Stack<Node>();
        Node node = null;
        if(root==null)
            return;
        stack.push(root);
        Node prev = null;

        while(!stack.isEmpty()){
            node = stack.peek();
            if(prev==null || prev.left==node || prev.right==node){
                if(node.left!=null)
                    stack.push(node);
                else if(node.right!=null)
                    stack.push(node);
            }
            else if(prev==node.left){
                if(node.right!=null)
                    stack.push(node.right);
            }
            else{
                System.out.println(stack.pop().data);
            }
            prev=node;
        }

    }

    public void preOrder(Node root){
        if(root==null)
            return;
        else{
            System.out.println(root.getData());
            postOrder(root.getLeft());
            postOrder(root.getRight());
        }
    }

    public void preOrderWithStack(Node root){
        Stack<Node> stack = new Stack<Node>();
        Node temp;
        stack.push(root);
        while(!stack.isEmpty()){
            temp = stack.pop();
            System.out.println(":"+temp.getData()+"->");
            if(temp.getRight()!=null)
                stack.push(temp.getRight());
            if(temp.getLeft()!=null)
                stack.push(temp.getLeft());
        }
    }

    public void levelOrder(Node root){
        Queue<Node> queue = new LinkedList<Node>();
        if(root == null)
            return;
        queue.add(root);
        int iteration =0;
        while(!queue.isEmpty()){
            Node temp =  queue.poll();
            System.out.print(temp.data + "->");
            if(temp.getLeft()!=null)
                queue.add(temp.getLeft());
            if(temp.getRight()!=null)
                queue.add(temp.getRight());
            iteration++;
        }

    }


    public void levelOrderWithoutQueue(Node root, int level, HashMap<Integer, List<Integer>> hashMap){
        if(root==null)
            return;
        else{
           List<Integer> list = hashMap.get(level);
           if(list==null){
               list= new ArrayList<Integer>();
               list.add(root.getData());
               hashMap.put(level,list);
           }
           else{
               list.add(root.getData());
               levelOrderWithoutQueue(root.getLeft(),level+1,hashMap);
               levelOrderWithoutQueue(root.getRight(),level+1,hashMap);
           }
        }
    }

    public void printLevelOrderWithoutQueue(Node root){

        if(root == null)
            return;
        else{
            for(int level=0; level<hashMap.size(); level++){
                List<Integer> list=hashMap.get(level);
                for(int i=0 ; i<list.size();i++){
                    System.out.println("Values at level "+level+"is "+list.get(i)+"->");
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

      /*  Node root = new Node(1);
        BinaryTree binaryTree = new BinaryTree(root);
        binaryTree.insert(2);
        binaryTree.insert(3);
        binaryTree.insert(4);
        binaryTree.insert(1);*/
       /* binaryTree.insert(4);
        binaryTree.insert(5);
        binaryTree.insert(6);
        binaryTree.insert(16);
        binaryTree.insert(11);
        binaryTree.insert(6);
        binaryTree.insert(7);
        */
        /*System.out.println("In order traversal starts from here.");
        binaryTree.inOrder(root);
        System.out.println("In order traversal starts from here.1111111111111111");
        binaryTree.inOrderWithStackRecur(root);
        */
        // Find the maximum element in the tree. with/without recursion

        /*FindMaxInTree fmit = new FindMaxInTree();
        int maxr=  fmit.findMax(root);
        int max = fmit.finMaxWithoutRecursion(root);
        System.out.println("Maximum is:"+max);
        System.out.println("Maximum with Recursion is:"+maxr);*/

        // Level order traversal
         //  binaryTree.levelOrder(root);
        // Level order without Queue
        /*binaryTree.levelOrderWithoutQueue(root,0,hashMap);
        binaryTree.printLevelOrderWithoutQueue(root);*/

        // Find minimum depth of the tree
        Node node = new Node(5);
        BinaryTree newTree = new BinaryTree(node);
        newTree.insert(6);
        newTree.insert(3);
        newTree.insert(4);
        newTree.insert(7);
        newTree.insert(1);
        TreeAlgorithms treeAlgorithms = new TreeAlgorithms();
        int depth= treeAlgorithms.minimumDepth(newTree);
        System.out.println("depth is"+depth);


    }

}
