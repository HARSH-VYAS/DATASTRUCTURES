package com.ctc;

import java.util.Collection;
import java.util.HashMap;

/**
 * Created by Harsh P Vyas on 9/20/2016.
 */
public class PermutationPalindrome {

    public void permPali(String S){
        S = S.replaceAll("\\s","");
        char [] a = S.toCharArray();
        HashMap<Character,Integer> hashMap = new HashMap<Character, Integer>();
        for(int i=0;i<a.length;i++){
            if(!hashMap.containsKey(a[i])){
                hashMap.put(a[i],1);
            }
            else{
                int count = hashMap.get(a[i]);
                hashMap.replace(a[i],count,count+1);
            }
        }
        int countO =0;
        Collection<Integer> arr = hashMap.values();
        for(Integer i : arr){
            if(i%2!=0)
                countO++;
        }
        if(countO>1)
            System.out.println("The string is not Permutaion of any Palindrome");
        else
            System.out.println("The string is Permutation of Palindrome");

    }
}
