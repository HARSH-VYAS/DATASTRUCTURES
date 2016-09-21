package com.ctc;

import java.util.Arrays;

/**
 * Created by Harsh P Vyas on 9/19/2016.
 */
public class UniqueChar {

    // mine
    public void identify(String a){
        char arr [] = a.toCharArray();
        char c=' ';
        boolean flag = true;
        Arrays.sort(arr);
        for(int i=0,j=1;i<arr.length && j<arr.length-1;i++,j++){
            if(arr[i]==arr[j]){
                flag=false;
                c=arr[i];
                 break;
            }
        }
        if(!flag)
            System.out.println("Not all unique Characters this  is repeating "+c);
        else
            System.out.println("All unique Characters");
    }

    // cracking the code

    public void iidentify(String b){

        if(b.length()>128)
                return;
        boolean isChar [] = new boolean[128];
        for(int i=0;i<b.length();i++){
            int val = b.charAt(i);
            if(isChar[val])
                break;
            else
                isChar[val]=true;
        }

    }

}
