package com.company;

/**
 * Created by Harsh P Vyas on 8/16/2016.
 */
public class Stack2nDynamic {
    int capacity =16;
    int Min_capacity=1;
    public static int stackarr[];
    public static int top=-1;

    Stack2nDynamic(int capacity){
        this.capacity=capacity;
        stackarr = new int[capacity];
    }

    public int size(){
        return (top+1);
    }
    public boolean isEmpty(){
        return (top<0);
    }

    public void push(int a) {
        if(size()==capacity)
            expand();
        stackarr[++top]=a;
    }

    public void expand(){
        int length = size();
        int [] newStack = new int[length<<1];
        System.arraycopy(stackarr,0,newStack,0,top+1);
        stackarr = newStack;
    }
    public void shrink(){
        // if the 3/4 of the array is empty then reduce the  size;
        int length = top+1;
        if(length<=Min_capacity){
            int [] newStack = new int [length>>2];
            System.arraycopy(stackarr,0,newStack,0,length);
        }
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
