package com.codejam;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by Harsh P Vyas on 9/26/2016.
 */
public class GoodNode {

/*    public static int find(int[] parent, int x) {
        if(x == 0)
            return 0;

        if(parent[x] == -1 || parent[x] == x) {
            return x;
        }
        return find(parent, parent[x]);
    }

    public static void union(int[] parent, int x, int y) {
        int xp = find(parent, x);
        int yp = find(parent, y);
        parent[xp] = yp;
    }

    public static int minChanges(int[] A) {
        int n = A.length;
        int[] parent = new int[n];
        Arrays.fill(parent, -1);
        for(int i=0; i<n; i++) {
            union(parent, i, A[i]);
        }
        int cnt = 0;
        for(int i=1; i<n; i++) {
            if(find(parent, i) == i)
                cnt++;
        }
        return cnt;
    }

    public static void main(String args[] ) throws Exception {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int[] A = new int[n];
        for(int i=0; i<n; i++) {
            A[i] = s.nextInt()-1;
        }
        s.close();
        System.out.println(minChanges(A));
    }*/

    static int goodNodes(int[] points_to) {

        boolean goodNode[] = new boolean[points_to.length+1];
        int [] arr = new int [points_to.length+1];
        int count=0;

        for(int i=1;i<arr.length;i++){
            arr[i]=points_to[i-1];
            if(arr[i]==1)
                goodNode[i]=true;
        }
        for(int i=2;i<arr.length;i++){
            if(!goodNode[i])
            {
                if(goodNode[arr[i]]){
                    goodNode[i]=true;
                }
            }
           if(arr[i]==arr[arr.length-1] && !goodNode[i] && (i!=arr.length-1))
            {
                goodNode[arr.length-1]=true;
                goodNode[i]=true;
                count=1;
            }
        }
        for(int i=2;i<arr.length;i++ ){
            if(!goodNode[i])
            {
                if(!goodNode[arr[i]]){
                    goodNode[i]=true;
                    count++;
                }
                arr[i]=1;
                goodNode[i]=true;
            }
        }
        return count;
    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int a [] = new int[5];
        for(int i=0;i<a.length;i++){
            a[i]=sc.nextInt();
        }
        int count = goodNodes(a);
        System.out.println(count);
    }
}
