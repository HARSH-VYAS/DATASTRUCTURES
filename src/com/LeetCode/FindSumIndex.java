package com.LeetCode;

import java.util.*;

/**
 * Created by Harsh P Vyas on 10/1/2016.
 */
public class FindSumIndex {
/*
Given nums = [2, 7, 11, 15], target = 9,
Because nums[0] + nums[1] = 2 + 7 = 9,
return [0, 1].
 */

    public int [] findSum(int a[], int target){
        HashMap<Integer, Integer> hashMap = new HashMap<Integer, Integer>();
        int key;
        int []arr = new int [2];
        for(int i=0;i<a.length;i++){
            key = target-a[i];
            System.out.println(key);
            if(hashMap.containsKey(key)){
              System.out.println("Reached");
              arr[0]= hashMap.get(key);
              arr[1]= i;
              break;
            }
            else{
                System.out.println("Adding"+a[i]+" "+i);
                hashMap.put(a[i],i);
            }
        }
        return arr;
    }

}
