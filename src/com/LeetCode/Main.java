package com.LeetCode;

/**
 * Created by Harsh P Vyas on 10/1/2016.
 */
public class Main {

    public static void main(String []args){
       /* FindSumIndex fsi = new FindSumIndex();
        int [] a = {3,2,4};
        int ar[]= fsi.findSum(a,6);
        for(int i=0;i<ar.length;i++){
            System.out.println(ar[i]);
        }*/

        LCA lca = new LCA();
        lca.findAncestor("Frank->Mary,Mary->Sam,Mary->Bob,Sam->Katie,Sam->Pete,Bob->John","Sam","Mary");
        lca.findAncestor("Sam->Pete,Pete->Nancy,Sam->Katie,Mary->Bob,Frank->Mary,Mary->Sam,Bob->John","Nancy","Katie");
    }

}
