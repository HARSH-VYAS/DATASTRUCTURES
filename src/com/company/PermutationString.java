package com.company;

/**
 * Created by Harsh P Vyas on 3/31/2016.
 */
public class PermutationString {

    String a;
    char arr[];
    PermutationString(String a)
    {
        this.a = a;
    }
    public void swap(char a, char b){
        char temp=a;
        a=b;
        b=a;
    }

    public void permute(String a, int l, int r){
       arr=a.toCharArray();
        if(l==r)
            System.out.println("Output is"+ arr);

        for(int i=l;i<r;i++){
            swap(arr[l],arr[i]);
            permute(arr.toString(),l+1,r);
            swap(arr[l],arr[i]);
        }

    }






}
