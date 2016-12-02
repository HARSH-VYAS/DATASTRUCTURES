package com.company;

import java.util.Stack;

/**
 * Created by Harsh P Vyas on 11/13/2016.
 */
public class MatchingParenthesis {

    public static boolean balancingBrackets(String s){

        Stack<Character> stack = new Stack<Character>();
        for(int i=0;i<s.length();i++){

            switch(s.charAt(i)){

                case '(':

                    stack.push(s.charAt(i));
                    break;

                case '{':

                    stack.push(s.charAt(i));
                    break;

                case '[':

                    stack.push(s.charAt(i));
                    break;

                case ')':

                    if(!stack.isEmpty()){

                        char c = stack.pop();
                        if(!(c=='(')) return false;
                    }
                    else return false;

                    break;

                case ']':

                    if(!stack.isEmpty()){

                        char c = stack.pop();
                        if(!(c=='[')) return false;
                    }
                    else return false;
                    break;

                case '}':

                    if(!stack.isEmpty()){

                        char c = stack.pop();
                        if(!(c=='{')) return false;
                    }
                    else return false;
                    break;

                default:

                    return false;

            }

        }


        if(stack.isEmpty())
            return true;
        else
            return false;
    }


    public String [] mainmethod(String s[]){
        String[] ans = new String[s.length];

        for(int i=0;i<s.length;i++){

            if(balancingBrackets(s[i]))
                ans[i]="YES";
            else
                ans[i]="No";

        }


        return ans;
    }


}
