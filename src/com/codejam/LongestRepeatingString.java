package com.codejam;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * Created by Harsh P Vyas on 10/11/2016.
 */
public class LongestRepeatingString {

    public int lengthOfLongestSubstring(String s) {
        char a [] = s.toCharArray();
        char repeat=' ';
        int count=0;
        int j=0;
        int max =0;
        HashMap<Character,Integer> hashMap = new HashMap<Character,Integer>();

        while(j<a.length){
            for(int i=j;i<a.length;i++){
                repeat = a[i];
                if(!hashMap.containsKey(a[i])){
                    hashMap.put(a[i],i);

                    count++;
                    j++;
                    if(max<count)
                        max=count;
                    if(max==256)
                        return max;
                }
                else{
                    count=0;
                    j=hashMap.get(repeat)+1;
                    hashMap.clear();

                    break;
                }
            }
        }

        return max;
    }
}
