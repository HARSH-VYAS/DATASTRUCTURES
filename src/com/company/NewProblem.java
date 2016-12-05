package com.company;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by Harsh P Vyas on 12/4/2016.
 */
public class NewProblem {

    public static void main(String [] args){

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        String arr[] = new String[N+1];
        float [] prices = new float[N+1];
        ArrayList<Float> output = new ArrayList<Float>();

        for(int i=0;i<=N;i++){
            arr[i] = sc.nextLine();

        }

        for(int i=1;i<=N;i++){

            String temp[] = arr[i].split("\\t+");

            if(temp[1].contains("Missing"))
                prices[i] = 0;
            else
                prices[i] = Float.parseFloat(temp[1]);

            if(prices[i]==0 && i==0 ){
                prices[i] = prices[i+1] - (int)Math.random();
                System.out.println(prices[i]);
            }

            if(prices[i]==0 && i==N ){
                prices[i] = prices[i-1] + (int)Math.random();
                System.out.println(prices[i]);
            }

            if(prices[i]==0 && (i!=0 || i!=N)){
                System.out.println("i-1"+ (i-1)+" "+prices[i-1] +" i+1"+(i+1)+" "+ prices[i+1]);
                prices[i] = (prices[i-1] + prices[i+1])/2;
                System.out.println(prices[i]);
            }

        }



    }


}
