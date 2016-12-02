package com.codejam;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

/**
 * Created by Harsh P Vyas on 10/15/2016.


 You will be given a sequence of passages, and must filter out any passage whose text (sequence of whitespace-delimited words) is wholly contained as a sub-passage of one or more of the other passages.

 When comparing for containment, certain rules must be followed:

 The case of alphabetic characters should be ignored

 Leading and trailing whitespace should be ignored

 Any other block of contiguous whitespace should be treated as a single space

 non-alphanumeric character should be ignored, white space should be retained

 Duplicates must also be filtered - if two passages are considered equal with respect to the comparison rules listed above, only the shortest should be retained.
 If they are also the same length, the earlier one in the input sequence should be kept.
 The retained passages should be output in their original form (identical to the input passage), and in the same order.

 Input: For each test case a single line comprising the passages (strings) to be processed, delimited by | characters. The | characters are not considered part of any passage.

 Output: A single line of filtered passages in the same |-delimited format.

 Input: IBM cognitive computing|IBM "cognitive" computing is a revolution| ibm cognitive computing|'IBM Cognitive Computing' is a revolution? Output: IBM "cognitive" computing is a revolution
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 */
public class CompareParagraphs {

    public String compare(String s){

        String temp[] = s.split("\\|");
        System.out.println(temp.length);
        ArrayList<String> arrayList = new ArrayList<String>();
        String c [] = new String[temp.length];
        boolean checked [] = new boolean[temp.length];
        for(int i=0;i<temp.length;i++){
            c[i]= removeSpace(temp[i]);
        }
        for(int i=0;i<c.length;i++){
            for(int j=0;j<c.length;j++){
                if(i==j)
                    continue;
                if(c[j].toLowerCase().equals(c[i].toLowerCase())){

                    if(temp[i].length()==temp[j].length()){
                        if(i<j){
                            if(!arrayList.contains(temp[j]) && !checked[j]) {
                                arrayList.add(temp[j]);
                                checked[j]=true;
                                checked[i]=true;
                            }
                            break;
                        }
                        else{
                            if(!arrayList.contains(temp[j]) && !checked[j]) {
                                arrayList.add(temp[j]);
                                checked[j]=true;
                                checked[i]=true;
                            }
                            break;
                        }
                    }
                    else if(temp[i].length()<temp[j].length()){
                        if(!arrayList.contains(temp[i]) && !checked[i]) {
                            arrayList.add(temp[i]);
                            checked[i]=true;

                        }
                        break;
                    }
                    else{
                        if(!arrayList.contains(temp[j]) && !checked[j]) {
                            arrayList.add(temp[j]);
                            checked[j]=true;
                        }
                        break;
                    }
                }
                if(c[j].toLowerCase().contains(c[i].toLowerCase())){
                    if(!arrayList.contains(temp[j]) && !checked[j]) {
                        arrayList.add(temp[j]);
                        checked[j]=true;
                         }
                        break;
                }
            }

        }

        StringBuilder sb = new StringBuilder();
        for(int i=0;i<arrayList.size();i++){
            if(i==arrayList.size()-1 && arrayList.get(i)!=null)
                sb.append(arrayList.get(i));
            else if(arrayList.get(i)!=null)
                sb.append(arrayList.get(i)+"|");
        }

       return sb.toString();
    }

    public String removeSpace(String s){

        s= s.replaceAll("\\s+"," ");
        s=s.replaceAll("[^A-Za-z0-9\\s]","");
        s=s.trim();

        return s;
    }


}
