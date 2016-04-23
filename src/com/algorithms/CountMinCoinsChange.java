package com.algorithms;

import java.util.Arrays;


/**
 * Created by Harsh P Vyas on 4/1/2016.
 * Remaining logic needs improvement
 *
 */
public class CountMinCoinsChange {

    int coins[];
    int change;
    int o[][];

    CountMinCoinsChange(int coins[],int change){
        this.coins=coins;
        this.change=change;
       this.o= new int[coins.length][change];
    }

    public void count(){

        Arrays.sort(coins);
        int sum=0;
        int j=1;
        for(int i=1;i<coins.length;i++){
                while( sum <= j){
                    if(coins[i]>coins[i-1]){
                          sum=sum+coins[i];
                          System.out.println(sum);
                    }
                    else{
                        sum=sum+coins[i-1];
                        System.out.println(sum);
                    }
                    o[i][j]=sum;
                }
                sum=1;
                j++;

            }

    }

}
