package com.company;

import java.util.List;

/**
 * Created by Harsh P Vyas on 11/3/2016.
 */
interface MyInteger{
    public boolean isInteger();

}
public class NestedSumInteger {

    public int geSum(List<MyInteger> l, int level){
        int sum = 0;
        for(int i=0;i<l.size();i++){
            if(l.get(i).isInteger()){
              //  sum = sum + l.get(i).getInteger()*level;
            }
            else{

            }
        }

        return sum;
    }
}
