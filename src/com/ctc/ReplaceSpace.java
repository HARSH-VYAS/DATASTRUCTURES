package com.ctc;

/**
 * Created by Harsh P Vyas on 9/19/2016.
 */
public class ReplaceSpace {

    public char[] replace(char [] s, int length){

        int spaceCount=0,index,i=0;
        for(i=0;i<length;i++){
            if(s[i]==' ')
                spaceCount++;
        }
        index = length+ spaceCount*2;
        char [] temp = new char[index];

        if(length<s.length) s[length] = '\0';

        for(i=length-1;i>=0;i--){
            if(s[i]==' '){
                temp[index-1]='0';
                temp[index-2]='2';
                temp[index-3]='%';
                index-=3;
                System.out.println(index);
            }
            else{
                temp[index-1]=s[i];
                index--;
            }

        }


        return temp;
    }
}
