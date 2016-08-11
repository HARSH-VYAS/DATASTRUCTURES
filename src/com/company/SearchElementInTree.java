package com.company;

import java.util.*;
import java.util.LinkedList;

/**
 * Created by Harsh P Vyas on 8/8/2016.
 */
public class SearchElementInTree {
    boolean isData= false;
    public boolean search(BinaryTree.Node root, int data){
        if(root==null)
            return false;
        if(root.data==data)
            isData=true;
        else{
            search(root.getLeft(),data);
            search(root.getRight(),data);
        }
        return isData;
    }
    public boolean searchWithoutRecur(BinaryTree.Node root, int data){
        Queue<BinaryTree.Node> queue = new LinkedList<BinaryTree.Node>();
        if(root==null)
            return false;
        if(root.data==data)
            isData=true;
        else{


        }


        return isData;
    }


}
