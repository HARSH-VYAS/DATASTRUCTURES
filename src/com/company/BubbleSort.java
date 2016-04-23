package com.company;

/**
 * Created by Harsh P Vyas on 3/23/2016.
 */
public class BubbleSort {


    public void sorting(int a[]){

        for(int i=0;i<a.length;i++){

            for(int j=a.length-1; j>i ; j--){
                if(a[j] < a[j-1]){
                    int temp = a[j];
                    a[j]=a[j-1];
                    a[j-1]=temp;
                }

            }

        }

        for(int i=0;i<a.length;i++){
            System.out.println(a[i]);
        }

    }
}
