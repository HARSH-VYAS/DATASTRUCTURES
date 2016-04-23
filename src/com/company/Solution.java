package com.company;

import java.text.DecimalFormat;

/**
 * Created by Harsh P Vyas on 3/20/2016.
 */
public class Solution{

        public static double summations(int a[],int b[]){

            double sum=0;
            for(int i=0;i<a.length;i++){

                sum += a[i]*b[i];
            }
            return sum;
        }

        public static double summation(int a[]){

            double sum=0;
            for(int i=0;i<a.length;i++){

                sum+=a[i];
            }
            return sum;
        }
        public static double summationsq(int a[]){

            double sum=0;
            for(int i=0;i<a.length;i++){

                sum+=a[i]*a[i];
            }
            return sum;
        }


        static String[] Correlation(String[] scores) {

            String result[] = new String [3];
            int M[] = new int [scores.length];
            int P[] = new int [scores.length];
            int C[] = new int [scores.length];
            int n = scores.length;
            double denom,nume;
            double ans ;
            DecimalFormat df = new DecimalFormat("#.00");

            String temp[]  = new String [3*scores.length];
            int j=0;
            for(int i=0;i<scores.length;i++){
                int z=0;
                temp = scores[i].split("\\s+");

                M[j] = Integer.parseInt(temp[z]);
                P[j] = Integer.parseInt(temp[z+1]);
                C[j] = Integer.parseInt(temp[z+2]);

                j++;
            }

            for(int i=0;i<temp.length;i++){
                System.out.println("Scores:"+temp[i]);
            }

            nume = (n * summations(M,P)) - (summation(M)*summation(P));
            denom = (Math.sqrt(n* summationsq(M)- (summation(M)*summation(M)))) * (Math.sqrt(n* summationsq(P)- (summation(P)*summation(P))));

            ans = nume/denom;

            System.out.println(nume);
            System.out.println(denom);
            System.out.println(ans);



            result[0] = String.valueOf(Double.valueOf(df.format(ans)));

            nume = (n * summations(M,C)) - (summation(M)*summation(C));
            denom = (Math.sqrt(n* summationsq(M)- (summation(M)*summation(M)))) * (Math.sqrt(n* summationsq(C)- (summation(P)*summation(C))));



            ans = nume/denom;

            System.out.println(nume);
            System.out.println(denom);
            System.out.println(ans);

            result[2]=String.valueOf(Double.valueOf(df.format(ans)));

            nume = (n * summations(C,P)) - (summation(C)*summation(P));
            denom = (Math.sqrt(n* summationsq(C)- (summation(C)*summation(C)))) * (Math.sqrt(n* summationsq(P)- (summation(P)*summation(P))));

            ans = nume/denom;


            System.out.println(nume);
            System.out.println(denom);
            System.out.println(ans);

            result[1] =String.valueOf(Double.valueOf(df.format(ans)));

            return result;
        }

}
