package com.ctc;

import java.util.Arrays;

/**
 * Created by Harsh P Vyas on 9/19/2016.
 */
public class CheckPermutation {

    public String sorting(String s){
        char [] arr =  s.toCharArray();
        Arrays.sort(arr);
        return new String(arr);
    }

    public void permutation(String s, String t){
        if(s.length()!=t.length())
            System.out.println(false);
        System.out.println(sorting(s).equals(sorting(t)));
    }


}
