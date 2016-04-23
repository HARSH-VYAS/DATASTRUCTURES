package com.company;

/**
 * Created by Harsh P Vyas on 3/30/2016.
 */
public class RotateArray {

    /* TO right rotate it divide the array in two parts like we are given
        a[1,2,3,4,5,6,7,8,9] and n=3 so a[1,2,3,4,5,6]  and [7,8,9]
        reverse first part [6,5,4,3,2,1,7,8,9]
        reverse second part[6,5,4,3,2,1,9,8,7]
        reverse whole array[7,8,9,1,2,3,4,5,6]
    */
    int a[];
    RotateArray(int a[]){
    this.a=a;
    }
    public void rotate(int n){


       if(a==null){
           System.out.println("Null array");
           return;
       }
        reverse(a,0,a.length-n-1);
        reverse(a,a.length-n,a.length-1);
        reverse(a,0,a.length-1);
    }

    public void reverse(int a[], int start, int end){
        int temp;
        while(start<end){
            temp=a[start];
            a[start]=a[end];
            a[end]=temp;
            start++;
            end--;
        }
    }

    public void printArray(){
        for(int i=0;i<a.length;i++){
            System.out.println(a[i]);
        }
    }

}
