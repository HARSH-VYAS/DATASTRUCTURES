package com.codejam;

import java.util.Scanner;

/**
 * Created by Harsh P Vyas on 4/9/2016.
 */
public class Fractiles {
    int t;
    int k,c,s;

    Fractiles(){
        Scanner sc = new Scanner(System.in);
        t=sc.nextInt();
        k=sc.nextInt();
        c=sc.nextInt();
        s=sc.nextInt();
    }

    public static void permutation(String str) {
        permutation("", str);
    }

    private static void permutation(String prefix, String str) {
        int n = str.length();
        if (n == 0)
            System.out.println(prefix);
        else {
            for (int i = 0; i < n; i++){
                System.out.println(prefix + str.charAt(i)+"--,---"+ str.substring(0, i) + str.substring(i + 1, n));
                permutation(prefix + str.charAt(i), str.substring(0, i) + str.substring(i+1, n));
            }
        }
    }

}
