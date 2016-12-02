package com.codejam;

import java.math.BigInteger;
import java.util.Scanner;

/**
 * Created by Harsh P Vyas on 11/16/2016.
 */
public class SummingTheNSeries {


    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        BigInteger[] input = new BigInteger[N];
        for(int i=0;i<N;i++){
            input[i]= sc.nextBigInteger();
        }
        BigInteger sum;
        for(int i=0;i<N;i++){
            sum = input[i].multiply(input[i]);
            System.out.println((sum.mod(BigInteger.valueOf(1000000000+7))));

        }


    }


}
