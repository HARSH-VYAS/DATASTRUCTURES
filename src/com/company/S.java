package com.company;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * Created by Harsh P Vyas on 10/26/2016.
 */
public class S {


/*

    ArrayList<Integer> ans = new ArrayList<Integer>();

    HashMap<Integer,Integer> arrf = new HashMap<Integer,Integer>();
    HashMap<Integer,Integer> arrm = new HashMap<Integer,Integer>();


    for(int i=0;i<f.length;i++){

        if(arrf.containsKey(f[i])){
            arrf.put(f[i],arrf.get(f[i])+1);

        }
        else{
            arrf.put(f[i], 1);
        }

    }

    for(int i=0;i<m.length;i++){

        if(arrf.containsKey(m[i])){
            int value = arrf.get(m[i]);
            if(value!=0){
                if(arrm.containsKey(m[i])){
                    arrm.put(m[i],arrm.get(m[i])+1);
                }
                else{
                    arrm.put(m[i],1);
                }
                arrf.put(m[i],value-1);
            }

        }


    }


    Iterator it = arrm.entrySet().iterator();
    while (it.hasNext()) {
        Map.Entry pair = (Map.Entry)it.next();

        int values = (int) pair.getValue();
        for(int i=0;i<values;i++)
            ans.add((Integer) pair.getKey());

        it.remove(); // avoids a ConcurrentModificationException
    }


    Collections.sort(ans,Collections.reverseOrder());

    int[] answer = new int[ans.size()];

    for(int i =0;i<ans.size();i++){

        answer[i]=ans.get(i);
    }


    return answer;
*/

}
