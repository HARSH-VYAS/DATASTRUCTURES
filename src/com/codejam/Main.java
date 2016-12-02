package com.codejam;

import com.company.GCDLCM;

import java.util.Scanner;

/**
 * Created by Harsh P Vyas on 4/8/2016.
 */
public class Main {

    public static void main(String [] args){

/*        CountingSheep c = new CountingSheep();
        c.startCounting();*/

        //Fractiles.permutation("abcd");

       /* LongestRepeatingString l = new LongestRepeatingString();
        int a = l.lengthOfLongestSubstring("!\\\"#$%&'()*+,-./:;<=>?@[\\\\]^_`{|}~ ");
        System.out.println(a);*/

/*        ClosestNumber c = new ClosestNumber();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int a[] = new int [n];
        int b[] = new int [n];
        int x[] = new int [n];
        int result[] = new int[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
            b[i]=sc.nextInt();
            x[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++){
            result[i] = c.checkNum(a[i],b[i],x[i]);
        }
        for(int i=0;i<result.lenPergth;i++){
            System.out.println(result[i]);
        }*/


     /*   CompareParagraphs cmp = new CompareParagraphs();
        //String s = cmp.compare("IBM is cognitive | IBM is \"cognitive\" computing emerging company.| IBM is    'cognitive computing emerging company'| IBM is   cognitive\" computing emerging company?");
         String s = cmp.compare(" IBM cognitive computing|IBM \"cognitive\" computing is a revolution| ibm cognitive computing|'IBM Cognitive Computing' is a revolution? ");
        System.out.println(s);*/


/*        Permutation p = new Permutation();
        StringBuilder output= p.comb2("abc");
        String a[] = output.toString().split("\\s");
        for(int i=0;i<a.length;i++){
            System.out.println(a[i]);
        }*/

       /* GCDLCM gcdlcm = new GCDLCM();
        int a =gcdlcm.findLcm(24,36);
        System.out.println(a);*/

        SquareRoot sq = new SquareRoot();
        System.out.println(sq.findSquareRoot(0,25));
    }
}
