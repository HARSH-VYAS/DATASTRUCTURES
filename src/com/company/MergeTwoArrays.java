package com.company;

/**
 * Created by Harsh P Vyas on 3/30/2016.
 */
public class MergeTwoArrays {

    Integer N[];
    Integer MN[];

    MergeTwoArrays(Integer n[],Integer mn[]){
        this.N=n;
        this.MN=mn;
    }
    public void merge(){
        int n = N.length;
        int mn= MN.length;
        int k=0;
        int j=0;
        while(k<(mn) && j<n){

          if(MN[k]!=null) {
              if ((k < mn) && MN[k] >= N[j]) {
                  MN[k] = N[j];
                  k++;
                  j++;
              }
              k++;
          }
          else {
              MN[k] = N[j];
              k++;
              j++;
          }
        }

// If the condition is two merge only two arrays not based on the null positions uncomment this loop.
      /*  int i=k;
        while(k<mn){

            if(MN[k]!=null){
                MN[i]=MN[k];
                i++;
            }
             k++;
        }
*/

    }

    public void printArray(){
        for(int i=0;i<MN.length;i++){
            System.out.println("element"+i+":"+MN[i]);
        }
    }

}
