package com.backtracking;

/**
 * Created by Harsh P Vyas on 7/29/2016.
 */
public class Main {

    public static void main(String args[]){
        int A [] = {0,0,1,0,1,0,1,0};
        // string of n bits;
        StringofNBits n =  new StringofNBits(A);
        n.binary(A.length);

    }
}
