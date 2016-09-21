package com.ctc;

import java.util.HashMap;

/**
 * Created by Harsh P Vyas on 9/20/2016.
 */
public class StringCompression {

    public String compress(String s){
        char [] arr = s.toCharArray();
        int count=0;
        String output = null;
        for(int i=0;i<arr.length;i++){
            count+=1;
            if((i+1)>arr.length||arr[i]!=arr[i+1]){
                output+=""+arr[i]+count;
                count=0;
            }
        }
        return output.length()<s.length()?output:s;
    }

    public String compressB(String s){

        StringBuilder stringBuilder = new StringBuilder();
        int count=0;

        for(int i=0;i<s.length();i++){
            count+=1;
            if((i+1)>=s.length() || s.charAt(i)!=s.charAt(i+1)){
                stringBuilder.append(s.charAt(i));
                stringBuilder.append(count);
                count=0;
            }
        }
        return stringBuilder.toString();
    }

}
