package com.algorithms;

/**
 * Created by Harsh P Vyas on 4/1/2016.
 */
public class Main {

    public static void main(String args[]){

        int v[]={0,12,10,20,15};
        int w[]={0,2,1,3,2};
        int W=5;

        int coins[]={1,2,3};
        int change=5;
        int coins1[]={0,1,4,5};


        // Dynamic programing knapsack problem
       /* KnapSack knapSack = new KnapSack(v,w,W);
        int max=knapSack.DknapSack();
        System.out.println(max);*/

        //Coin change total no of coins problem
        /* CountChange countChange = new CountChange(coins,change);
         int m=countChange.count(coins,coins.length,change);
         System.out.println("Output is:"+ m);*/

        // Count minimum coins needed to change
        CountMinCoinsChange countMinCoinsChange= new CountMinCoinsChange(coins1,change);
        countMinCoinsChange.count();

    }

}
