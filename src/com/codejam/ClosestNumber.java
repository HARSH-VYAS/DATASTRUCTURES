package com.codejam;

/**
 * Created by Harsh P Vyas on 10/15/2016.
 */
public class ClosestNumber {

        public static int checkNum(int a, int b, int x){


            int result = (int) Math.pow((double)a, (double)b);

            int div=0,z=0;
            int s = result % x;

            if(s<= (x/2))
                z = result - s;
            else
                z = result-(result%x);


            return z;
        }


}
