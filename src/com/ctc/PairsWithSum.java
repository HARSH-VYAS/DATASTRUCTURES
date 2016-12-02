package com.ctc;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * Created by Harsh P Vyas on 11/23/2016.
 * Time complexity O(n) and Space complexity O(n)
 */
public class PairsWithSum {

    public class Pair{
        int key,value;
        Pair(int key,int value){
            this.key=key;
            this.value=value;
        }
    }

    ArrayList<Pair> result = new ArrayList<Pair>();
    HashMap<Integer,Integer> hashMap = new HashMap<Integer, Integer>();

    public ArrayList<Pair> findSum(int  sum, int arr[]){
        int s = 0;
        for(int x :arr) {
            int complement = sum - x;
            if (hashMap.getOrDefault(complement, 0) > 0) {
                result.add(new Pair(x, complement));
                hashMap.put(x, hashMap.getOrDefault(x, 0) - 1);
            } else {
                hashMap.put(x, 1);
            }

        }
        return result;
    }

}
