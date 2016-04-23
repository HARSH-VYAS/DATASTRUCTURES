package com.algorithms;

/**
 * Created by Harsh P Vyas on 4/1/2016.
 */
public class CountChange {
    int coins[];
    int change;


    CountChange(int coins[], int change){
        this.coins=coins;
        this.change=change;
    }

    public int count(int coins[],int m, int n){

        if(m<=0 && n>=1){
            // no coins
            return 0;
        }

        if(n<0){
           // Zero summation or minus summation
            return 0;
        }
        if(n==0)
            return 1;

        System.out.println("m :"+ m+" n:"+n);
        for(int i=0;i<coins.length;i++){
            System.out.println("coins"+coins[i]);

        }

        return count(coins,m-1,n)+count(coins,m,n-coins[m-1]);

    }



}
