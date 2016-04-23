package com.company;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * Created by Harsh P Vyas on 3/9/2016.
 */
public class StringReverse {
    ArrayList<Integer> arrayList = new ArrayList<Integer>();
    HashMap<Integer, Integer> common = new HashMap<Integer, Integer>();

    public void reverseString(String s) {
        char[] a = s.toCharArray();
        char[] r = new char[s.length()];
        int count = 0;
        for (int i = s.length() - 1; i >= 0; i--) {
            r[i] = a[count];
            count++;
        }
        System.out.println(r);
    }

    public void findDuplicate(int a[]) {
        for (int i = 0; i < a.length; i++) {
            if(common.containsKey(a[i])){
                if(!arrayList.contains(a[i]))
                    arrayList.add(a[i]);
            }
            else
               common.put(a[i], null);
        }

        for(int i=0;i<arrayList.size();i++){
            System.out.println(arrayList.get(i));
        }

    }

}