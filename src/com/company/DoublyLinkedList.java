package com.company;

/**
 * Created by Harsh P Vyas on 8/14/2016.
 */
public class DoublyLinkedList {

    DLLNode head;
    DLLNode tail;
    DoublyLinkedList(int data){
        head = new DLLNode(data,null,null);
        tail=head;
    }

    public void insertAtBegining(DLLNode node){
        if(head==null)
            head = node;
        node.next=head;
        node.prev=null;
        head.prev=node;
        head=node;
    }

    public void insertAtEnd(DLLNode node){
        if(head==null)
            head=node;
        tail.next=node;
        node.next=null;
        node.prev=tail;
        tail=node;
    }
    public void insertAtPosition(int data, int position){

    }

    public DLLNode getHead() {
        return head;
    }

    public void setHead(DLLNode head) {
        this.head = head;
    }

    public DLLNode getTail() {
        return tail;
    }

    public void setTail(DLLNode tail) {
        this.tail = tail;
    }

    public class DLLNode{
        int data;
        DLLNode prev;
        DLLNode next;

        public DLLNode(int data, DLLNode prev, DLLNode next) {
            this.data = data;
            this.prev=prev;
            this.next=next;
        }

        public int getData() {
            return data;
        }

        public void setData(int data) {
            this.data = data;
        }

        public DLLNode getPrev() {
            return prev;
        }

        public void setPrev(DLLNode prev) {
            this.prev = prev;
        }

        public DLLNode getNext() {
            return next;
        }

        public void setNext(DLLNode next) {
            this.next = next;
        }
    }
}
