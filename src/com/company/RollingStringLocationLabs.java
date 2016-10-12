package com.company;

import jdk.nashorn.internal.runtime.regexp.joni.encoding.CharacterType;

/**
 * Created by Harsh P Vyas on 9/26/2016.
 */
public class RollingStringLocationLabs {

    public static String rolling(String s, String[] opration){

        int no_op = Integer.parseInt(opration[0]);

        int x[] = new int[no_op];
        int y[] = new int[no_op];
        char op[] = new char[no_op];
        char[] str = s.toCharArray();
        int temp=0;
        int index=0;
        for(int i=0;i<opration.length-1;i=i+3){

            temp = Integer.parseInt(opration[i+1]);
            x[index] = temp;
            temp = Integer.parseInt(opration[i+2]);
            y[index] = temp;
            op[index] = opration[i+3].charAt(0);
            index++;
        }

        for(int i=0;i<x.length;i++){

            if(op[i]=='R'){

                for(int j=x[i];j<=y[i];j++){

                    if(str[j]=='z')
                        str[j] = 'a';
                    else {


                        System.out.println(str[j]);
                        str[j] = (char) (str[j] + 1);
                        System.out.println(str[j]);

                    }
                }

            }
            else if(op[i]=='L'){

                for(int j=x[i];j<=y[i];j++){

                    if(str[j]=='a')
                        str[j] = 'z';
                    else {
                        System.out.println(str[j]);
                        str[j] = (char) (str[j] - 1);
                        System.out.println(str[j]);

                    }
                }

            }

            System.out.println("After Loop "+i);
            System.out.println(str);
        }

        return new String(str);

    }



    public static void main(String arg[]){

        String[] opration = new String[]{"3","0","0","L","2","2","L","0","2","R"};
        String ans= rolling("abc",opration);
        System.out.println("Answer is: "+ans);
    }


}
