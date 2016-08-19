package com.codejam;

import java.util.ArrayList;

/**
 * Created by Harsh P Vyas on 8/16/2016.
 */
public class StackDynamic {
    ArrayList<Integer> arrayList = new ArrayList<Integer>();
    int top=-1;

    public int size(){
        return (top+1);
    }
    public boolean isEmpty(){
        return (top<0);
    }

    public void push(int a){
        arrayList.add(++top,a);
    }

    public int pop()throws  Exception{
        if(isEmpty())
            throw  new Exception("Stack is empty");
        int a = arrayList.get(top);
        arrayList.remove(top);
        return a;
    }
    public int top()throws Exception{
        if(isEmpty())
            throw new Exception("Stack is empty");
        return arrayList.get(top);
    }
    public String toString() {
        String s ="[";
        if(size()<0)
            System.out.println("Stack is empty");
        else{
            for(int i=0;i<size();i++)
                s=s+arrayList.get(i);
        }
        return s+"]";
    }

}
