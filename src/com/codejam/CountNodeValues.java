package com.codejam;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;

/**
 * Created by Harsh P Vyas on 8/20/2016.
 */
public class CountNodeValues {

    public int [] countPath(int []a){
        int length = a.length;
        if(length==0)
            return new int[]{Integer.MIN_VALUE};
        int capital = 0;
        int [] out = new int[length];
        HashMap<Integer,LinkedList<Integer>> hashMap = new HashMap<Integer,LinkedList<Integer>>();
        for(int i=0;i<length;i++){
            if(i==a[i])
                capital = a[i];
            LinkedList<Integer> list= hashMap.get(i);
            list.add(a[i]);
            hashMap.put(i,list);
        }

        return out;
    }
}
