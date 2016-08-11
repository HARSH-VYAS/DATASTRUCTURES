package com.company;

import java.util.ArrayList;

/**
 * Created by Harsh P Vyas on 8/6/2016.
 */
public class JollyJumper {

   /*
   A sequence of n numbers (n < 3000) is called Jolly Jumper if the absolute values of the differences
   between the successive elements take on all possible values from 1 through n-1.
   The definition implies that any sequence of a single integer is a jolly jumper.
   */

   public boolean jump(int arr[]){
       boolean tag = false;
       int temp [] = new int[arr.length];
       ArrayList<Integer> arrayList = new ArrayList<Integer>();
       for(int i =0;i<arr.length;i++){
           arrayList.add(i,arr[i]);
       }
       int i =1;
       while(i<arrayList.size()){
           int prev = arrayList.get(i-1);
           int curr = arrayList.get(i);
           temp[i]= Math.abs(prev-curr);
           i++;
       }
       i=1;
       while(i<temp.length){
           if(temp[i] == temp[i+1]);
       }


       return tag;
   }




}
