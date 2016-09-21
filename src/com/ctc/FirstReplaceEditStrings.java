package com.ctc;

/**
 * Created by Harsh P Vyas on 9/20/2016.
 */
public class FirstReplaceEditStrings {

    public boolean find(String s, String t){
        boolean result;
        if(s.length()==t.length()){
            result=checkEditReplace(s, t);
        }
        else if(s.length()-1==t.length()){
            result=checkEditInsert(s, t);
        }
        else if(s.length()==t.length()-1){
            result=checkEditInsert(s, t);
        }
        else{
            return false;
        }
        return result;
    }
    public boolean checkEditReplace(String s, String t){
        boolean var = false;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i) != t.charAt(i)){
                if(var)
                    return false;
                var=true;
           }
        }
        return true;
    }

    public boolean checkEditInsert(String s, String t){
        int indx1=0;
        int indx2=0;
        while(indx2<t.length() && indx1<s.length()){
            if(s.charAt(indx1) !=t.charAt(indx2)){
                if(indx1!=indx2)
                    return false;
                indx2++;
            }
            else{
                indx1++;
                indx2++;
            }

        }

        return true;
    }
}
