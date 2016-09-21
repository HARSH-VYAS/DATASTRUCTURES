package com.codejam;

/**
 * Created by Harsh P Vyas on 8/21/2016.
 */
public class GenericTree {

    public class TreeNode{
        int data;
        TreeNode firstChild;
        TreeNode siblings;
        TreeNode(int data){
            this.data=data;
            firstChild=null;
            siblings=null;
        }
        public int getData() {
            return data;
        }

        public void setData(int data) {
            this.data = data;
        }

        public TreeNode getFirstChild() {
            return firstChild;
        }

        public void setFirstChild(TreeNode firstChild) {
            this.firstChild = firstChild;
        }

        public TreeNode getSiblings() {
            return siblings;
        }

        public void setSiblings(TreeNode siblings) {
            this.siblings = siblings;
        }
    }
}
