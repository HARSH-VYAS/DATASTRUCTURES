package com.company;

import java.util.ArrayList;

/**
 * Created by Harsh P Vyas on 12/4/2016.
 */
public class FunWithPalindrome {


    static int funPal(String s) {

        ArrayList<Integer> result = new ArrayList<Integer>();
       /* ArrayList<String> array1 = new ArrayList<String>();
        ArrayList<String> array2 = new ArrayList<String>();*/


        int length = s.length();
        String arr1[] = new String[length];
        String arr2[] = new String[length];
        for(int i=1;i<length;i++){
            System.out.println(s.substring(0,i));
            System.out.println(s.substring(i+1,length));
           /* array1.add(s.substring(0,i));

            array2.add(s.substring(i+1,length-1));*/

            arr1[i] = s.substring(0, i);
            arr2[i] = s.substring(i,length);

            System.out.println("i: "+i+" "+arr1[i]);
            System.out.println("i: "+i+" "+arr2[i]);

           /* System.out.println("i: "+i+" "+array1.get(i));
            System.out.println("i: "+i+" "+array2.get(i));

            int res1 = funPal(array1.get(i),0,array1.get(i).length()-1);
            int res2 = funPal(array2.get(i),0,array2.get(i).length()-1);
*/

            int res1 = funPal(arr1[i],0,arr1[i].length()-1);
            int res2 = funPal(arr2[i],0,arr2[i].length()-1);
            System.out.println(res1*res2);

            result.add(res1*res2);

        }

        int max =0;

        for(int i=0;i<result.size();i++){
            if(max<result.get(i))
                max=result.get(i);
        }
        return max;
    }

    static int funPal(String s, int left , int right){

        if(left > right) return 0;
        if(left == right) return 1;

        if(s.charAt(left)== s.charAt(right)){
            int result = funPal(s,left+1,right-1)+2;
            return result;
        }

        int leftPaliLen = funPal(s,left+1,right);
        int rightPaliLen = funPal(s,left,right-1);

        if(leftPaliLen > rightPaliLen)
            return leftPaliLen;

        return rightPaliLen;

    }


    static void splitString(String s){
        String temp [] = s.split("\\t");
        for(int i=0;i<temp.length;i++){
            System.out.println("i:"+i+":"+temp[i]);
        }

    }


}
