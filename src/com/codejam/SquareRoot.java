package com.codejam;

/**
 * Created by Harsh P Vyas on 11/16/2016.
 */
public class SquareRoot {


    public int findSquareRoot(int start, int x){

        if(x==0 || x==1)
            return 1;

        int end = x;
        int mid =0,midSquare=0;

        while(start<=end) {
            mid = (start+end)/2;
            midSquare = mid * mid;
            if (midSquare == x)
                return mid;
            else if (midSquare > x) {
                end = mid - 1;
            } else {
                start = mid +1;
            }
        }
        return mid;
    }
}
