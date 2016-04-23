package com.company;

import java.util.Arrays;

/**
 * Created by Harsh P Vyas on 3/30/2016.
 */
public class ReverseArray {

    int start,end;
    public void reverseA(int a[]){
        start=0;
        end =a.length-1;
         while(start<end){
             int temp = a[start];
             a[start]=a[end];
             a[end]=temp;
             end--;
             start++;
         }

        for(int i=0;i<a.length;i++){
            System.out.println(a[i]);
        }


    }

    public void reverseA(String a){

        char a1[] = a.toCharArray();
        start=0;
        end =a.length()-1;
        while(start<end){
            char temp = a1[start];
            a1[start]=a1[end];
            a1[end]=temp;
            end--;
            start++;
        }

        System.out.println(a1);


    }
}
