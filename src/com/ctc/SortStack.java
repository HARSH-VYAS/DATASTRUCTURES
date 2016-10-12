package com.ctc;

import java.util.Stack;

/**
 * Created by Harsh P Vyas on 9/24/2016.
 */
public class SortStack {

    Stack<Integer> stackTemp = new Stack<Integer>();
    Stack<Integer> stack = new Stack<Integer>();

    public void sort(Stack<Integer> stack){
        this.stack=stack;
        if(stack==null) return;
      while(!stack.isEmpty()){
        int a = stack.pop();
        while(!stackTemp.isEmpty() && stackTemp.peek()>a){
            stack.push(stackTemp.pop());
        }
        stackTemp.push(a);
      }
    }

    public void copyAll(){
        while(!stackTemp.isEmpty()){
            stack.push(stackTemp.pop());
        }
    }

}
