package com.ctc;

import java.util.EmptyStackException;

/**
 * Created by Harsh P Vyas on 9/22/2016.
 */
public class MyQueue<T> {
    QueueNode<T> front;
    QueueNode<T> rear;
    public class QueueNode<T>{
        public T data;
        public QueueNode<T> next;
        QueueNode(T data){
            this.data= data;
        }
    }
    public void add(T data){
        QueueNode<T> newNode = new QueueNode<T>(data);
        if(front==null){
            front=rear=newNode;
        }
        else{
            rear.next=newNode;
            rear=newNode;
        }
    }
    public T remove(){
        if(front==null)
            throw new EmptyStackException();
        T item = front.data;
        front=front.next;
        return item;
    }


}
