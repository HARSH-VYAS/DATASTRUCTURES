package com.backtracking;

/**
 * Created by Harsh P Vyas on 7/29/2016.
 */
public class StringofNBits {
    int A[];
    public StringofNBits( int A[]) {
        this.A = A;
    }

    public void binary(int n){
        if(n<1)
            System.out.println(A);
        else {
            A[n - 1] = 0;
            binary(n-1);
            A[n-1]=1;
            binary(n-1);
        }
    }

}
