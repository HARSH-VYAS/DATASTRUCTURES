package com.codejam;

/**
 * Created by Harsh P Vyas on 8/16/2016.
 */
public class Stack {
    // This implementation is using fixed sized array.

    int [] stackarr;
    int top=-1;
    int capacity;
    Stack(int capacity){
        this.capacity=capacity;
        stackarr = new int [capacity];
    }
    public int size(){
        return (top+1);
    }
    public boolean isEmpty(){
        return (top<0);
    }

    public void push(int a) throws Exception{
        if(size()==capacity)
            throw new Exception("Stack is Full");
        stackarr[++top]=a;
    }

    public int pop()throws  Exception{
        if(isEmpty())
            throw  new Exception("Stack is empty");
        int a = stackarr[top];
        stackarr[top--]=0;
        return a;
    }
    public int top()throws Exception{
        if(isEmpty())
            throw new Exception("Stack is empty");
        return stackarr[top];
    }
    public String toString() {
        String s ="[";
        if(size()<0)
            System.out.println("Stack is empty");
        else{
            for(int i=0;i<size();i++)
                s=s+stackarr[i];
        }
        return s+"]";
    }
}
