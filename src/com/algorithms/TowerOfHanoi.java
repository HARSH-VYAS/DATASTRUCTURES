package com.algorithms;

/**
 * Created by Harsh P Vyas on 7/29/2016.
 */
public class TowerOfHanoi {

    public void TOH(int n , int from, int to, int aux){

        if(n==1){
            System.out.println("Ring moved from: "+from+"to"+to);
            return;
        }

        // Move n-1 ring from A, B using C as(Aux)
        TOH(n-1,from, aux, to);
        System.out.println("Ring moved from"+ from+"to"+to);
        TOH(n-1,aux,to,from);

    }
}
