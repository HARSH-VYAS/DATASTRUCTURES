package com.codejam;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

/**
 * Created by Harsh P Vyas on 4/15/2016.
 *
 * I am taking all the numbers as integer so it will consider the outString of 0 as (lessNumber/higherNumber).
 * It outputs null if the target is not reachable.
 * I tried to use dynamic programming and breaking the whole array of values into subsets and trying the different operators
 * to get the desired target value.
 * So in the first iteration my array is divided into two subsets arr[0]=targetNumber and arr[1..length]
 *  After that using the targetNumber value, I tried to achieve different combination of operators to reach target.
 */
public class FindOperation {

    public static void main(String[] args) {

        int target = Integer.parseInt(args[0]);
        ArrayList<Integer> input = new ArrayList<Integer>();
        int count=0;

        try {

        for (int i = 1; i < args.length; i++) {
            input.add(Integer.parseInt(args[i]));
        }

            Collections.sort(input,Collections.reverseOrder());

        for (Integer integer : input) {

            List<Integer> firstList = new ArrayList<Integer>(input);
            // create a subset of the given array.
            firstList.remove(integer);

            Ans ans = getOpExitstance(firstList, integer, target);

            if (ans.isSuccess) {
                System.out.println("((("+integer + ans.outString+")");
                return;
            }
            else{
                System.out.println("None");
                break;
            }
        }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static class Ans {
        public String outString;
        public boolean isSuccess;
    }


    public static Ans getOpExitstance(List<Integer> numbers, int tackleNumber, int target) {

       // HashMap<Boolean,String> midAns = new HashMap<Boolean, String>();

            Ans midAns = new Ans();

            if (tackleNumber == target) {

                midAns.isSuccess = true;
                midAns.outString ="";
                return midAns;

            }
            for (Integer number : numbers) {

                List<Integer> newList = new ArrayList<Integer>(numbers);

                newList.remove(number);

                if (newList.isEmpty()) {

                    if (tackleNumber - number == target) {

                        midAns.isSuccess = true;
                        midAns.outString = "-" + number;

                        return midAns;
                    }
                    if (tackleNumber + number == target) {

                        midAns.isSuccess = true;
                        midAns.outString = "+" + number;
                        return midAns;
                    }
                    if (tackleNumber * number == target) {

                        midAns.isSuccess = true;
                        midAns.outString = "*" + number;

                        return midAns;
                    }
                    if (tackleNumber / number == target) {

                        midAns.isSuccess = true;
                        midAns.outString = "/" + number;

                        return midAns;
                    }

                    midAns.isSuccess = false;
                    midAns.outString = "f" + number;
                    return midAns;

                } else {

                    midAns = getOpExitstance(newList, tackleNumber - number, target);

                    if (midAns.isSuccess) {

                        midAns.outString = "-"+ number + ")" + midAns.outString ;
                        return midAns;
                    }

                    midAns = getOpExitstance(newList, tackleNumber + number, target);

                    if (midAns.isSuccess) {

                        midAns.outString = "+"+number +")" + midAns.outString;
                        return midAns;
                    }

                    midAns = getOpExitstance(newList, tackleNumber * number, target);

                    if (midAns.isSuccess) {

                        midAns.outString = "*" +number +")"+ midAns.outString ;
                        return midAns;
                    }

                    midAns = getOpExitstance(newList, tackleNumber / number, target);

                    if (midAns.isSuccess) {

                        midAns.outString = "/" + number + ")" + midAns.outString;
                        return midAns;
                    }

                }

            }
            return midAns;

    }
}
