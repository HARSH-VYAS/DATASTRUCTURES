package com.company;

/**
 * Created by Harsh P Vyas on 10/21/2016.
 */
public class GCDLCM {
    int c=0;
    public int findGCd(int a, int b){
        while(a!=0 && b!=0) {
            c = b;
            b = a % b;
            a = c;
        }
        return a+b;
    }
    // Recursive approach
    public int findGCD(int a, int b){
        if(b == 0) {
            return a;
        }
        return findGCD(b, a%b);
    }

    public int findLcm(int a, int b){
        return (a * b)/findGCD(a, b);
    }
}
