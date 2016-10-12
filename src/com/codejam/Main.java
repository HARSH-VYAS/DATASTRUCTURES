package com.codejam;

/**
 * Created by Harsh P Vyas on 4/8/2016.
 */
public class Main {

    public static void main(String [] args){

/*        CountingSheep c = new CountingSheep();
        c.startCounting();*/

        //Fractiles.permutation("abcd");

        LongestRepeatingString l = new LongestRepeatingString();
        int a = l.lengthOfLongestSubstring("!\\\"#$%&'()*+,-./:;<=>?@[\\\\]^_`{|}~ ");
        System.out.println(a);
    }
}
