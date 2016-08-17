package com.company;

/**
 * Created by Harsh P Vyas on 8/16/2016.
 */
public class Stacklinkedlist {
    int length;
    ListNode top;

    Stacklinkedlist(){
        length=0;
        top=null;
    }
    public void push(int data){
        if(top==null)
            top= new ListNode(data);
        ListNode temp = new ListNode(data);
        temp.setNext(top);
        top=temp;
        length++;
    }
    public ListNode pop() throws Exception{
        if(isEmpty())
            throw new Exception("Stack is empty");
        ListNode temp = top;
        top=top.next;
        temp.setNext(null);
        length--;
        return temp;
    }
    public boolean isEmpty(){
        return (length<1);
    }
    public int size(){
        return length;
    }
    public String toString(){
        String s="[";
        ListNode current = top;
        while(current!=null){
            s= s+current.getData()+",";
            current=current.getNext();
        }
        return s;
    }
}
