package com.LeetCode;

/**
 * Created by Harsh P Vyas on 10/1/2016.
 */
public class Main {

    public static void main(String []args){
        FindSumIndex fsi = new FindSumIndex();
        int [] a = {3,2,4};
        int ar[]= fsi.findSum(a,6);
        for(int i=0;i<ar.length;i++){
            System.out.println(ar[i]);
        }
    }

}
