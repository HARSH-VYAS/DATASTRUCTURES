package com.company;
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;


/**
 * Created by Harsh P Vyas on 11/13/2016.
 */
public class TwitterParseExpressionTree {


        public static void main(String args[] ) throws Exception {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT */
            Scanner sc = new Scanner(System.in);
            String expression = null;
            // Main logic goes in this while loop

            while(sc.hasNext()){

                expression = sc.nextLine();
                expression = expression.replaceAll("\\s+","");

                int i = expression.indexOf("/");

                String operation = expression.substring(i + 1, expression.length());

                expression = expression.substring(0,i);
                simplyfyOperationcv(expression,operation);
            }

        }


        public static void simplyfyOperationcv(String expression, String operation){

            operation= operation.replaceAll("([S])(\\1{1,})", "$1");
            operation= operation.replaceAll("([R])(\\1{1})", "");

            char [] operations = operation.toCharArray();
            int length = operations.length;

            for(int i=0;i<length;i++){

                if(operations[i]=='R'){
                   String output= reverse(expression);
                    System.out.println(output);
                }

                else if(operations[i]=='S'){
                    String output= simplify(expression);
                    System.out.println(output);
                }
            }


        }


        public static String reverse(String expression){

            String newExpression = new StringBuilder(expression).reverse().toString();
            newExpression = newExpression.replaceAll("\\(","\\[");
            newExpression = newExpression.replaceAll("\\)","\\]");
            newExpression = newExpression.replaceAll("\\[","\\)");
            newExpression = newExpression.replaceAll("\\]","\\(");

            return newExpression;

        }



        public static String simplify(String expression){
            Stack<Character> stack = new Stack<Character>();
            int length = expression.length();
            char [] temp = expression.toCharArray();
            String output= new String();
            String reverse = new String();
            ArrayList<Character> arrayList = new ArrayList<Character>();

            for(int i=0;i<length;i++){
                if(temp[i]==')'){

                    while(stack.peek()!='('){
                          reverse +=stack.pop();
                    }

                    char c=' ';
                    if(!stack.isEmpty())
                         c= stack.pop();

                    if(c =='('){

                        output += new StringBuilder(reverse).reverse().toString();
                        reverse="";
                        stack.push('(');

                    }
                    else{
                        stack.push(')');
                    }

                }

                else{
                    stack.push(temp[i]);
                    if(temp[i-1]=='(')
                        arrayList.add(temp[i]);

                }
            }

            while(!stack.isEmpty()){
                reverse += stack.pop();
            }
            output+=new StringBuilder(reverse).reverse().toString();
            return output;
        }

}




