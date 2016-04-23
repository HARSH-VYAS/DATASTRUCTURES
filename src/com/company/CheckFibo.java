package com.company;

/**
 * Created by Harsh P Vyas on 3/19/2016.
 */
public class CheckFibo {

    public  boolean isPerFectSquare(int n){
        int s = (int) Math.sqrt(n);
        return s*s==n;
    }

    public boolean isFibo(int n){

        return isPerFectSquare(5*n*n-4)||isPerFectSquare(5*n*n+4);
    }

}
