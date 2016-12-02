package com.company;

/**
 * Created by Harsh P Vyas on 11/3/2016.
 */
/*
*
* For a given string sentence, reverse it.
Input : Hello World
Output : Dlorw Olleh

Input: How Are You Doing Today
Output: Yadot Ginod Uoy Era Woh
*
*
*
* */


public class IBMStringReverse {

    public void reverseGiven(String s){
        char [] temp = s.toCharArray();
        int length = temp.length;
        boolean firstWord = false;
        for(int i=length-1;i>=0;i--){
            if(firstWord==false){
                System.out.print(String.valueOf(temp[i]).toUpperCase());
                firstWord=true;
            }
            else if(temp[i]==' '){
                firstWord=false;
                System.out.print(String.valueOf(temp[i]));
            }
            else{
                System.out.print(String.valueOf(temp[i]).toLowerCase());
            }
        }
    }


}
