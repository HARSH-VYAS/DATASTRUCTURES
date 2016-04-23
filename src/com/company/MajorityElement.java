package com.company;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

/**
 * Created by Harsh P Vyas on 3/24/2016.
 */
public class MajorityElement {


    public void majorityElement(int a[]){


        Arrays.sort(a);
        int count=0;
        HashMap<Integer,Integer> map = new HashMap<Integer, Integer>();

        for(int i=0;i<a.length;i++){
            if(map.containsKey(a[i])){
                Integer integer = map.get(a[i])+1;
                map.put(a[i],integer);
                if(map.get(a[i])>(a.length/2)){
                    System.out.println("Found"+a[i]);
                    count=1;
                    break;
                }
            }
            else{
                map.put(a[i],1);
            }
        }

        if(count!=1){
            System.out.println("None");
        }


        }



}
