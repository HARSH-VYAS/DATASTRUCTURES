package com.company;

/**
 * Created by Harsh P Vyas on 3/23/2016.
 */
public class InsertionSort {

    public void sortIntsert(int a[]){

        int key;
       for (int j =1; j<a.length;j++){
           key = a[j];
           int i =j-1;
           while(i>=0 && a[i]>key){
               a[i+1]=a[i];
               i=i-1;
               a[i+1]=key;
           }

       }


        for(int i=0;i<a.length;i++){

            System.out.println(a[i]);
        }


    }
}
