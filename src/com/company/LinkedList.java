package com.company;

import java.util.Stack;

/**
 * Created by Harsh P Vyas on 8/4/2016.
 */
public class LinkedList {

    ListNode head;
    int length;
    LinkedList(){
        length=0;
    }

    public synchronized ListNode getHead(){
        return head;
    }

    // Insertion portion
    public void insertAtBegin(ListNode node){
        if(head==null) {
            head = node;
            return;
        }
        node.next=head;
        head = node;
        length++;
    }

    public void insertAtEnd(ListNode node){

        if(head == null)
        {
            head = node;
            return;
        }
        ListNode p,q; //Temp nodes

        for(p=head;(q=p.getNext())!=null;p=q){
            p.setNext(node);
        }
        length++;
    }
    // Insert the node in the particular position
    public void insertInPosition(int position, int data){

        if(position<0)
            position=0;

        if(position>=length)
            position=length-1;

        if(head!=null)
            head = new ListNode(data);

        else if (position == 0){
            ListNode temp = new ListNode(data);
            temp.setNext(head);
            head= temp;
        }

        else{
            ListNode temp = head;
            for(int i=0;i<position;i++){
                temp = temp.getNext();
            }
            ListNode node = new ListNode(data);
            node.setNext(temp.next);
            temp.setNext(node);
        }
        length++;
    }

    // Deletion of nodes
    public synchronized ListNode removeFromBegin(){
        ListNode node = head;
        if(node!=null){
          head = node.getNext();
          node.setNext(null);
        }
        length--;
        return  node;
    }

    public synchronized void removeFromEnd(){
        if(head == null)
            return;
        if(head.next==null){
            head=null;
            return;
        }

        ListNode p=head,q=null;
        while(p.getNext()!=null) {
            q = p;
            p=p.next;
        }
        q.setNext(null);
        length--;
    }

    public synchronized void removeMatched(ListNode node){

        if(head == null)
            return;
        ListNode p = head,q;
        while(p.next.equals(node)){
            q=p;
            p=p.next;
        }
        q=p;
        q.next=p.next.next;
        p.setNext(null);
    }

    public void removeAtPosition(int position){

        if(position<0)
            position =0;

        if(position>length)
            position=length-1;

        if(position ==0)
            head=null;

        else{
            ListNode p = head,q;
            for(int i=1;i<position;i++){
                p=p.getNext();
            }
            q=p.next;
            p.next= p.next.next;
            q=null;
            length--;

        }
    }

    public static String toString(ListNode node){
        String result ="[";
        if(node == null)
            result+="]";
        result = result+ node.getData();
        ListNode temp = node.next;
        while (temp.next!=null){
            result= result+ ","+temp.getData();
            temp=temp.next;
        }
        result = result+","+temp.getData();
    return  result + "]";
    }

    public int getLength(){
        return length;
    }

    // Get the position of the node

    public int getPosition(int data){
        ListNode temp;
        int position =0;
        if(head==null)
            return -1;

        if(head.data==data)
            return 0;

        else{
            temp = head;
            while(temp.data !=data){
                temp = temp.next;
                position++;
            }
        }
        return Integer.MIN_VALUE;
    }

    public void clearList(ListNode head){
        head=null;
        length=0;

    }

    public LinkedList reverseListUsingStack(ListNode node, LinkedList list){

        Stack<ListNode> stack = new Stack<ListNode>();
        ListNode temp = node;
        stack.push(temp);
        while(temp.next!=null){
            stack.push(temp.next);
            temp = temp.getNext();
        }

        stack.push(temp);
        list.head= stack.pop();
        temp = list.getHead();
        while(!stack.isEmpty()){
            temp.next= stack.pop();
            temp = temp.next;
        }
        return list;
    }
}
