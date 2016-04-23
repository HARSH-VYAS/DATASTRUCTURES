package com.company;

/**
 * Created by Harsh P Vyas on 3/24/2016.
 */
public class ThreadingSample implements Runnable {

    int a[];
    ThreadingSample(){
        a = new int[]{1, 2, 3, 4, 5, 6, 7, 7, 8, 8, 9, 9, 0};
    }

    @Override
    public void run() {

        try{

            for(int i=0;i<a.length;i++) {
                Thread.sleep(2);
                /*printMessage(a[i]);*/
                System.out.println(" Thread:::::"+Thread.currentThread().getName()+"---------"+ a[i]);
            }
        }
        catch (InterruptedException e){
            e.printStackTrace();
        }

        System.out.println("Thread " +  Thread.currentThread().getName() + " exiting.");

    }



}
