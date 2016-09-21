package com.ctc;

/**
 * Created by Harsh P Vyas on 9/21/2016.
 */
public class RotationString {

    public boolean checkRotation(String s1, String s2){
        if(s1.length()!=s2.length() || s1==null ||s2==null) return false;
        String s1s1= s1+s1;

       return  s1s1.contains(s2);
    }
}
