package com.company;

import java.util.Arrays;

/**
 * Created by Harsh P Vyas on 3/28/2016.
 */
public class ContinuousSum {


    void findContinuousSum(int a[]){

        int sum=a[0];
        int max=a[0];

        for(int i=1;i<a.length;i++){

            sum = Math.max(sum,sum+a[i]);
            max= Math.max(max,sum);


           /* if(sum<0)
                sum=0;
            else if(max < sum)
                max=sum;*/

        }

        System.out.println("Maximum sum is "+ max);

    }
}
