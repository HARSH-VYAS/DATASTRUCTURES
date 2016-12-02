package com.company;

import java.util.Stack;

/**
 * Created by Harsh P Vyas on 11/3/2016.

 Input: A full sentence: (S (NP (NNP James)) (VP (VBZ is) (NP (NP (DT a) (NN boy)) (VP (VBG eating) (NP (NNS sausages))))))
 Output: James is a boy eating sausages

 Input: (NNS Sausages)
 Output: Sausages

 Input: (NP(DT a) (NN boy))
 Output: a boy

 *
 *
 */
public class IBMParseTree {

        Stack<Character> stackP = new Stack<Character>();
        Stack<Character> stackS = new Stack<Character>();

        public void printTree(String s){
            char [] temp = s.toCharArray();
            int length = temp.length;
            for(int i =0;i<length;i++){
                if(temp[i]=='('){
                    stackP.push(temp[i]);
                }

            }
        }

}
