package com.ctc;

/**
 * Created by Harsh P Vyas on 9/22/2016.
 */
public class OneArrayThreeStack {
    int numOfStack =3;
    int capacity;
    int values[];
    int stackSize[];

    OneArrayThreeStack(int stackNum, int capacity){
        this.capacity=capacity;
        values = new int[numOfStack*capacity];
        stackSize = new int [numOfStack];
    }

    public void push(int value, int stackNum){
        stackSize[stackNum]++;
        values[indexOfTop(stackNum)]=value;
    }

    public int indexOfTop(int stackNum){
        int offset = stackNum*capacity;
        int size = stackSize[stackNum];
        return  offset+size-1;
    }

}
