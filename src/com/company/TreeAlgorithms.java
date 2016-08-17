package com.company;

import java.util.*;
import java.util.LinkedList;

/**
 * Created by Harsh P Vyas on 8/10/2016.
 */
public class TreeAlgorithms {

    public int minimumDepth(BinaryTree binaryTree){
        int count=1;
        // Level order traversal of the tree will be better to do.
        if(binaryTree.getRoot()==null)
            return 0;
        Queue<BinaryTree.Node> queue = new LinkedList<BinaryTree.Node>();
        queue.offer(binaryTree.getRoot());
        queue.offer(null);

        while(!queue.isEmpty()){
            BinaryTree.Node temp = queue.poll();
            if(temp!=null) {
                if (temp.left == null && temp.right == null)
                    return count;
                if (temp.getLeft() != null)
                    queue.add(temp.getLeft());
                if (temp.getRight() != null)
                    queue.add(temp.getRight());
                else {
                    if (!queue.isEmpty()) {
                        count++;
                        queue.offer(null);
                    }
                }
            }
        }
        return count;
    }
    public BinaryTree.Node  findDeepestNode(BinaryTree.Node node){
        // Deepest node of the tree is the last node in the level order traversal
        Queue<BinaryTree.Node> queue = new LinkedList<BinaryTree.Node>();
        queue.offer(node);
        BinaryTree.Node temp = null;
        while(!queue.isEmpty()){
            temp = queue.poll();
            if(temp.getLeft()!=null){
                queue.add(temp.getLeft());
            }
            if(temp.getRight()!=null){
                queue.add(temp.getRight());
            }
        }
        return  temp;
    }

}
