package com.company;

import java.util.Arrays;

/**
 * Created by Harsh P Vyas on 3/24/2016.
 */
public class SummationArray {

    public int summationx(int a[],int x){

        Arrays.sort(a);
        int i=0;
        int j=a.length-1;

        while(i<j){

            if(a[i] + a[j] == x) {
                System.out.println("Summation is"+a[i]+"+"+a[j]+"="+ x);
                return 1;
            }
            else if(a[i]+a[j]<=x)
                {    i++;
                    System.out.println("-------"+a[i] + a[j] +" "+i+" "+j);
                }

             else {
                    j--;
                    System.out.println("**********"+a[i]+" " + a[j] +" "+i+" "+j);
                }


            }

        System.out.println("No summation found");

        return 0;
        }


}

