package com.company;

/**
 * Created by Harsh P Vyas on 3/23/2016.
 */
public class MergeSort {

    int a[];
    int b[];

    public MergeSort(int a[]){
        this.a = a;
        this.b = new int[a.length];
    }

    public void mergeSort(int low, int high){

        if(low<high){
            int mid = (int) Math.floor((low+high)/2);
            mergeSort(low,mid);
            mergeSort(mid+1,high);
            merge(low, mid, high);

        }


    }

    public void merge(int low, int mid,int high){

        int h = low;
        int c = low;
        int j=mid+1;

        while(h<=mid && j<=high){
            if(a[h]<= a[j]){
             b[c]=a[h];
             h++;
            }
            else{
                b[c]=a[j];
                j++;
            }
            c++;
        }
        
        if(h>mid){
            for(int k=j;k<=high;k++){
                b[c]=a[k];
                c++;
            }
        }
        else{
            for(int k=h;k<=mid;k++){
                b[c]=a[k];
                c++;
            }

        }

        for(int i=low;i<=high;i++ ){
            a[i]=b[i];
        }
    }

    public void priintData(){

        for(int i=0;i<a.length;i++){
            System.out.println(a[i]);
        }
    }


}
