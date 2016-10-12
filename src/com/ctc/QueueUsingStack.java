package com.ctc;

import java.util.Stack;

/**
 * Created by Harsh P Vyas on 9/24/2016.
 */
public class QueueUsingStack {

    Stack<Integer> newStack = new Stack<Integer>();
    Stack<Integer> oldStack = new Stack<Integer>();

    public void enquue(int a){
        newStack.push(a);
    }
    public Integer dequeue(){
        int a;
        moveStack();
        a=oldStack.pop();

        return a;
    }
    public int peek(){
        moveStack();;
        return oldStack.peek();
    }

    public int size(){
        return oldStack.size()+newStack.size();
    }

    public void moveStack(){

        if(oldStack.isEmpty()){
            while(!newStack.isEmpty()){
                oldStack.push(newStack.pop());
            }
        }
    }

}
