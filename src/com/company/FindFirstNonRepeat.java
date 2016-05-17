package com.company;

import java.util.HashMap;


/**
 * Created by Harsh P Vyas on 4/30/2016.
 */
public class FindFirstNonRepeat {

    HashMap<Character, Integer> map = new HashMap<Character, Integer>();
    String str = null;

    FindFirstNonRepeat(String str){
        this.str=str;
    }

    public void firstOccur(){
        int size = str.length();
        char [] strar = str.toCharArray();
        int j=0;
        for(int i=0;i<size;i++){
            if(map.containsKey(strar[i])){
                map.put(strar[i],map.get(strar[i])+1);
            }
            else{
                map.put(strar[i],1);
            }
        }

        for(int i=0;i<size;i++){
            if(map.get(strar[i])==1){
                System.out.println("First non repeat is "+strar[i]);
                break;
            }
        }


    }



}
