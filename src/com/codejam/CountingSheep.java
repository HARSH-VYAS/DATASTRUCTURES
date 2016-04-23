package com.codejam;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * Created by Harsh P Vyas on 4/8/2016.
 */
public class CountingSheep {

    int input;
    int [] Case;
    int count;

    CountingSheep(){
        Scanner sc = new Scanner(System.in);
        this.input= sc.nextInt();
        this.Case = new int[input+1];
        for(int i=1;i<Case.length;i++){
            this.Case[i]= sc.nextInt();
        }
        count=0;
    }

    public void startCounting() {
        // ArrayList<Integer> arr = new ArrayList<Integer>();
        ExecutorService executor = Executors.newFixedThreadPool(10);
        for (int i = 1; i < Case.length; i++) {
            if (this.Case[i] == 0)
                System.out.println("Case#" + i + ": INSOMNIA");
            else {
                int N = Case[i];
                Runnable worker = new MyRunnable(N,i);
                /*
                int temp = N;
                int c = N;
                */
                executor.execute(worker);
            /*  while (arr.size() < 10) {
                    while (temp > 0) {
                        int k = temp %10;
                        temp = temp/10;
                        if(!arr.contains(k)){
                            arr.add(k);
                        }
                    }
                     N +=c;
                     temp=N;
                     count++;
                }
                System.out.println("Case#"+i+": "+ (N-c) );
                arr.clear();
            }*/
            }
        }
        executor.shutdown();
    }


    class MyRunnable implements Runnable{
        int N;
        int i;
        ArrayList<Integer> arr;
        MyRunnable(int N,int i){
            this.N = N;
            this.i=i;
            this.arr= new ArrayList<Integer>();
        }
        @Override
        public void run() {

            int temp = N;
            int c =N;
            while (arr.size() < 10) {
                while (temp > 0) {
                    int k = temp %10;
                    temp = temp/10;
                    if(!arr.contains(k)){
                        arr.add(k);
                    }
                }
                N +=c;
                temp=N;
                count++;
            }
            System.out.println("Case#"+i+": "+ (N-c) );
            arr.clear();
        }
    }


}
