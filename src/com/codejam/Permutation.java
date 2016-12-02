package com.codejam;

/**
 * Created by Harsh P Vyas on 10/21/2016.
 */
public class Permutation {

   /* private StringBuilder output = new StringBuilder();
    String inputstring;
   *//* Permutation(String s){
        this.inputstring=s;
    }*/


  public static void permutation(String str) {
        permutation("", str);
    }

    private static void permutation(String prefix, String str) {
        int n = str.length();
        if (n == 0)
            System.out.println(prefix);
        else {
            for (int i = 0; i < n; i++)
                permutation(prefix + str.charAt(i), str.substring(0, i) + str.substring(i+1, n));
        }
    }

    static StringBuilder output= new StringBuilder();
    public static StringBuilder comb2(String s) {
        output = comb2("", s);
        return output;
    }
    private static StringBuilder comb2(String prefix, String s) {

        output.append(prefix+" ");
        for (int i = 0; i < s.length(); i++)
            comb2(prefix + s.charAt(i), s.substring(i + 1));

        return output;
    }




}
