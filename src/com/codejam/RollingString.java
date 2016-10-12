package com.codejam;

/**
 * Created by Harsh P Vyas on 9/27/2016.
 */
public class RollingString {


   public String solution(String s , String [] operations){
    int no_op=operations.length;
    int x[] = new int[no_op];
    int y[] = new int[no_op];
    String op[] = new String[no_op];
    char[] str = s.toCharArray();
    String[] te =null;
    for(int i=0;i<operations.length;i++){

        te = operations[i].split(" ");
        x[i] = Integer.parseInt(te[0]);
        y[i] = Integer.parseInt(te[1]);
        op[i] = te[2];

    }

    for(int i=0;i<x.length;i++){

        if(op[i].equals("R")){

            for(int j=x[i];j<=y[i];j++){

                if(str[j]=='z')
                    str[j] = 'a';
                else {
                    str[j] = (char) (str[j] + 1);
                }
            }

        }
        else if(op[i].equals("L")){

            for(int j=x[i];j<=y[i];j++){

                if(str[j]=='a')
                    str[j] = 'z';
                else {
                    str[j] = (char) (str[j] - 1);

                }
            }

        }
    }

    return new String(str);
   }
}
