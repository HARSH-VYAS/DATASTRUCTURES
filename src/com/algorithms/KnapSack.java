package com.algorithms;

/**
 * Created by Harsh P Vyas on 4/1/2016.
 */
public class KnapSack {

    int v[];
    int w[];
    int W;

    KnapSack(int v[],int w[], int W){
        this.v=v;
        this.w=w;
        this.W=W;
    }

    public int DknapSack(){

        int max=0;
        int o[][] = new int [v.length][W+1];

        for(int i=0;i<o.length;i++){
            o[i][0]=0;
            o[0][i]=0;
        }

        for(int i=1;i<v.length;i++){
            for(int j=1;j<=W;j++){
                if(j-w[i]<0)
                    o[i][j]=o[i-1][j];
                else{
                    o[i][j]=Math.max(o[i-1][j],v[i]+o[i-1][j-w[i]]);
                }

                System.out.println("i: "+i+" j :"+j+" :"+o[i][j]);
                if(max<o[i][j])
                    max=o[i][j];

            }
        }


        return max;
    }


}
