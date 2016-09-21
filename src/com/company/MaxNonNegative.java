package com.company;

import java.util.ArrayList;

/*
Find out the maximum sub-array of non negative numbers from an array.
The sub-array should be continuous. That is, a sub-array created by choosing the second and fourth element and skipping the third element is invalid.
Maximum sub-array is defined in terms of the sum of the elements in the sub-array. Sub-array A is greater than sub-array B if sum(A) > sum(B).

Example:
A : [1, 2, 5, -7, 2, 3]
The two sub-arrays are [1, 2, 5] [2, 3].
The answer is [1, 2, 5] as its sum is larger than [2, 3]
NOTE: If there is a tie, then compare with segment's length and return segment which has maximum length
NOTE 2: If there is still a tie, then return the segment with minimum starting index

*/
public class MaxNonNegative {
    long max =0;
    long max1=0;
    int startIdx =0;
    int startIdx1=0;
    boolean isInitialised = true;
    public ArrayList<Integer> maxset(ArrayList<Integer> a) {
        ArrayList<Integer> result = new ArrayList<Integer>();
        ArrayList<Integer> result1 = new ArrayList<Integer>(); // Past arraylist to track the sum of past element.
        for(int i=0;i<a.size();i++){
            if(a.get(i)>=0){
                if(max==0 && result.size()==0 && isInitialised){
                    startIdx=i;
                    isInitialised = false; //Initializing the starting index;
                }
                max=max+a.get(i);
                result.add(a.get(i));
            }
            else{
                if(max1<=max){
                    max1=max;
                    startIdx1=startIdx;
                    max=0;
                    result1 = (ArrayList<Integer>)result.clone();
                    result.clear();
                    startIdx=0;
                    isInitialised = true;
                }
                else{
                    max=0;
                    result.clear();
                    startIdx=0;
                    isInitialised = true;
                }
            }
        }
        if(max==max1)
        {
            if(result1.size() < result.size() && (result.size()!=0 || result1.size()!=0)) // To check whether all the elements in the arraylist are negative or not
                return result;
            else if(result.size()== result1.size() && (result.size()!=0 || result1.size()!=0)){ // To check whether all the elements in the arraylist are negative or not
                if(startIdx < startIdx1)
                    return result;
                else
                    return result1;
            }
            else{
                return result1;
            }
        }
        else if(max>max1)
            return result;
        else{
            return result1;
        }

    }
}
