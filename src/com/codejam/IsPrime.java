package com.codejam;

/**
 * Created by Harsh P Vyas on 11/16/2016.
 */
public class IsPrime {


    public boolean isPrime(int x){
        boolean ans = false;
        if(x==2)
            return true;
        if(x%2==0)
            return false;
        else{
            for(int i=3; i*i <x; i++){
                if(x%i == 0)
                    ans =false;
                else
                    ans =true;
            }
        }

        return ans;
    }

}
