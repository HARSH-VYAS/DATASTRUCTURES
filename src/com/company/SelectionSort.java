package com.company;

/**
 * Created by Harsh P Vyas on 3/23/2016.
 */
public class SelectionSort {

    public void sortingSelection(int a[]){

        for(int i=0;i<a.length;i++){
            int key =i;
            for(int j=a.length-1; j>i ; j--){
                if(a[j] < a[key]){
                    int temp = a[j];
                    a[j]=a[key];
                    a[key]=temp;
                }
            }
        }

        for(int i=0;i<a.length;i++){
            System.out.println(a[i]);
        }


    }

}
