package com.company;

/**
 * Created by Harsh P Vyas on 3/24/2016.
 */
public class QuickSort {

    public int a[];
    public QuickSort(int a[]){
        this.a=a;

    }


    public void quickSort(int low, int high){

        int pivot = a[low];
        int i=low;
        int j=high;
        while(i<=j){

            while (pivot > a[i]){
                i = i + 1;
            }
            while (a[j] > pivot){
                j=j-1;
            }
            if (i <=j) {
                int temp = a[i];
                a[i] = a[j];
                a[j] = temp;
                i++;
                j--;
            }
        }
        if (low < j)
            quickSort(low, j);
        if (i < high)
            quickSort(i, high);

    }

    public  void printData(){
        for(int i=0;i<a.length;i++){
            System.out.println(a[i]);
        }
    }

}
