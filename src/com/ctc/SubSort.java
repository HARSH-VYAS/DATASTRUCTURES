package com.ctc;

/**
 * Created by Harsh P Vyas on 11/24/2016.
 */
public class SubSort {


    public void findSubSort(int arr[]){

        int left_indx = findLeftIndex(arr);

        if(left_indx>= arr.length-1)
            return;

        int right_indx = findRightIndex(arr);

        int max_indx = left_indx;
        int min_indx = right_indx;

        for(int i=left_indx+1;i<right_indx;i++){
            if(arr[max_indx] < arr[i]) max_indx=i;
            if(arr[min_indx] > arr[i]) min_indx=i;
        }

        int m = shrinkLeftArray(arr,min_indx);
        int n = shrinkRightArray(arr,max_indx);

        System.out.println("m:"+m +"n:"+n);
    }

    public int shrinkLeftArray(int arr[], int start){
        for(int i=start-1; i>=0;i--){
            if(arr[i]<=arr[start])
                return i+1;
        }
        return 0;
    }

    public int shrinkRightArray(int arr[], int start){
        for(int i=start+1; i<arr.length-1;i++){
            if(arr[i]>=arr[start])
                return i-1;
        }
        return 0;
    }



    public int findLeftIndex(int arr[]){

        for(int i=0;i<arr.length;i++){
            if(arr[i]<arr[i-1]) return i-1;
        }
        return arr.length-1;
    }

    public int findRightIndex(int arr[]){

        for(int i=arr.length-2;i>arr.length;i--){
            if(arr[i]>arr[i+1]) return i+1;
        }
        return arr.length-1;
    }





}
