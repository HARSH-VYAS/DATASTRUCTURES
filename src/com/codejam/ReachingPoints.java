package com.codejam;

/**
 * Created by Harsh P Vyas on 9/27/2016.
 */
public class ReachingPoints {

    public int gcd(int a, int b){
         while (a!=b){
                if(a>b)
                a=a-b;
        else
            b=b-a;
    }
    return a;
    }

    static String canReach(int a, int b, int c, int d){
        String answer = "No";
        //boolean flag = false;

        if(c==a && d==b)
            return "Yes";

        if(a==b){
            if(d%a==0 && c%a==0)
                return "Yes";
            else
                return "No";
        }

        if(c==a && d!=b){
            if(d%c==0)
                return "Yes";
            else
                return "No";
        }

        if(d==b && c!=a){
            if(c%d==0)
                return "Yes";
            else
                return "No";
        }

        if(c!=a && d!=b){
            boolean flag=true;
            while(flag){
                if(c==a){
                    if(d==b){
                        flag=false;
                        return "Yes";
                    }
                    else if(d<c){
                        flag= false;
                        return "No";
                    }
                }
                if(d==b){
                    if(c==a) {
                        flag = false;
                        return "Yes";
                    }
                    else if(c<d){
                        flag=false;
                        return "No";
                    }
                }
                if(c<d){
                    if(c<a || d<b){
                        flag=false;
                        return "No";
                    }
                    d-=c;
                }
                if(d<c){
                    if(c<a || d<b){
                        flag=false;
                        return "No";
                    }
                    c-=d;
                }
                if(c==d){
                    flag=false;
                    return "No";
                }
            }
        }
        return answer;
    }

}
