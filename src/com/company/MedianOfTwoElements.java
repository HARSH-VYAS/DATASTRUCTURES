package com.company;

/**
 * Created by Harsh P Vyas on 3/30/2016.
 */
public class MedianOfTwoElements {

    public void findMedian(int a[],int b[]){

        int count = 0;
        int i=0,j=0;
        float m1=0,m2 = 0;
         while(count<=a.length){

             if((a.length==0) && (b.length==0)){
                 System.out.println("Null arrays");
             }

             else if(a[i]<b[j]){
                 m1= m2;
                 m2=a[i];
                 i++;
                count++;

             }

             else{
                 m1= m2;
                 m2=b[j];
                 j++;
                 count++;

             }

         }

        System.out.println("Median is :"+ (m1+m2)/2);


    }
}
