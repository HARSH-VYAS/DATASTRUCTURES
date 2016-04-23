package com.company;

/**
 * Created by Harsh P Vyas on 3/28/2016.
 */
public class FindMissing {

    public void missingNumber(int a[]){
        int s=a[0];
        for(int i=1;i<a.length;i++){
            if(a[i]==(s+1)){
                s=a[i];
            }
            else{
                System.out.println("Missing number is"+(s+1));
                break;
            }
        }
    }
}
