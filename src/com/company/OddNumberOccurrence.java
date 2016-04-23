package com.company;

/**
 * Created by Harsh P Vyas on 3/28/2016.
 */
public class OddNumberOccurrence {


    public void findOddOccurrence(int a[]){

        int res=0;
        for(int i=0;i<a.length;i++){
            System.out.println(res +" number xored "+ a[i]);
            res = res ^ a[i];
            System.out.println("Result is:" + res);
        }

        System.out.println("Odd number occurred is "+res);
    }
}
