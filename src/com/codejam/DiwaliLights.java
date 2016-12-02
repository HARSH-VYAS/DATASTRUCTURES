package com.codejam;

import java.util.Scanner;

/**
 * Created by Harsh P Vyas on 11/16/2016.
 *
 */
public class DiwaliLights {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        long input[] = new long[t];

        for(int i=0;i<t;i++){
            input[i]=sc.nextLong();
        }

        double ans[] = new double[t];


        for(int i=0;i<ans.length;i++){
            ans[i]=1;
            if(input[i]<64)
                ans[i] = (double)( (Math.pow(2,input[i])% 100000)-1);
            if(input[i]==64)
                ans[i] = (double)( (Math.pow(2,64) % 100000)-1);
            else{
                    for(int j=0;j<input[i];j++){
                            ans[i]=ans[i]*2;
                            ans[i] %=100000;
                    }
                    ans[i]-=1;
                }



        }

        for(int i=0;i<ans.length;i++){
            System.out.println((int)ans[i]);
        }

    }



}
