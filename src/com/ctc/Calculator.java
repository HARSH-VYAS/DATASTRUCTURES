package com.ctc;

import java.util.Stack;

/**
 * Created by Harsh P Vyas on 11/23/2016.
 */
public class Calculator {


    public int calculate(String s){

        int result =0;

        Stack<Integer> numbers = new Stack<Integer>();
        Stack<Character> operators = new Stack<Character>();
        char [] charSeq = s.toCharArray();

        int length = charSeq.length;

        for(int i=0;i<length;i++){
            if( (((int)charSeq[i]) >=48) && (((int)charSeq[i]) <=57)){
                numbers.push((Character.getNumericValue(charSeq[i])));
                continue;
            }
            if(charSeq[i]=='+' || charSeq[i]=='-'){
                if(numbers.size()>=2){
                    int number1 = numbers.pop();
                    int number2 = numbers.pop();
                    char opn = operators.pop();
                    if(opn == '-'){
                        numbers.push(number2-number1);
                    }
                    else{
                        numbers.push(number2+number1);
                    }
                    operators.push(charSeq[i]);
                }
                else
                    operators.push(charSeq[i]);
                continue;
            }
            if(charSeq[i] == '*'){
               if(!numbers.isEmpty()){
                   int number1 = numbers.pop();
                   int number2 = Character.getNumericValue(charSeq[i+1]);
                   result = number1 * number2;
                   numbers.push(result);
                   i=i+1;
               }
               else{
                   return -1;
               }
            }

            if(charSeq[i] == '/'){
                if(!numbers.isEmpty()){
                    int number1 = numbers.pop();
                    int number2 = Character.getNumericValue(charSeq[i+1]);
                    result = number1 / number2;
                    numbers.push(result);
                    i=i+1;
                }
                else{
                    return -1;
                }
            }

        }
        result =0;
        while((!numbers.isEmpty()) && (!operators.isEmpty())){

            int number1 = numbers.pop();
            int number2 = numbers.pop();
            char opn = operators.pop();

            if(opn == '-'){
                numbers.push(number2-number1);
            }
            else{
                numbers.push(number2+number1);
            }
        }
        return numbers.peek();
    }
}
