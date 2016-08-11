package com.company;

import java.util.*;
import java.util.LinkedList;

/**
 * Created by Harsh P Vyas on 8/8/2016.
 */
public class FindMaxInTree {

    int max = 0;

    public int findMax(BinaryTree.Node root){

        if(root == null)
            return Integer.MIN_VALUE;
        else{
            if(root.getData() > max)
                max=root.getData();

            findMax(root.getLeft());
            findMax(root.getRight());
        }

        return max;
    }

    public int finMaxWithoutRecursion(BinaryTree.Node root){
        max=0;
        Queue<BinaryTree.Node> queue = new LinkedList<BinaryTree.Node>();
        if(root == null)
            return Integer.MIN_VALUE;
        else{
            queue.add(root);
            while(!queue.isEmpty()) {
                BinaryTree.Node temp = queue.poll();
                if (temp.getData() > max)
                    max = temp.getData();
                if (temp.getLeft() != null)
                    queue.add(temp.getLeft());
                if (temp.getRight() != null) {
                    queue.add(temp.getRight());
                }
            }
        }

        return  max;
    }
}
