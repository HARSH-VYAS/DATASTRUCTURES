package com.ctc;

import java.util.EmptyStackException;

/**
 * Created by Harsh P Vyas on 9/22/2016.
 */
public class MyStack<T> {

    public StackNode<T> top;

    public class StackNode<T>{
        public T data;
        public StackNode next;

        StackNode(T data){
            this.data = data;
        }
    }

    public void push(T data){
        StackNode<T> newNode = new StackNode<T>(data);
        newNode.next=top;
        top=newNode;
    }

    public T pop(){
        if(top==null) {
            throw new EmptyStackException();
        }
        T item = top.data;
        top=top.next;
        return item;
    }

    public T peek(){
        return top.data;
    }

    public boolean isEmpty(){
        return (top==null);
    }


}
