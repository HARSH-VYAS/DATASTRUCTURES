package com.company;
import java.lang.*;

/**
 * Created by Harsh P Vyas on 3/19/2016.
 */
public class BinaryGap {

    // you can also use imports, for example:
// import java.util.*;

// you can write to stdout for debugging purposes, e.g.
// System.out.println("this is a debug message");

        public int solution(int N) {
            // write your code in Java SE 8

            String no = Integer.toBinaryString(N);
            String[] s = no.split("1");
            int max=0;
            System.out.println(no);
            if(N==1)
                return 0;
            else if (N==0)
                return 0;
            else {
                for (int i = 0; i < s.length; i++) {
                    System.out.println("length" + s.length + "---------------------" + s[i]);
                    if (s[i].length() > max && i!=s.length-1)
                        max = s[i].length();
                    else{
                        if(!s[i].contains("0"))
                        {
                            if(s[i].length()>max){
                                max=s[i].length();
                            }

                        }

                    }
                }
            }
            System.out.println("Maximum is"+max);
            return max;

        }
}
