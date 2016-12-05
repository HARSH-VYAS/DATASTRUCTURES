package com.company;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * Created by Harsh P Vyas on 12/2/2016.
 * You are given an array of positive and negative integers.
 * If a number n at an index is positive, then move forward n steps. Conversely,
 * if it's negative, move backward n steps. Determine if there is a loop in this array.

 For example, given the array [2, -1, 1, 2, 2], index 0 maps to index 2, 1 maps to 0, 2 maps to 3, and so on.
 There is a loop in this array because 0 maps to 2, 2 maps to 3, and 3 maps to 0 (use the modulo operator).

 - shreydesai@utexas.edu October 29, 2016 in United States | Report Duplicate | Flag
 */
public class FindCycleInArray {

    ArrayList<Integer> arrayList = new ArrayList<Integer>();

    public boolean findCycle(int a[]){
        arrayList.add(0);

        for(int i=0;i<a.length;){
            int value = (i+a[i])% a.length;
            System.out.println("Value" + value);
            if(arrayList.contains(value)){
                return true;
            }
            else{
                System.out.println("At index"+value);
                arrayList.add(value);
            }
            i=value;
            System.out.println("New i"+ i);
        }

        return false;
    }


}
